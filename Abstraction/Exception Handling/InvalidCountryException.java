package Abstraction.ExceptionHandling;

public class InvalidCountryException extends Exception {

    public InvalidCountryException(String message) {
        super(message);
    }
}