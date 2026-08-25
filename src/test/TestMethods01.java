package test;

import service.CadastroPet;
import service.LerPerguntas;

public class TestMethods01 {
    public static void main(String[] args) {
        LerPerguntas lerPerguntas = new LerPerguntas();
        lerPerguntas.carregarPerguntas();
        System.out.println("------------- teste -------------");
        lerPerguntas.imprimir();
        lerPerguntas.pergunta();
        lerPerguntas.pergunta();

    }
}
