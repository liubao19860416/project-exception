package com.saike.ebiz.wireless.venus.error;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 基础的errorcode操作类
 * @author Liubao
 * @2014年12月4日
 *
 */
public abstract class ErrorCode {

    private final static String SYSTEM_CODE_PATTERN = "000";
    private final static String MODULE_CODE_PATTERN = "00";
    private final static String ERROR_CODE_PATTERN = "000";

    private final static Pattern P_CODE_FORMAT = Pattern
            .compile("(^\\d{3})(\\d{2})(\\d{3}$)");

    private final String systemName;
    private final int systemCode;

    private final String moduleName;
    private final int moduleCode;

    private final int exceptionNumber;
    private final int exceptionCode;
    private final String exceptionDescription;

    protected ErrorCode(int fullCode, String systemName, String moduleName,
            String exceptionDescription) {
        int[] codes = splitCode(fullCode);
        this.systemName = systemName;
        this.systemCode = codes[0];
        this.moduleName = moduleName;
        this.moduleCode = codes[1];
        this.exceptionCode = codes[2];
        this.exceptionDescription = exceptionDescription;

        this.exceptionNumber = composeExceptionNumber(systemCode, moduleCode,exceptionCode);
    }

    protected ErrorCode(String systemName, int systemCode, String moduleName,
            int moduleCode, int exceptionCode, String exceptionDescription) {
        this.systemName = systemName;
        this.systemCode = systemCode;
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.exceptionCode = exceptionCode;
        this.exceptionDescription = exceptionDescription;

        this.exceptionNumber = composeExceptionNumber(systemCode, moduleCode,exceptionCode);
    }
    
    /**
     * 拼装出完整的错误代码
     */
    final protected int composeExceptionNumber(int systemCode, int moduleCode,int exceptionCode) {
        return Integer.valueOf(formatSystemCode(systemCode) + formatModuleCode(moduleCode)
                + formatExceptionCode(exceptionCode));
    }

    /**
     * 拆分code拆分字符串
     * @param code
     * @return int[] - [0]: systemCode, [1]: moduleCode, [2]: exceptionCode
     */
    final protected int[] splitCode(int code) {
        int[] rt = new int[] { -1, -1, -1 };
        Matcher mt = P_CODE_FORMAT.matcher(String.valueOf(code));
        if (mt.matches()) {
            rt[0] = Integer.valueOf(mt.group(1));
            rt[1] = Integer.valueOf(mt.group(2));
            rt[2] = Integer.valueOf(mt.group(3));
        } else {
            throw new IllegalArgumentException("code \"" + code
                    + "\" is invalid!");
        }
        return rt;
    }

    protected String formatCode(int code, String pattern) {
        return new DecimalFormat(pattern).format(code);
    }
    
    protected String formatModuleCode(int code) {
        return formatCode(code, MODULE_CODE_PATTERN);
    }

    protected String formatExceptionCode(int code) {
        return formatCode(code, ERROR_CODE_PATTERN);
    }

    protected String formatSystemCode(int code) {
        return formatCode(code, SYSTEM_CODE_PATTERN);
    }
    
    /**
     * set/get方法
     */
    public String getSystemName() {
        return systemName;
    }

    public int getSystemCode() {
        return systemCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getModuleCode() {
        return moduleCode;
    }

    public int getExceptionNumber() {
        return exceptionNumber;
    }

    public int getExceptionCode() {
        return exceptionCode;
    }

    public String getExceptionDescription() {
        return exceptionDescription;
    }

}
