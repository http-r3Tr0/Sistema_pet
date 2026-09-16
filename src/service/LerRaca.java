package service;

import java.util.Scanner;

public class LerRaca {
    public String lerRaca(){
        String naoinformado = "NAO INFORMADO";
        Scanner sc = new Scanner(System.in);
        String raca = sc.nextLine().replaceAll("[0-9.,?!@#$%¨&*\\-+=]", "");
        if (raca.isEmpty()){
            raca = naoinformado;
        }
        return raca;
    }
}
