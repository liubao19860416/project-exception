package com.saike.ebiz.${baseName}.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.${baseNameU1}ErrorCode;


@RemoteException( errorCode = ${baseNameU1}ErrorCode.${errorCode.name}_CODE )
public class ${errorCodeNameU1}Exception extends ${baseNameU1}Exception {

    private static final long serialVersionUID = -9021205550423460992L;

    public ${errorCodeNameU1}Exception() {
        
        this( ${baseNameU1}ErrorCode.${errorCode.name}
        		.getExceptionDescription(), null );
    }

    public ${errorCodeNameU1}Exception( Throwable cause ) {
        
        this( null, cause );
    }

    public ${errorCodeNameU1}Exception( String message ) {
        
        this( message, null );
    }

    public ${errorCodeNameU1}Exception( String message, Throwable cause ) {
        
        super( ${baseNameU1}ErrorCode.${errorCode.name}, 
                message, 
                cause );
    }
    
}
