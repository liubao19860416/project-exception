package com.saike.ebiz.mugo.service.exception;

import com.saike.ebiz.wireless.service.exception.BaseException;
import com.saike.ebiz.wireless.venus.error.MugoErrorCode;

public abstract class MugoException extends BaseException {

    private static final long serialVersionUID = -5096765675606702707L;

    public MugoException(MugoErrorCode errorCode) {
        this(errorCode, null, null);
    }

    public MugoException(MugoErrorCode errorCode, Throwable cause) {
        this(errorCode, null, cause);
    }

    public MugoException(MugoErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    public MugoException(MugoErrorCode errorCode, String message,Throwable cause) {
        super(errorCode, message, cause);
    }

    @Override
    public MugoErrorCode getErrorCode() {
        return (MugoErrorCode) super.getErrorCode();
    }

}
