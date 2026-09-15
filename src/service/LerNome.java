package service;

import Exceptions.NullSobrenomeException;

import java.util.Scanner;

public class LerNome {
    final String naoinformado = "NAO INFORMADO";
    public String lerNome(){
            Scanner sc = new Scanner(System.in);
              String nome = sc.next().replaceAll("[0-9.,?!@#$%¨&*\\-+=]","");

            if (nome.isEmpty()) {
                    nome = naoinformado;
                }
        System.out.println(nome);
        return nome;
    }
}
