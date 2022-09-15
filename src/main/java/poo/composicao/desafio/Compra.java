package poo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> items = new ArrayList<>();
    Cliente cliente;

    Compra(Cliente cliente) {
        this.cliente = cliente;
        cliente.compras.add(this);
    }

    double obterValorTotal() {
        double valorTotal = 0.0;

        for (Item item : items) {
            valorTotal += item.calcularPreco();
        }

        return valorTotal;
    }

    String listaDeCompra() {
        StringBuilder message = new StringBuilder();

        for (Item item: items){
            message.append(" | QUANTIDADE: ").append(item.quantidade)
                    .append(" | PRODUTO: ").append(item.produto.nome)
                    .append(" | PREÇO: R$ ").append(item.produto.preco).append(" |")
                    .append("\n------------------------------------------------------\n");
        }

        return message.toString();
    }

    void criarItem(int quantidade, String nomeproduto, double precoProduto) {
        items.add(
                new Item(quantidade, new Produto(nomeproduto, precoProduto))
        );
    }
}
