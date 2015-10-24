package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.USER_NOT_LOGIN_CODE)
public class UserNotLoginException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public UserNotLoginException() {
        this(RigidaErrorCode.USER_NOT_LOGIN.getExceptionDescription(), null);
    }

    public UserNotLoginException(Throwable cause) {
        this(null, cause);
    }

    public UserNotLoginException(String message) {
        this(message, null);
    }

    public UserNotLoginException(String message, Throwable cause) {
        super(RigidaErrorCode.USER_NOT_LOGIN, message, cause);
    }

}
