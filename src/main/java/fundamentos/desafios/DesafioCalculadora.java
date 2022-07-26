package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    /*
        * Ler num1
        * Ler num2
        * Ler operador (+ - * /)
        * Mostrar o resultado da operação
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        System.out.println("Digite o segundo número: ");
        double num2 = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        System.out.println("Digite o operador: ");
        String operador = scanner.nextLine();

        double resultado = operador.equals("+".trim()) ? num1 + num2 :
                operador.equals("-".trim()) ? num1 - num2 :
                operador.equals("*".trim()) ? num1 * num2 :
                operador.equals("/".trim()) ? num1 / num2 : 0
        ;

        System.out.println("O resultado é: " + resultado);

        scanner.close();

    }


}
