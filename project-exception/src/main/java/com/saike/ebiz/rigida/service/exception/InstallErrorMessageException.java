package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.INSTALL_ERROR_MESSAGE_CODE)
public class InstallErrorMessageException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public InstallErrorMessageException() {
        this(RigidaErrorCode.INSTALL_ERROR_MESSAGE.getExceptionDescription(),null);
    }

    public InstallErrorMessageException(Throwable cause) {
        this(null, cause);
    }

    public InstallErrorMessageException(String message) {
        this(message, null);
    }

    public InstallErrorMessageException(String message, Throwable cause) {
        super(RigidaErrorCode.INSTALL_ERROR_MESSAGE, message, cause);
    }

}
