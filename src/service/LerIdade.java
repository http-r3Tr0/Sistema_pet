package service;

import Exceptions.InvalidAgeException;

import java.util.Scanner;

public class LerIdade {
    public String lerIdade() {
        final String naoinformado = "NAO INFORMADO";
        Scanner sc = new Scanner(System.in);
        String idade_sc = sc.nextLine();
        Integer idade;
        try {
            if (idade_sc.isBlank()){
                idade_sc = naoinformado;
                idade = 0;
                return idade_sc;
            } else {
                idade = Integer.parseInt(idade_sc);
            }
            if (idade >= 20){
                throw new InvalidAgeException("Pet com idade acima de 20 anos");
            }
        } catch (NumberFormatException e){
            throw new NumberFormatException("passou String como número");
        }
        System.out.println(idade);
        System.out.println(idade_sc);
        return idade_sc;
    }
}
