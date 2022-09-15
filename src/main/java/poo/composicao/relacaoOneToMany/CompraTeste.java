package poo.composicao.relacaoOneToMany;

public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.Cliente = "João Pedro";
        c1.items.add(new Item("Caneta", 20, 7.45));
        c1.items.add(new Item("Borracha", 12, 3.89));
        c1.items.add(new Item("Caderno", 3, 18.79));

        System.out.println(c1.items.size());

        System.out.println(c1.obterValorTotal());

    }

}
