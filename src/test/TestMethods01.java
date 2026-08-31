package test;

import service.CadastroPet;
import service.LerPerguntas;
import service.ToEnum;

public class TestMethods01 {
    public static void main(String[] args) {
        LerPerguntas lerPerguntas = new LerPerguntas();
        lerPerguntas.carregarPerguntas();
        System.out.println("------------- teste -------------");

        CadastroPet cadastroPet = new CadastroPet();
        cadastroPet.cadastrarPet();


    }
}
