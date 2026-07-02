/*
ESSE É UM CRUD DE PRODUTO PARA:
ATUALIZAR, DELETAR,ADICIONAR E BUSCAR
ESSES MÉTODOS POSSUIM O PRINT NO TERMINAL
 */

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
        // Print elegante de sucesso
        System.out.println("\n[SISTEMA]  Produto '" + produto.getNome() + "' cadastrado com sucesso!");
    }

    // Listagem dos produtos
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("==========================================================================");
        System.out.printf("%-5s | %-20s | %-15s | %-10s%n", "ID", "NOME", "CATEGORIA", "PREÇO");
        System.out.println("==========================================================================");
        for (Produto produto : produtos) {
            System.out.printf("%-5d | %-20s | %-15s | R$ %-8.2f%n",
                    produto.getId(),
                    produto.getNome(),
                    produto.getCategoria(),
                    produto.getPreco()
            );
        }
        System.out.println("==========================================================================");
    }

    //Busca por Id
    public Produto buscarPorId(Long id) {
        Produto produtoEncontrado = null;
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                produtoEncontrado = produto;
                break;
            }
        }
        if (produtoEncontrado != null) {
            System.out.println("\n==================================================");
            System.out.println("               PRODUTO ENCONTRADO                 ");
            System.out.println("==================================================");
            System.out.printf("  ID        : %d%n", produtoEncontrado.getId());
            System.out.printf("  NOME      : %s%n", produtoEncontrado.getNome());
            System.out.printf("  CATEGORIA : %s%n", produtoEncontrado.getCategoria());
            System.out.printf("  PREÇO     : R$ %.2f%n", produtoEncontrado.getPreco());
            System.out.println("==================================================");
        } else {
            System.out.println("[Erro] Produto com o ID " + id + " não foi encontrado.");
        }
        return produtoEncontrado;
    }

    //Remoção de produto
    public void removerProduto(Produto produto) {
        String nomeProduto = produto.getNome();
        boolean removido = produtos.remove(produto);
        if (removido) {
            System.out.println("\n[SISTEMA]  Produto '" + nomeProduto + "' removido com sucesso!");
        } else {
            System.out.println("\n[SISTEMA]  Falha ao remover: Produto não encontrado na lista.");
        }
    }

    //Autalização de produto
    public void atualizarProduto(Long id, String nome, String categoria, int estoque, double preco)
            throws PrecoException, EstoqueException {
        Produto produto = buscarPorId(id);
        if (produto == null) {
            System.out.println("\n[SISTEMA]  Falha na atualização: O produto informado não existe.");
            return;
        }
        // Aplica as alterações
        produto.setNome(nome);
        produto.setCategoria(categoria);
        produto.setPreco(preco);
        produto.setEstoque(estoque);
        // Print elegante de atualização concluída
        System.out.println("\n==================================================");
        System.out.println("           PRODUTO ATUALIZADO COM SUCESSO       ");
        System.out.println("==================================================");
        System.out.printf("  ID        : %d%n", produto.getId());
        System.out.printf("  NOME      : %s%n", produto.getNome());
        System.out.printf("  CATEGORIA : %s%n", produto.getCategoria());
        System.out.printf("  ESTOQUE   : %d unidades%n", produto.getEstoque());
        System.out.printf("  PREÇO     : R$ %.2f%n", produto.getPreco());
        System.out.println("==================================================");
    }
}