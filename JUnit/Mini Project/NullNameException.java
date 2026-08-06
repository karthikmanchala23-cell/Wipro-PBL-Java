package com.mile1.exception;

public class NullNameException extends RuntimeException {

    public NullNameException() {
        super("Student name cannot be null");
    }

    public NullNameException(String message) {
        super(message);
    }
}
