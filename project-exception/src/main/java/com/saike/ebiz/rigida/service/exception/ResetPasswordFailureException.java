package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.RESET_PASSWORD_FAILURE_CODE)
public class ResetPasswordFailureException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public ResetPasswordFailureException() {
        this(RigidaErrorCode.RESET_PASSWORD_FAILURE.getExceptionDescription(),null);
    }

    public ResetPasswordFailureException(Throwable cause) {
        this(null, cause);
    }

    public ResetPasswordFailureException(String message) {
        this(message, null);
    }

    public ResetPasswordFailureException(String message, Throwable cause) {

        super(RigidaErrorCode.RESET_PASSWORD_FAILURE, message, cause);
    }

}
