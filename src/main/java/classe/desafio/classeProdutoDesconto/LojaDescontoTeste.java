package classe.desafio.classeProdutoDesconto;

public class LojaDescontoTeste {

    public static void main(String[] args) {

        LojaDesconto loja = new LojaDesconto( "Notebook", 4356.89 );

        LojaDesconto loja2 = new LojaDesconto( "Caneta Preta", 12.56 );

        double desconto = LojaDesconto.DESCONTO;
        System.out.println("\nTodos os produtos com desconto de: " + desconto);

        double precoComDesconto = loja.precoComDesconto();
        System.out.println("Produto: " +loja.nomeProduto);
        System.out.println("\nPreço sem desconto: R$" + loja.preco);
        System.out.printf("Preço com desconto: R$%.2f.", precoComDesconto);

        double precoComDesconto2 = loja2.precoComDesconto();
        System.out.println("\nProduto: " +loja2.nomeProduto);
        System.out.println("\n\nPreço sem desconto: R$" + loja2.preco);
        System.out.printf("Preço com desconto: R$%.2f", precoComDesconto2);


    }

}
