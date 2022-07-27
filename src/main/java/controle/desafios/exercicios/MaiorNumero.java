package controle.desafios.exercicios;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int validador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero > validador) {
                validador = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + validador);

        scanner.close();

    }

}
