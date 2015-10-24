package com.saike.ebiz.wireless.service.exception;

import com.saike.ebiz.wireless.venus.error.ErrorCode;

/**
 * 基础的exception
 * 
 * @author Liubao
 * @2014年12月4日
 * 
 */
public abstract class BaseException extends Exception {

    private static final long serialVersionUID = 9201779957510320596L;

    private ErrorCode errorCode;

    public BaseException(ErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public BaseException(String errorCode, String message) {
        // TODO Auto-generated constructor stub
    }

    public BaseException(String errorCode, String message, Throwable cause) {
        // TODO Auto-generated constructor stub
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
