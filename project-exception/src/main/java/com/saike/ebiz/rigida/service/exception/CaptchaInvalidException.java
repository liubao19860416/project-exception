package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.CAPTCHA_INVALID_CODE)
public class CaptchaInvalidException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public CaptchaInvalidException() {
        this(RigidaErrorCode.CAPTCHA_INVALID.getExceptionDescription(), null);
    }

    public CaptchaInvalidException(Throwable cause) {
        this(null, cause);
    }

    public CaptchaInvalidException(String message) {
        this(message, null);
    }

    public CaptchaInvalidException(String message, Throwable cause) {
        super(RigidaErrorCode.CAPTCHA_INVALID, message, cause);
    }

}
