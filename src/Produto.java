public class Produto {
    //Atributos
    private String nome;
    private double preco;
    //Construtor
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    // ==== GETTERS ====

    //Getter Nome
    public String getNome() {
        return nome;
    }
    //Getter Preço
    public double getPreco() {
        return preco;
    }
}
