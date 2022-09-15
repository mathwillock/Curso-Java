package poo.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João Silva");

        Compra compra1 = new Compra(cliente1);
        compra1.criarItem(2, "feijão", 12.0);
        compra1.criarItem(3, "Macarrão", 8.0);
        compra1.criarItem(5, "Frango", 32.0);
        compra1.criarItem(2, "Arroz", 10.0);

        Compra compra2 = new Compra(cliente1);
        compra2.criarItem(2, "Ovo", 12.0);
        compra2.criarItem(3, "Sal", 8.0);
        compra2.criarItem(5, "Queijo", 32.0);
        compra2.criarItem(2, "Peixe", 10.0);

        System.out.println(cliente1.exibirListaDeCompras());
        System.out.printf("O cliente %s gastou na nossa loja o total de R$ %s.", cliente1.nome, cliente1.totalGasto());

    }

}
