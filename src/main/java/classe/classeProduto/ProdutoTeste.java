package classe.classeProduto;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "Notebook";
        produto.preco = 4356.89;
        produto.desconto = 0.25;

        var produto2 = new Produto();
        produto2.nome = "Caneta Preta";
        produto2.preco = 12.56;
        produto2.desconto = 0.29;

        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: R$" + produto.preco);
        System.out.println("Desconto: " + produto.desconto);

        double precoComDesconto = produto.precoComDesconto();
        System.out.printf("Preço com desconto: R$%.2f.", precoComDesconto);

        System.out.println("\n\nNome: " + produto2.nome);
        System.out.println("Preço: R$" + produto2.preco);
        System.out.println("Desconto: " + produto2.desconto);

        double precoComDesconto2 = produto2.precoComDesconto(0.1);
        System.out.printf("Preço com desconto: R$%.2f", precoComDesconto2);

        double mediaCarrinho = (precoComDesconto + precoComDesconto2) / 2;


        System.out.printf("\n\nMédia do carrinho = R$%.2f.", mediaCarrinho);


    }


}
