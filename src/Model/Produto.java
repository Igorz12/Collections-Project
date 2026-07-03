package Model;

import exception.EstoqueException;
import exception.PrecoException;

public class Produto extends BaseEntity {
    private String nome;
    private String categoria;
    private double preco;
    private int estoque;

    public Produto(Long id,String nome, String categoria,double preco, int estoque)
            throws PrecoException, EstoqueException {
        super.setId(id);
        this.nome = nome;
        this.categoria = categoria;
        setPreco(preco);
        setEstoque(estoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoException {
        if (preco < 0) {
            throw new PrecoException("Preço não pode ser negativo.");
        }
        this.preco = preco;
    }
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) throws EstoqueException {
        if (estoque < 0) {
            throw new EstoqueException("Estoque não pode ser negativo.");
        }
        this.estoque = estoque;

    }
}
