package controle;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int numero = input.nextInt() % 2;

        if (numero == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }

    }

}
