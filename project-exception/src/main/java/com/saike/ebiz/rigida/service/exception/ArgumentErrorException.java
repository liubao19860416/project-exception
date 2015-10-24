package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.ARGUMENT_ERROR_CODE)
public class ArgumentErrorException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public ArgumentErrorException() {
        this(RigidaErrorCode.ARGUMENT_ERROR.getExceptionDescription(), null);
    }

    public ArgumentErrorException(Throwable cause) {
        this(null, cause);
    }

    public ArgumentErrorException(String message) {
        this(message, null);
    }

    public ArgumentErrorException(String message, Throwable cause) {
        super(RigidaErrorCode.ARGUMENT_ERROR, message, cause);
    }

}
