package domain;

public class Pet {
    private String nome;
    private String sobrenome;

    private TipoPet tipo_pet;
    private SexoPet sexoPet;

    private String numero_casa;
    private String cidade;
    private String rua;

    private String idade_pet;
    private String peso_pet;

    private String raca_pet;

    public Pet(String nome, String sobrenome, TipoPet tipo_pet, SexoPet sexoPet, String rua, String numero_casa, String cidade, String idade_pet, String peso_pet, String raca_pet) {
        this.nome = nome;
        this.sobrenome = sobrenome;

        this.tipo_pet = tipo_pet;
        this.sexoPet = sexoPet;

        this.rua = rua;
        this.numero_casa = numero_casa;
        this.cidade = cidade;

        this.idade_pet = idade_pet;
        this.peso_pet = peso_pet;
        this.raca_pet = raca_pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public TipoPet getTipo_pet() {
        return tipo_pet;
    }

    public void setTipo_pet(TipoPet tipo_pet) {
        this.tipo_pet = tipo_pet;
    }

    public SexoPet getSexoPet() {
        return sexoPet;
    }

    public void setSexoPet(SexoPet sexoPet) {
        this.sexoPet = sexoPet;
    }

    public String getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(String numero_casa) {
        this.numero_casa = numero_casa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getIdade_pet() {
        return idade_pet;
    }

    public void setIdade_pet(String idade_pet) {
        this.idade_pet = idade_pet;
    }

    public String getPeso_pet() {
        return peso_pet;
    }

    public void setPeso_pet(String peso_pet) {this.peso_pet = peso_pet;}

    public String getRaca_pet() {
        return raca_pet;
    }

    public void setRaca_pet(String raca_pet) {
        this.raca_pet = raca_pet;
    }
}
