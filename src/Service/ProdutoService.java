/* * Camada de Serviço (Business Logic Layer) para a entidade Produto.
 * Esta classe é responsável por intermediar a comunicação entre a camada
 * de apresentação/controlador e o repositório, aplicando regras de negócio
 * se necessário.
 */
package Service;

import Model.Produto;
import Repository.ProdutoRepository;
import exception.EstoqueException;
import exception.PrecoException;

import java.util.List;

public class ProdutoService {

    private final ProdutoRepository produtoRepository;


    public ProdutoService() {
        this.produtoRepository = new ProdutoRepository();
    }

    // ========== MÉTODOS CRUD ==========

    public void adicionarProduto(Produto produto){
        produtoRepository.adicionarProduto(produto);
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.listarProdutos();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.buscarPorId(id);
    }

    public void removerProduto(Produto produto)  {
        produtoRepository.removerProduto(produto);
    }

    public void atualizarProduto(Long id, String nome, String categoria, double preco, int estoque) throws PrecoException, EstoqueException {
        produtoRepository.atualizarProduto(id, nome, categoria, preco, estoque);
    }
}