package com.cqwo.core;

/**
 * Created by cqnews on 2017/3/20.
 */
public class CWMException extends Exception{

    public CWMException() {
    }

    public CWMException(String message) {
        super(message);
    }

    public CWMException(String message, Throwable cause) {
        super(message, cause);
    }

    public CWMException(Throwable cause) {
        super(cause);
    }

    public CWMException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
