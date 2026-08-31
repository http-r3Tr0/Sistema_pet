package service;
 import domain.SexoPet;
 import domain.TipoPet;
import service.CadastroPet;

 import java.util.Locale;

public class ToEnum {
    public String paraEnum(String input_usuario) {
        try {
            String teset = input_usuario.toLowerCase().trim();
            if (TipoPet.CACHORRO.getEscolha().equals(teset)) {
                return "Cachorro";
            }else if (TipoPet.GATO.getEscolha().equals(teset)) {
                return "Gato";
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            return "Digite uma das duas opções";
        }

        return input_usuario;
    }
    public String paraEnumSexo(String sexobicho){
        try {
            String sexo = sexobicho.toLowerCase().trim();
            if (SexoPet.FEMININO.getSEXO().equals(sexobicho)) {
                return "Feminino";
            } else if (SexoPet.MASCULINO.getSEXO().equals(sexobicho)) {
                return "Masculino";
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return sexobicho;
    }
}
