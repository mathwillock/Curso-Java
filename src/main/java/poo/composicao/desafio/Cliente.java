package poo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    final String nome;
    final ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    double totalGasto() {
        double totalGasto = 0.0;

        for (Compra compra : compras) {
            totalGasto += compra.obterValorTotal();
        }

        return totalGasto;

    }

    String exibirListaDeCompras() {
        StringBuilder message = new StringBuilder();

        var i = 0;
        for (Compra compra : compras) {
            message.append("\n------ ID Compra: ").append(i).append(" ------\n").append(compra.listaDeCompra())
                    .append("Total da compra: R$").append(compra.obterValorTotal()).append("\n\n");
            i++;

        }

        return message.toString();
    }


}
