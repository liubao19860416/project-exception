package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.LOGOUT_ERROR_MESSAGE_CODE)
public class LogoutErrorMessageException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public LogoutErrorMessageException() {
        this(RigidaErrorCode.LOGOUT_ERROR_MESSAGE.getExceptionDescription(), null);
    }

    public LogoutErrorMessageException(Throwable cause) {
        this(null, cause);
    }

    public LogoutErrorMessageException(String message) {
        this(message, null);
    }

    public LogoutErrorMessageException(String message, Throwable cause) {
        super(RigidaErrorCode.LOGOUT_ERROR_MESSAGE, message, cause);
    }

}
