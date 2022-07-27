package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = "";

        do {
            System.out.println("\nVocê precisa falar \nas palavras mágicas...");
            System.out.println("\nQuer sair? Digite sair");
            text = input.nextLine();
        } while (!text.equals("sair")); // enquanto o texto não for sair, continue executando o code acima:

        System.out.println("\nSaindo...");

        input.close();

    }
}
