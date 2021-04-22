package com.servbytefooddelivery.service.exception;

public class ServbyteException extends Exception{
    public ServbyteException() {
        super();
    }

    public ServbyteException(String message) {
        super(message);
    }

    public ServbyteException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServbyteException(Throwable cause) {
        super(cause);
    }

    protected ServbyteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
