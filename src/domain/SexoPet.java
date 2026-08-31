package domain;

public enum SexoPet {
    MASCULINO("masculino"),
    FEMININO("feminino");

    private String SEXO;
    SexoPet(String tipo) {
        SEXO = tipo;
    }

    public String getSEXO() {
        return SEXO;
    }
}
