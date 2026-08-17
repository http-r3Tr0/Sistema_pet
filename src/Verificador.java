import java.util.InputMismatchException;

public class Verificador {
    private int valor;

    public boolean verificando(int valor) {
        this.valor = valor;
        try {
            if (valor <= 0){
                return false;
            } else {
                return true;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Digite um número");
            return false;
        }
    }
}
