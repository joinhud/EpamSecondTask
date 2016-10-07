package com.epam.second.exception;

public class GiftLogicException extends Exception {
    public GiftLogicException() {
        super();
    }

    public GiftLogicException(String message) {
        super(message);
    }

    public GiftLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public GiftLogicException(Throwable cause) {
        super(cause);
    }

    protected GiftLogicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
