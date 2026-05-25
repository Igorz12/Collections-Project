import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>(); // Objeto de produtos
        //Adição dos produtos
        produtos.add(new Produto("Mouse", 150.0));
        produtos.add(new Produto("Teclado", 250.0));
        produtos.add(new Produto("Monitor", 1200.0));
        produtos.add(new Produto("Headset", 300.0));

        //Variáveis de lógica
        double soma = 0.0;
        int contador = 0;
        double maisCaro = produtos.getFirst().getPreco();
        double maisBarato  = produtos.getFirst().getPreco();

        //Manipulação de List
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + " - PREÇO R$ " + produto.getPreco());
            soma += produto.getPreco(); //SOMA DOS Produtos

            //Produto mais caro
            if (maisCaro < produto.getPreco()) {
                maisCaro = produto.getPreco();
            }
            //Produto mais barato
            if (maisBarato > produto.getPreco()) {
                maisBarato = produto.getPreco();
            }
            //Produtos acima de R$1000
            if (produto.getPreco() >= 1000) {
                contador++;
            }
        }
        //OUTPUT DAS INFORMAÇÕES
        System.out.println("=== PAINEL ====");
        System.out.println(" ");
        System.out.println("Valor total dos produtos: " + "R$ " + soma);
        System.out.println("O produto mais caro é: " + maisCaro);
        System.out.println("O produto mais barato é: " + "R$ " + maisBarato);
        System.out.println("Produtos acima de R$ 1000: " + contador);
    }
}
