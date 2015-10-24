package com.saike.ebiz.grape.service.exception;

import com.saike.ebiz.wireless.service.exception.BaseException;
import com.saike.ebiz.wireless.venus.error.GrapeErrorCode;

public abstract class GrapeException extends BaseException {

    private static final long serialVersionUID = -5096765675606702706L;

    public GrapeException(GrapeErrorCode errorCode) {
        this(errorCode, null, null);
    }

    public GrapeException(GrapeErrorCode errorCode, Throwable cause) {
        this(errorCode, null, cause);
    }

    public GrapeException(GrapeErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    public GrapeException(GrapeErrorCode errorCode, String message,
            Throwable cause) {

        super(errorCode, message, cause);
    }

    @Override
    public GrapeErrorCode getErrorCode() {
        return (GrapeErrorCode) super.getErrorCode();
    }

}
