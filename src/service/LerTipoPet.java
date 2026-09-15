package service;
import domain.TipoPet;

import java.util.Scanner;

public class LerTipoPet {
    public TipoPet LerTipo() {
        Scanner sc = new Scanner(System.in);
        String tipo_pet = sc.next();
        TipoPet tipoPet = null;
        ToEnum toEnum = new ToEnum();
        if (toEnum.paraEnum(tipo_pet).equals("Cachorro")) {
            tipoPet = TipoPet.CACHORRO;
        } else if ((toEnum.paraEnum(tipo_pet).equals("Gato"))) {
            tipoPet = TipoPet.GATO;
        } else {
            System.out.println("invalido");
        }

        return tipoPet;
    }
}
