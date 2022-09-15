package poo.composicao.desafio;

public class Item {

    int quantidade;
    Produto produto;

    Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    double calcularPreco() {
        return produto.preco * quantidade;
    }

}
