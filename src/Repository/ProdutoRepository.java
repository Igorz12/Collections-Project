package Repository;

import Model.Produto;
import exception.EstoqueException;
import exception.PrecoException;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private List<Produto> produtos;

    public ProdutoRepository() {
        produtos = new ArrayList<>();
    }
    // Adicionar produtos
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Listagem dos produtos (Retorna a lista em vez de printer)
    public List<Produto> listarProdutos() {
        return produtos;
    }

    // Busca por Id
    public Produto buscarPorId(Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;
    }

    // Remoção de produto
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    // Atualização de produto
    public void atualizarProduto(Long id, String nome, String categoria, double preco, int estoque)
            throws PrecoException, EstoqueException {
        Produto produto = buscarPorId(id);
        if (produto != null) {
            produto.setNome(nome);
            produto.setCategoria(categoria);
            produto.setPreco(preco);
            produto.setEstoque(estoque);
        }
    }
}