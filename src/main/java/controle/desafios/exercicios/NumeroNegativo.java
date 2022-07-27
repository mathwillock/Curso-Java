package controle.desafios.exercicios;

import java.util.Scanner;

public class NumeroNegativo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        int contador = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();

            contador += numero;

        } while (!(numero < 0)); // enquanto o numero for positivo

        System.out.printf("\nO número digitado foi negativo: %d", numero);

        System.out.println("\n\nFim do programa!");



    }

}
