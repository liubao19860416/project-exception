package com.saike.wireless.venus.errorcode;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ErrorCodeAutoGenerate {

    private static Path ctxPath;

    public static Path contextPath() {
        if (ctxPath == null) {
            String path = Thread.currentThread().getContextClassLoader()
                    .getResource("").getPath();

            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            ctxPath = Paths.get(path);
        }
        return ctxPath;
    }

    public static void main(String[] args) {
        try {
            final Pattern p = Pattern
                    .compile("^([A-Za-z][_A-Za-z0-9]*)\\.json$");

            File dir = contextPath().toFile();

            for (String name : dir.list()) {
                Matcher m = p.matcher(name);
                if (m.matches()) {
                    System.out.println("start handling: " + m.group(1));
                    new ResourceProcessor(m.group(1)).process();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
