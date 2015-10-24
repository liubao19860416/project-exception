package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.CLIENT_ID_IS_NULL_CODE)
public class ClientIdIsNullException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public ClientIdIsNullException() {
        this(RigidaErrorCode.CLIENT_ID_IS_NULL.getExceptionDescription(), null);
    }

    public ClientIdIsNullException(Throwable cause) {
        this(null, cause);
    }

    public ClientIdIsNullException(String message) {
        this(message, null);
    }

    public ClientIdIsNullException(String message, Throwable cause) {
        super(RigidaErrorCode.CLIENT_ID_IS_NULL, message, cause);
    }

}
