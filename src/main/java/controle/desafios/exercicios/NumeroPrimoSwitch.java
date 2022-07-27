package controle.desafios.exercicios;

import java.util.Scanner;

public class NumeroPrimoSwitch {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        String processo = "";

        while(!processo.equals("n")) {

            System.out.println("\nDigite um número: ");
            numero = Integer.parseInt(scanner.nextLine().replace(",", "."));

            int modulo0 = numero % numero;
            int modulo1 = numero % 1;

            switch (numero) {
                default:
                    if (0 == numero % numero && numero % 1 == 0) {
                        System.out.println("O número é primo.");
                    } else {
                        System.out.println("O número não é primo.");
                    }
                    break;

            }

            switch (modulo1) {
                case 0:
                    System.out.println("O número é primo.");
                    break;

            }



            System.out.println("\nDeseja continuar? (s/n)");
            processo = scanner.nextLine();
        }

        System.out.println("\nFim do programa!");

        scanner.close();


    }

}
