package controle.desafios.exercicios;

import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        int randomNumber = (int) (Math.random() * 11); // 0 - 100

        for (int i = 0; i < 10; i++) {
            System.out.println("tente adivinhar o número");
            numero = scanner.nextInt();

            int chance = 9 - i;

            if(numero == randomNumber){
                System.out.println("--------você Acertou!!!--------");
                break;
            }else {
                System.out.println("--------você errou--------");

                System.out.printf("\nResta %d chances\n", chance);
            }

            if (chance == 0) {
                System.out.println("\n--------GAME OVER---------");
            }

        }

        scanner.close();
    }


}
