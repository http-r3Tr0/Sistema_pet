package service;
import domain.SexoPet;

import java.util.Scanner;

public class LerSexoPet {
    public SexoPet lerSexo(){
        Scanner sc = new Scanner(System.in);
        ToEnum toEnum = new ToEnum();
        String Perguntar_Sexo = sc.next();
        SexoPet sexoPet = null;

        if (toEnum.paraEnumSexo(Perguntar_Sexo).equals("Feminino")){
            sexoPet = SexoPet.FEMININO;
        } else if (toEnum.paraEnumSexo(Perguntar_Sexo).equals("Masculino")) {
            sexoPet = SexoPet.MASCULINO;
        }
        return sexoPet;
    }
}
