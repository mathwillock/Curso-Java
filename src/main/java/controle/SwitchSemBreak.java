package controle;

import java.util.Scanner;

public class SwitchSemBreak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual a sua faixa?");
        String faixa = input.nextLine();

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Teki Shodan...");
            case "roxa":
                System.out.println("Sei o Heian Godan...");
            case "verde":
                System.out.println("Sei o Heian Yodan...");
            case "laranja":
                System.out.println("Sei o Heian Sandan...");
            case "vermelha":
                System.out.println("Sei o Heian Nidan...");
            case "amarela":
                System.out.println("Sei o Heian Shodan...");
                break;
            default:
                System.out.println("Não sei nada...");

        }

        System.out.println("fim");

        System.out.println("Qual a idade?");
        int idade = input.nextInt();

        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("sabe respirar");
        }

        System.out.println("fim");
    }
}
