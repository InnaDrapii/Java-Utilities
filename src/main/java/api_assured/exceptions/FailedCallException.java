package api_assured.exceptions;

public class FailedCallException extends RuntimeException {
    public FailedCallException(String errorMessage) {super(errorMessage);}
}