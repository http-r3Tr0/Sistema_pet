package service;

import java.util.Scanner;

public class LerEndereco {
    public String lerEndereco(){
        final String naoinformado = "NAO INFORMADO";
        Scanner sc = new Scanner(System.in);
        String endereco = sc.nextLine();
        Scanner limitador = new Scanner(endereco);
        limitador.useDelimiter(",");

        String rua = limitador.next().trim();
        String numero = limitador.next().trim();
        String cidade= limitador.next().trim();

        if (numero.isBlank()) {
            numero = naoinformado;
        }

        return rua + numero + cidade;
    }
}
