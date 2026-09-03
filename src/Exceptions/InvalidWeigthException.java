package Exceptions;

public class InvalidWeigthException extends RuntimeException {

    public InvalidWeigthException(String message) {
        System.out.println("Peso inválido");
        super(message);
    }
}
