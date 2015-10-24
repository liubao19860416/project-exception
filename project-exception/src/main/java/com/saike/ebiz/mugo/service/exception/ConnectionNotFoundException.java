package com.saike.ebiz.mugo.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.MugoErrorCode;

@RemoteException(errorCode = MugoErrorCode.CONNECTION_NOT_FOUND_CODE)
public class ConnectionNotFoundException extends MugoException {

    private static final long serialVersionUID = -9021205550423460992L;

    public ConnectionNotFoundException() {
        this(MugoErrorCode.CONNECTION_NOT_FOUND.getExceptionDescription(), null);
    }

    public ConnectionNotFoundException(Throwable cause) {

        this(null, cause);
    }

    public ConnectionNotFoundException(String message) {

        this(message, null);
    }

    public ConnectionNotFoundException(String message, Throwable cause) {

        super(MugoErrorCode.CONNECTION_NOT_FOUND, message, cause);
    }

}
