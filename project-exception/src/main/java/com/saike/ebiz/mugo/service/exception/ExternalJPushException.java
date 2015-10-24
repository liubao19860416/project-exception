package com.saike.ebiz.mugo.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.MugoErrorCode;

/**
 * 注意注解信息
 * @author Liubao
 * @2014年12月4日
 *
 */
@RemoteException( errorCode = MugoErrorCode.EXTERNAL_J_PUSH_CODE )
public class ExternalJPushException extends MugoException {

    private static final long serialVersionUID = -9021205550423460992L;

    public ExternalJPushException() {
        this( MugoErrorCode.EXTERNAL_J_PUSH.getExceptionDescription(), null );
    }

    public ExternalJPushException( Throwable cause ) {
        this( null, cause );
    }

    public ExternalJPushException( String message ) {
        this( message, null );
    }

    public ExternalJPushException( String message, Throwable cause ) {
        super( MugoErrorCode.EXTERNAL_J_PUSH,message, cause );
    }
    
}
