package com.epam.second.exception;

public class GiftActionLogicException extends Exception {
    public GiftActionLogicException() {
        super();
    }

    public GiftActionLogicException(String message) {
        super(message);
    }

    public GiftActionLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public GiftActionLogicException(Throwable cause) {
        super(cause);
    }

    protected GiftActionLogicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
