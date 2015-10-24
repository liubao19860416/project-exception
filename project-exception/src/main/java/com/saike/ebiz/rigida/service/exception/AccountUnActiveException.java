package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.ACCOUNT_UN_ACTIVE_CODE)
public class AccountUnActiveException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public AccountUnActiveException() {
        this(RigidaErrorCode.ACCOUNT_UN_ACTIVE.getExceptionDescription(), null);
    }

    public AccountUnActiveException(Throwable cause) {
        this(null, cause);
    }

    public AccountUnActiveException(String message) {
        this(message, null);
    }

    public AccountUnActiveException(String message, Throwable cause) {
        super(RigidaErrorCode.ACCOUNT_UN_ACTIVE, message, cause);
    }

}
