package com.saike.ebiz.rigida.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.RigidaErrorCode;

@RemoteException(errorCode = RigidaErrorCode.SMS_SEND_CODE)
public class SmsSendException extends RigidaException {

    private static final long serialVersionUID = -9021205550423460992L;

    public SmsSendException() {
        this(RigidaErrorCode.SMS_SEND.getExceptionDescription(), null);
    }

    public SmsSendException(Throwable cause) {
        this(null, cause);
    }

    public SmsSendException(String message) {
        this(message, null);
    }

    public SmsSendException(String message, Throwable cause) {
        super(RigidaErrorCode.SMS_SEND, message, cause);
    }

}
