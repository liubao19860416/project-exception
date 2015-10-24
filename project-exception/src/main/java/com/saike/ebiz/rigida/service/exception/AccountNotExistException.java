package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.ACCOUNT_NOT_EXIST_CODE)
public class AccountNotExistException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public AccountNotExistException() {
        this(RigidaErrorCode.ACCOUNT_NOT_EXIST.getExceptionDescription(), null);
    }

    public AccountNotExistException(Throwable cause) {
        this(null, cause);
    }

    public AccountNotExistException(String message) {
        this(message, null);
    }

    public AccountNotExistException(String message, Throwable cause) {
        super(RigidaErrorCode.ACCOUNT_NOT_EXIST, message, cause);
    }

}
