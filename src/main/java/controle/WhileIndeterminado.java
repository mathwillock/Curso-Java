package controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite algo ou sair: ");
        String text = input.nextLine();

        while (!text.equals("sair")) {
            System.out.println("Digite algo ou sair: ");
            text = input.nextLine();
        }

        System.out.println("Saindo...");

        input.close();
    }
}
