package classe.classeProduto;

public class Produto {

    String nome;
    double preco;
    double desconto;

    // Construtor implicito
    Produto() {}

    // Construtor explicito
    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }


}
