package Abstraction.ExceptionHandling;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}