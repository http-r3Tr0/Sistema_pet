package Exceptions;

public class NullSobrenomeException extends RuntimeException {
    public NullSobrenomeException(String message) {
        System.out.println("Sobrenome vazio");
        super(message);
    }
}
