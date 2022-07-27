package classe.desafio.classeProdutoDesconto;

public class LojaDesconto {

    String nomeProduto;
    double preco;
    static double DESCONTO = 0.25;

    LojaDesconto(String nomeProdutoInicial, double precoInicial) {
        nomeProduto = nomeProdutoInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - DESCONTO);
    }






}
