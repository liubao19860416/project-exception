package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.EMAIL_SEND_CODE)
public class EmailSendException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public EmailSendException() {
        this(RigidaErrorCode.EMAIL_SEND.getExceptionDescription(), null);
    }

    public EmailSendException(Throwable cause) {
        this(null, cause);
    }

    public EmailSendException(String message) {
        this(message, null);
    }

    public EmailSendException(String message, Throwable cause) {
        super(RigidaErrorCode.EMAIL_SEND, message, cause);
    }

}
