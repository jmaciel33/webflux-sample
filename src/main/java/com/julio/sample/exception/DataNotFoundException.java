package com.julio.sample.exception;

public class DataNotFoundException extends Exception {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = -1882500342330887423L;

    /**
     * Default constructor.
     *
     * @param message Error message.
     */
    public DataNotFoundException(String message) {
        super(message);
    }

    /**
     * NotFoundException Constructor with throwable
     *
     * @param message   Error message.
     * @param throwable The original exception thrown.
     */
    public DataNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
