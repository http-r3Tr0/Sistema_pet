package service;

import Exceptions.NullSobrenomeException;

import java.util.Scanner;

public class LerSobre {
    public String lerSobre(){
        Scanner sc = new Scanner(System.in);
        String sobrenome = sc.next().replace("[0-9.,?!@#$%¨&*\\-+=]","");

        try {
            if (sobrenome.isEmpty() || sobrenome.isBlank()) {
                throw new NullSobrenomeException("Sem sobrenome");
            }
        } catch (NullPointerException e) {
            throw new RuntimeException();
        }
        System.out.println(sobrenome);

        return sobrenome;
    }
}
