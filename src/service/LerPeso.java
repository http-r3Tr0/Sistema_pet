package service;

import Exceptions.InvalidWeigthException;

import java.util.Scanner;

public class LerPeso {
    final String naoinformado = "NAO INFORMADO";
    public String lerPeso() {

        Scanner sc = new Scanner(System.in);
        String peso_Cru = sc.nextLine();
        float peso;

        if (peso_Cru.isBlank()){
            peso_Cru = naoinformado;
            peso = 0;
            return peso_Cru;
        } else {
            peso_Cru.replace(",", ".");
            peso = Float.parseFloat(peso_Cru);
            System.out.println(peso);
            System.out.println(peso_Cru);
        }
        try {
            if (peso > 60 || peso < 0.5) {
                throw new InvalidWeigthException("peso invalido");
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        return peso_Cru;
    }
}
