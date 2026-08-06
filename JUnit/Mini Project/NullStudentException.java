package com.mile1.exception;

public class NullStudentException extends RuntimeException {

    public NullStudentException() {
        super("Student object cannot be null");
    }

    public NullStudentException(String message) {
        super(message);
    }
}
