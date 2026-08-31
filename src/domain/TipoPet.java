package domain;

public enum TipoPet {
    CACHORRO("cachorro"),
    GATO("gato");

    private final String escolha;
    TipoPet(String tipo) {
        escolha = tipo;
    }

    public String getEscolha(){
        return escolha;
    }
}
