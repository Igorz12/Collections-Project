import Model.Produto;
import Repository.ProdutoRepository;
import Service.ProdutoService;
import exception.EstoqueException;
import exception.PrecoException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws PrecoException, EstoqueException {
        Produto p1 = new Produto(1L,"Teclado","Eletrónico", 2500.00,2);
        ProdutoService produtoService = new ProdutoService();

        produtoService.adicionarProduto(p1);
    }
}