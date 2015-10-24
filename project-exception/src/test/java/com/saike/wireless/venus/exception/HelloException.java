package com.saike.wireless.venus.exception;

import com.saike.ebiz.wireless.service.exception.BaseException;

public abstract class HelloException extends BaseException {

    private static final long serialVersionUID = -4418945625522410385L;

    public HelloException(HelloErrorCode errorCode) {
        this(errorCode, null, null);
    }

    public HelloException(HelloErrorCode errorCode, Throwable cause) {
        this(errorCode, null, cause);
    }

    public HelloException(HelloErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    public HelloException(HelloErrorCode errorCode, String message,Throwable cause) {
        super(errorCode, message, cause);
    }

    @Override
    public HelloErrorCode getErrorCode() {
        return (HelloErrorCode) super.getErrorCode();
    }

}
