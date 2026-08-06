package com.mile1.exception;

public class NullMarksArrayException extends RuntimeException {

    public NullMarksArrayException() {
        super("Marks array cannot be null");
    }

    public NullMarksArrayException(String message) {
        super(message);
    }
}
