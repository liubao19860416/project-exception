package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.CAPTCHA_ERROR_CODE)
public class CaptchaErrorException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public CaptchaErrorException() {
        this(RigidaErrorCode.CAPTCHA_ERROR.getExceptionDescription(), null);
    }

    public CaptchaErrorException(Throwable cause) {
        this(null, cause);
    }

    public CaptchaErrorException(String message) {
        this(message, null);
    }

    public CaptchaErrorException(String message, Throwable cause) {
        super(RigidaErrorCode.CAPTCHA_ERROR, message, cause);
    }

}
