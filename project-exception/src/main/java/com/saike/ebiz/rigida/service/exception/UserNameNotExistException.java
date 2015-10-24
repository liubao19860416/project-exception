package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.USER_NAME_NOT_EXIST_CODE)
public class UserNameNotExistException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public UserNameNotExistException() {
        this(RigidaErrorCode.USER_NAME_NOT_EXIST.getExceptionDescription(),null);
    }

    public UserNameNotExistException(Throwable cause) {
        this(null, cause);
    }

    public UserNameNotExistException(String message) {
        this(message, null);
    }

    public UserNameNotExistException(String message, Throwable cause) {
        super(RigidaErrorCode.USER_NAME_NOT_EXIST, message, cause);
    }

}
