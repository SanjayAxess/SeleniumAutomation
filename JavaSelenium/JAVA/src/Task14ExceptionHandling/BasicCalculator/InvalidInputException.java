package Task14ExceptionHandling.BasicCalculator;

public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

