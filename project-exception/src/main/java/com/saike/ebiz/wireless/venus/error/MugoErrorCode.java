package com.saike.ebiz.wireless.venus.error;

public final class MugoErrorCode extends ErrorCode {

    public final static String SYSTEM_NAME = "MUGO";

    public final static int SYSTEM_CODE = 314;

    public final static String MODULE_NAME_CONNECTION = "CONNECTION";

    public final static String MODULE_NAME_EXTERNAL = "EXTERNAL";

    // CONNECTION_NOT_FOUND
    public final static int CONNECTION_NOT_FOUND_CODE = 31410001;

    public final static MugoErrorCode CONNECTION_NOT_FOUND = new MugoErrorCode(
            CONNECTION_NOT_FOUND_CODE, MODULE_NAME_CONNECTION,
            "连接 Rigida 出错了，请稍后重试 ");

    // EXTERNAL_J_PUSH
    public final static int EXTERNAL_J_PUSH_CODE = 31420001;

    public final static MugoErrorCode EXTERNAL_J_PUSH = new MugoErrorCode(
            EXTERNAL_J_PUSH_CODE, MODULE_NAME_EXTERNAL, "极光推送 ");

    // EXTERNAL_MIUI_IO
    public final static int EXTERNAL_MIUI_IO_CODE = 31420002;

    public final static MugoErrorCode EXTERNAL_MIUI_IO = new MugoErrorCode(
            EXTERNAL_MIUI_IO_CODE, MODULE_NAME_EXTERNAL, "小米推送服务器读取文件出错了 ");

    // EXTERNAL_MIUI_PARSE
    public final static int EXTERNAL_MIUI_PARSE_CODE = 31420003;

    public final static MugoErrorCode EXTERNAL_MIUI_PARSE = new MugoErrorCode(
            EXTERNAL_MIUI_PARSE_CODE, MODULE_NAME_EXTERNAL, "小米推送服务器转换出错了 ");

    private MugoErrorCode(int errorCode, String moduleName,String exceptionDescription) {
        super(errorCode, SYSTEM_NAME, moduleName, exceptionDescription);
    }

    private MugoErrorCode(String moduleName, int moduleCode, int exceptionCode,String exceptionDescription) {
        super(SYSTEM_NAME, SYSTEM_CODE, moduleName, moduleCode, exceptionCode,exceptionDescription);
    }

}
