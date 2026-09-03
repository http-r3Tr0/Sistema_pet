package Exceptions;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        System.out.println("Idade invalida");
        super(message);
    }
}
