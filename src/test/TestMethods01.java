package test;

import jdk.swing.interop.SwingInterOpUtils;
import service.*;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestMethods01 {
    public static void main(String[] args) {
        LerPerguntas lerPerguntas = new LerPerguntas();
        lerPerguntas.carregarPerguntas();
        System.out.println("------------- teste -------------");



        CadastroPet cadastroPet = new CadastroPet();
       cadastroPet.cadastrarPet();




    }
}
