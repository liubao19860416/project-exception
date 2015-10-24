package com.saike.wireless.venus.exception;

import com.saike.ebiz.wireless.venus.error.ErrorCode;

public class HelloErrorCode extends ErrorCode {

    public final static String SYSTEM_NAME = "HELLO";

    public final static int SYSTEM_CODE = 111;

    public final static String MODULE_NAME_COMMON = "COMMON";
    public final static String MODULE_NAME_OTHER = "OTHER";

    // not found
    public final static int NOT_FOUND_CODE = 11101001;

    public final static HelloErrorCode NOT_FOUND = new HelloErrorCode(
            NOT_FOUND_CODE, MODULE_NAME_COMMON, "demonstration");

    // zero
    public final static int ZERO_CODE = 11100000;
    public final static HelloErrorCode ZERO = new HelloErrorCode(ZERO_CODE,
            MODULE_NAME_OTHER, "demonstration");

    private HelloErrorCode(int errorCode, String moduleName,String exceptionDescription) {
        super(errorCode, SYSTEM_NAME, moduleName, exceptionDescription);
    }

    protected HelloErrorCode(String moduleName, int moduleCode,
            int exceptionCode, String exceptionDescription) {
        super(SYSTEM_NAME, SYSTEM_CODE, moduleName, moduleCode, exceptionCode,exceptionDescription);
    }

}
