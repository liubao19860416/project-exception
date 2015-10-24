package com.saike.ebiz.rigida.service.exception;

import com.saike.ebiz.wireless.service.exception.BaseException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

public abstract class RigidaException extends BaseException {

    private static final long serialVersionUID = -5096765675606702707L;

    public RigidaException(RigidaErrorCode errorCode) {
        this(errorCode, null, null);
    }

    public RigidaException(RigidaErrorCode errorCode, Throwable cause) {
        this(errorCode, null, cause);
    }

    public RigidaException(RigidaErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    public RigidaException(RigidaErrorCode errorCode, String message,Throwable cause) {
        super(errorCode, message, cause);
    }

    @Override
    public RigidaErrorCode getErrorCode() {
        return (RigidaErrorCode) super.getErrorCode();
    }

}
