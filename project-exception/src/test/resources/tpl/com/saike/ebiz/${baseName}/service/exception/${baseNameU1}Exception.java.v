package com.saike.ebiz.${baseName}.service.exception;

import com.saike.ebiz.wireless.venus.error.${baseNameU1}ErrorCode;
import com.saike.ebiz.wireless.service.exception.BaseException;


public abstract class ${baseNameU1}Exception extends BaseException {

    private static final long serialVersionUID = -5096765675606702707L;

    public ${baseNameU1}Exception( ${baseNameU1}ErrorCode errorCode ) {
        
        this( errorCode, null, null );
    }

    public ${baseNameU1}Exception( ${baseNameU1}ErrorCode errorCode, 
            Throwable cause ) {
        
        this( errorCode, null, cause );
    }

    public ${baseNameU1}Exception( ${baseNameU1}ErrorCode errorCode, 
            String message ) {
        
        this( errorCode, message, null );
    }

    public ${baseNameU1}Exception( ${baseNameU1}ErrorCode errorCode, 
            String message,
            Throwable cause ) {
        
        super( errorCode, message, cause );
    }
    
    @Override
    public ${baseNameU1}ErrorCode getErrorCode() {
        return ( ${baseNameU1}ErrorCode )super.getErrorCode();
    }
    
}
