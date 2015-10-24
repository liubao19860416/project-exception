package com.saike.wireless.venus.errorcode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import com.google.gson.Gson;

public class ResourceProcessor extends SimpleFileVisitor<Path> {

    private final static Pattern P_TEMPLATE_NAME = Pattern
            .compile("(.+)\\.(v|V)$");

    private final static String FILE_INGORE_OF_NAME = "~.x";

    private final static String EXCEPTION_FILE_TPL_NAME = "${errorCodeNameU1}Exception.java";

    private final String baseName;
    private final String baseNameU1;

    private final Path basePath;
    private final Path baseOutputPath;

    private final VelocityEngine velocityEngine;
    private final VelocityContext velocityContext;

    private Map<String, Object> json;

    public ResourceProcessor(String baseName) {
        this.baseName = baseName;
        this.baseNameU1 = generateNameU1(baseName);

        Path ctxPath = ErrorCodeAutoGenerate.contextPath();

        this.baseOutputPath = ctxPath.getRoot().resolve(
                ctxPath.subpath(0, ctxPath.getNameCount() - 2).toString()
                        + "/src/main/java");
        // this.baseOutputPath = Paths.get( "d:/temp" );

        this.basePath = Paths.get(ctxPath.toString() + "/tpl");

        velocityEngine = new VelocityEngine();

        Properties properties = new Properties();

        properties.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH,
                this.basePath.toString());
        properties.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
        properties.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
        properties.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");

        velocityEngine.init(properties);

        velocityContext = new VelocityContext();
        velocityContext.put("baseName", baseName);
        velocityContext.put("baseNameU1", baseNameU1);
        velocityContext.put("D", "$");
        velocityContext
                .put("currentDatetime", new SimpleDateFormat(
                        "yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance()
                        .getTime()));

        try {
            this.json = loadJson();
            for (String key : json.keySet()) {
                velocityContext.put(key, json.get(key));
            }
        } catch (Exception ex) {
            throw new RuntimeException("cannot load the file: " + this.baseName
                    + ".json", ex);
        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attributes)
            throws IOException {

        if ((FILE_INGORE_OF_NAME).equals(String.valueOf(file.getFileName()))) {
            return FileVisitResult.CONTINUE;
        }

        if (attributes.isRegularFile()) {
            System.out
                    .println("  "
                            + file.subpath(basePath.getNameCount(),
                                    file.getNameCount()).toString());
            handleFile(file);
        } else {
            System.out.println(" ~ignore: " + file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        System.out.println("> " + dir.getFileName());
        int bc = basePath.getNameCount();
        int dc = dir.getNameCount();
        if (dc > bc) {
            Path destPath = Paths.get(evaluateFileName(
                    this.velocityContext,
                    Paths.get(baseOutputPath.toString() + "/"
                            + (dc - bc > 1 ? dir.subpath(bc, dc - 1) : "")
                            + "/" + String.valueOf(dir.getFileName()))));
            if (!Files.exists(destPath)) {
                Files.createDirectory(destPath);
            }
        }
        return FileVisitResult.CONTINUE;
    }

    /*
     * @Override public FileVisitResult postVisitDirectory( Path dir,
     * IOException ex ) throws IOException { if( ex != null ) { throw ex; }
     * System.out.println( "< " + dir.getFileName() ); return
     * FileVisitResult.CONTINUE; }
     */

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException ioe)
            throws IOException {
        System.out.println("Exception on handling : " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    public void process() {
        try {
            System.out.println(">>>>>>>>>>>>>>>>>>>");
            Files.walkFileTree(basePath, this);
            System.out.println(">>>>>>>>>>>>>>>>>>>");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private void handleFile(Path file) throws IOException {
        int c0 = basePath.getNameCount();
        int c1 = file.getNameCount();

        String path0 = baseOutputPath.toString()
                + (c1 - c0 > 1 ? "/" + file.subpath(c0, c1 - 1) : "");

        Matcher mh = P_TEMPLATE_NAME
                .matcher(String.valueOf(file.getFileName()));

        if (mh.matches()) {
            String fileName = mh.group(1);
            handleTempleFile(file, Paths.get(path0 + "/" + fileName));
        } else {
            Path destFile = Paths
                    .get(evaluateFileName(
                            this.velocityContext,
                            Paths.get(path0 + "/"
                                    + String.valueOf(file.getFileName()))));

            if (Files.exists(destFile)) {
                Files.delete(destFile);
            }

            Files.copy(file, destFile);
        }
    }

    private void handleTempleFile(Path file, Path outputFile)
            throws IOException {

        Template template = velocityEngine.getTemplate(String.valueOf(file
                .subpath(basePath.getNameCount(), file.getNameCount())));

        Path targetFile = Paths.get(evaluateFileName(this.velocityContext,
                outputFile));

        if ((EXCEPTION_FILE_TPL_NAME + ".v").equals(String.valueOf(file
                .getFileName()))) {
            generateExceptionFiles(template,
                    this.baseOutputPath.resolve(targetFile.subpath(
                            this.baseOutputPath.getNameCount(),
                            targetFile.getNameCount() - 1)));
        } else {
            generateFileWithTemplate(template, this.velocityContext, targetFile);
        }
    }

    private void generateFileWithTemplate(Template template,
            VelocityContext vctx, Path targetFile) throws IOException {

        if (Files.exists(targetFile)) {
            Files.delete(targetFile);
        }

        try (BufferedWriter writer = Files.newBufferedWriter(
                Files.createFile(targetFile), Charset.forName("UTF-8"))) {

            if (template != null) {
                template.merge(vctx, writer);
            }

            writer.flush();
        }
    }

    private void generateExceptionFiles(Template template, Path destPath)
            throws IOException {

        VelocityContext vctx = new VelocityContext(this.velocityContext);

        for (Map<String, Object> module : (List<Map<String, Object>>) this.json
                .get("modules")) {
            for (Map<String, Object> errorCode : (List<Map<String, Object>>) module
                    .get("errorCodes")) {

                String errorCodeName = generateErrorCodeName((String) errorCode
                        .get("name"));

                vctx.put("module", module);
                vctx.put("errorCode", errorCode);
                vctx.put("errorCodeName", errorCodeName);
                vctx.put("errorCodeNameU1", generateNameU1(errorCodeName));

                generateFileWithTemplate(
                        template,
                        vctx,
                        destPath.resolve(evaluate(vctx, EXCEPTION_FILE_TPL_NAME)));
            }
        }
    }

    private String generateErrorCodeName(String name) {
        name = name.toLowerCase();
        StringBuilder s = new StringBuilder();
        boolean b = false;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (i > 0 && '_' == c) {
                b = true;
                continue;
            }
            s.append(b ? String.valueOf(c).toUpperCase() : String.valueOf(c));
            b = false;
        }
        return s.toString();
    }

    protected static String generateNameU1(String name) {
        return name.length() == 1 ? name.toUpperCase() : String.valueOf(
                name.charAt(0)).toUpperCase()
                + name.substring(1);
    }

    private String evaluate(VelocityContext vctx, String initStr) {
        StringWriter swr = new StringWriter();

        // evaluate file name
        velocityEngine.evaluate(vctx, swr, baseName, initStr);
        return swr.toString();
    }

    private String evaluateFileName(VelocityContext vctx, Path file) {
        StringWriter swr = new StringWriter();
        Iterator<Path> iterator = file.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            if (b) {
                swr.write("/");
            }
            velocityEngine.evaluate(vctx, swr, baseName,
                    String.valueOf(iterator.next().getFileName()));
            b = true;
        }
        return file.getRoot() + "/" + swr.toString();
    }

    private Map<String, Object> loadJson() throws IOException {
        return new Gson().fromJson(Files.newBufferedReader(
                basePath.resolve("../" + this.baseName + ".json"),
                Charset.forName("UTF-8")), HashMap.class);
    }

}
