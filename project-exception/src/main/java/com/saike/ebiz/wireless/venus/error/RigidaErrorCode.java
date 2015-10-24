package com.saike.ebiz.wireless.venus.error;

public final class RigidaErrorCode extends ErrorCode {

    public final static String SYSTEM_NAME = "RIGIDA";

    public final static int SYSTEM_CODE = 311;

    public final static String MODULE_NAME_USERSERVICE = "USERSERVICE";

    public final static String MODULE_NAME_DEVICESERVICE = "DEVICESERVICE";

    // USER_NAME_NOT_FOUND
    public final static int USER_NAME_NOT_FOUND_CODE = 31101007;

    public final static RigidaErrorCode USER_NAME_NOT_FOUND = new RigidaErrorCode(
            USER_NAME_NOT_FOUND_CODE, MODULE_NAME_USERSERVICE, "用户名无法找到！");

    // TRYNUM_LIMITED
    public final static int TRYNUM_LIMITED_CODE = 31101008;

    public final static RigidaErrorCode TRYNUM_LIMITED = new RigidaErrorCode(
            TRYNUM_LIMITED_CODE, MODULE_NAME_USERSERVICE, "密码输入错误次数过多，账户已锁！");

    // EMAIL_SEND
    public final static int EMAIL_SEND_CODE = 31101009;

    public final static RigidaErrorCode EMAIL_SEND = new RigidaErrorCode(
            EMAIL_SEND_CODE, MODULE_NAME_USERSERVICE, "验证邮件发送失败！");

    // SMS_SEND
    public final static int SMS_SEND_CODE = 31101010;

    public final static RigidaErrorCode SMS_SEND = new RigidaErrorCode(
            SMS_SEND_CODE, MODULE_NAME_USERSERVICE, "短信验证码发送失败！");

    // ARGUMENT_ERROR
    public final static int ARGUMENT_ERROR_CODE = 31101011;

    public final static RigidaErrorCode ARGUMENT_ERROR = new RigidaErrorCode(
            ARGUMENT_ERROR_CODE, MODULE_NAME_USERSERVICE, "參数错误！");

    // CAPTCHA_ERROR
    public final static int CAPTCHA_ERROR_CODE = 31101012;

    public final static RigidaErrorCode CAPTCHA_ERROR = new RigidaErrorCode(
            CAPTCHA_ERROR_CODE, MODULE_NAME_USERSERVICE, "验证码不正确");

    // CAPTCHA_INVALID
    public final static int CAPTCHA_INVALID_CODE = 31101013;

    public final static RigidaErrorCode CAPTCHA_INVALID = new RigidaErrorCode(
            CAPTCHA_INVALID_CODE, MODULE_NAME_USERSERVICE, "验证码失效");

    // ACCOUNT_UN_ACTIVE
    public final static int ACCOUNT_UN_ACTIVE_CODE = 31101014;

    public final static RigidaErrorCode ACCOUNT_UN_ACTIVE = new RigidaErrorCode(
            ACCOUNT_UN_ACTIVE_CODE, MODULE_NAME_USERSERVICE, "帐户存在未激活");

    // ACCOUNT_NOT_EXIST
    public final static int ACCOUNT_NOT_EXIST_CODE = 31101015;

    public final static RigidaErrorCode ACCOUNT_NOT_EXIST = new RigidaErrorCode(
            ACCOUNT_NOT_EXIST_CODE, MODULE_NAME_USERSERVICE, "帐户不存在");

    // USER_NOT_LOGIN
    public final static int USER_NOT_LOGIN_CODE = 31101016;

    public final static RigidaErrorCode USER_NOT_LOGIN = new RigidaErrorCode(
            USER_NOT_LOGIN_CODE, MODULE_NAME_USERSERVICE, "用户未登陆");

    // USER_NAME_EXIST
    public final static int USER_NAME_EXIST_CODE = 31101017;

    public final static RigidaErrorCode USER_NAME_EXIST = new RigidaErrorCode(
            USER_NAME_EXIST_CODE, MODULE_NAME_USERSERVICE, "用户名已注册！");

    // MOBILEPHONE_EXIST
    public final static int MOBILEPHONE_EXIST_CODE = 31101018;

    public final static RigidaErrorCode MOBILEPHONE_EXIST = new RigidaErrorCode(
            MOBILEPHONE_EXIST_CODE, MODULE_NAME_USERSERVICE, "手机号已注册！");

    // EMAIL_EXIST
    public final static int EMAIL_EXIST_CODE = 31101019;

    public final static RigidaErrorCode EMAIL_EXIST = new RigidaErrorCode(
            EMAIL_EXIST_CODE, MODULE_NAME_USERSERVICE, "邮箱已注册！");

    // EMAIL_NOT_EXIST
    public final static int EMAIL_NOT_EXIST_CODE = 31101020;

    public final static RigidaErrorCode EMAIL_NOT_EXIST = new RigidaErrorCode(
            EMAIL_NOT_EXIST_CODE, MODULE_NAME_USERSERVICE, "邮箱不存在！");

    // USER_NAME_NOT_EXIST
    public final static int USER_NAME_NOT_EXIST_CODE = 31101021;

    public final static RigidaErrorCode USER_NAME_NOT_EXIST = new RigidaErrorCode(
            USER_NAME_NOT_EXIST_CODE, MODULE_NAME_USERSERVICE, "用户名不存在！");

    // MOBILEPHONE_NOT_EXIST
    public final static int MOBILEPHONE_NOT_EXIST_CODE = 31101022;

    public final static RigidaErrorCode MOBILEPHONE_NOT_EXIST = new RigidaErrorCode(
            MOBILEPHONE_NOT_EXIST_CODE, MODULE_NAME_USERSERVICE, "手机号不存在！");

    // SEND_VALICODE_FAILURE
    public final static int SEND_VALICODE_FAILURE_CODE = 31101023;

    public final static RigidaErrorCode SEND_VALICODE_FAILURE = new RigidaErrorCode(
            SEND_VALICODE_FAILURE_CODE, MODULE_NAME_USERSERVICE, "验证信息发送失败！");

    // LOGOUT_ERROR_MESSAGE
    public final static int LOGOUT_ERROR_MESSAGE_CODE = 31101024;

    public final static RigidaErrorCode LOGOUT_ERROR_MESSAGE = new RigidaErrorCode(
            LOGOUT_ERROR_MESSAGE_CODE, MODULE_NAME_USERSERVICE, "注销失败！");

    // RESET_PASSWORD_FAILURE
    public final static int RESET_PASSWORD_FAILURE_CODE = 31101025;

    public final static RigidaErrorCode RESET_PASSWORD_FAILURE = new RigidaErrorCode(
            RESET_PASSWORD_FAILURE_CODE, MODULE_NAME_USERSERVICE, "密码设置失败！");

    // UN_LOGIN
    public final static int UN_LOGIN_CODE = 31101026;

    public final static RigidaErrorCode UN_LOGIN = new RigidaErrorCode(
            UN_LOGIN_CODE, MODULE_NAME_USERSERVICE, "当前未登陆");

    // CLIENT_ID_IS_NULL
    public final static int CLIENT_ID_IS_NULL_CODE = 31101027;

    public final static RigidaErrorCode CLIENT_ID_IS_NULL = new RigidaErrorCode(
            CLIENT_ID_IS_NULL_CODE, MODULE_NAME_USERSERVICE, "clientId不能为空");

    // INSTALL_ERROR_MESSAGE
    public final static int INSTALL_ERROR_MESSAGE_CODE = 31103002;

    public final static RigidaErrorCode INSTALL_ERROR_MESSAGE = new RigidaErrorCode(
            INSTALL_ERROR_MESSAGE_CODE, MODULE_NAME_DEVICESERVICE, "信息采集失败！");

    // this class only used to hold constant variables
    private RigidaErrorCode(int errorCode, String moduleName,String exceptionDescription) {
        super(errorCode, SYSTEM_NAME, moduleName, exceptionDescription);
    }

    private RigidaErrorCode(String moduleName, int moduleCode,int exceptionCode, String exceptionDescription) {
        super(SYSTEM_NAME, SYSTEM_CODE, moduleName, moduleCode, exceptionCode,exceptionDescription);
    }

}
