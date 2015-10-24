package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.MOBILEPHONE_NOT_EXIST_CODE)
public class MobilephoneNotExistException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public MobilephoneNotExistException() {
        this(RigidaErrorCode.MOBILEPHONE_NOT_EXIST.getExceptionDescription(),null);
    }

    public MobilephoneNotExistException(Throwable cause) {
        this(null, cause);
    }

    public MobilephoneNotExistException(String message) {
        this(message, null);
    }

    public MobilephoneNotExistException(String message, Throwable cause) {
        super(RigidaErrorCode.MOBILEPHONE_NOT_EXIST, message, cause);
    }

}
