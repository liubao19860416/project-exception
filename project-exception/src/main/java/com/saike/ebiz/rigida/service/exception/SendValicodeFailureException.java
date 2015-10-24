package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.SEND_VALICODE_FAILURE_CODE)
public class SendValicodeFailureException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public SendValicodeFailureException() {
        this(RigidaErrorCode.SEND_VALICODE_FAILURE.getExceptionDescription(),null);
    }

    public SendValicodeFailureException(Throwable cause) {
        this(null, cause);
    }

    public SendValicodeFailureException(String message) {
        this(message, null);
    }

    public SendValicodeFailureException(String message, Throwable cause) {
        super(RigidaErrorCode.SEND_VALICODE_FAILURE, message, cause);
    }

}
