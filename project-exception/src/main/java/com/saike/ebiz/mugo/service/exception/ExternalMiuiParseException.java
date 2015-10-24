package com.saike.ebiz.mugo.service.exception;

import com.meidusa.venus.annotations.RemoteException;
import com.saike.ebiz.wireless.venus.error.MugoErrorCode;

@RemoteException(errorCode = MugoErrorCode.EXTERNAL_MIUI_PARSE_CODE)
public class ExternalMiuiParseException extends MugoException {

    private static final long serialVersionUID = -9021205550423460992L;

    public ExternalMiuiParseException() {
        this(MugoErrorCode.EXTERNAL_MIUI_PARSE.getExceptionDescription(), null);
    }

    public ExternalMiuiParseException(Throwable cause) {
        this(null, cause);
    }

    public ExternalMiuiParseException(String message) {
        this(message, null);
    }

    public ExternalMiuiParseException(String message, Throwable cause) {
        super(MugoErrorCode.EXTERNAL_MIUI_PARSE, message, cause);
    }

}
