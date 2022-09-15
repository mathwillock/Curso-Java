package poo.composicao.relacaoOneToMany;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> items = new ArrayList<>();
    String Cliente;

    double obterValorTotal() {
        double total = 0;

        for(Item item: items){
            total += item.quantidade * item.preco;
        }

        return total;
    }

}
