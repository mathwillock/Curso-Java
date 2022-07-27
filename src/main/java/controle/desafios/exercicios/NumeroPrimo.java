package controle.desafios.exercicios;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();

        int qtdModulo = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                qtdModulo++;
            }
        }

        switch (qtdModulo) {
            case 0:
                System.out.printf("O número %d é primo.", numero);
                break;
            default:
                System.out.printf("O número %d não é primo.", numero);
                break;
        }

      scanner.close();

    }

}
