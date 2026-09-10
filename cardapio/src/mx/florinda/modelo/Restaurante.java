package mx.florinda.modelo;

public class Restaurante {
    private final String nome;
    private final String endereco;

    public Restaurante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    private final Cardapio cardapio = new Cardapio();

    public Cardapio getCardapio() {
        return cardapio;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}