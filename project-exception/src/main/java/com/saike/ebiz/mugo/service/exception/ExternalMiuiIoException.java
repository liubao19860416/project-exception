package com.saike.ebiz.mugo.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.MugoErrorCode;

@RemoteException(errorCode = MugoErrorCode.EXTERNAL_MIUI_IO_CODE)
public class ExternalMiuiIoException extends MugoException {

    private static final long serialVersionUID = -9021205550423460992L;

    public ExternalMiuiIoException() {
        this(MugoErrorCode.EXTERNAL_MIUI_IO.getExceptionDescription(), null);
    }

    public ExternalMiuiIoException(Throwable cause) {
        this(null, cause);
    }

    public ExternalMiuiIoException(String message) {
        this(message, null);
    }

    public ExternalMiuiIoException(String message, Throwable cause) {
        super(MugoErrorCode.EXTERNAL_MIUI_IO, message, cause);
    }

}
