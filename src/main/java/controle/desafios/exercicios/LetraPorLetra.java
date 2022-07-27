package controle.desafios.exercicios;

import java.util.Scanner;

public class LetraPorLetra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {

            System.out.println(word.charAt(i));
        }

        System.out.println("\nFim do programa!");




        scanner.close();


    }


}
