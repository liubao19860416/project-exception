package com.saike.wireless.venus.exception;

import com.meidusa.venus.annotations.RemoteException;

@RemoteException(errorCode = HelloErrorCode.NOT_FOUND_CODE)
public class HelloNotFoundException extends HelloException {

    private static final long serialVersionUID = -9021205550423460992L;

    public HelloNotFoundException(String message) {
        super(HelloErrorCode.NOT_FOUND, message);
    }

}
