package com.saike.ebiz.wireless.venus.error;

public final class GrapeErrorCode extends ErrorCode {

    public final static String SYSTEM_NAME = "GRAPE";

    public final static int SYSTEM_CODE = 313;

    private GrapeErrorCode(int errorCode, String moduleName,String exceptionDescription) {
        super(errorCode, SYSTEM_NAME, moduleName, exceptionDescription);
    }

    private GrapeErrorCode(String moduleName, int moduleCode,int exceptionCode, String exceptionDescription) {
        super(SYSTEM_NAME, SYSTEM_CODE, moduleName, moduleCode, exceptionCode,
                exceptionDescription);
    }

}
