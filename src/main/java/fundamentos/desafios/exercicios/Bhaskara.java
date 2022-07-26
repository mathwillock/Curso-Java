package fundamentos.desafios.exercicios;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = Double.parseDouble(input.nextLine().replace(",", "."));

        System.out.println("Digite o valor de b: ");
        double b = Double.parseDouble(input.nextLine().replace(",", "."));

        System.out.println("Digite o valor de c: ");
        double c = Double.parseDouble(input.nextLine().replace(",", "."));

        double delta = Math.pow(b, 2) - (4 * a * c);

        System.out.println("\nDelta: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: " + x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nO x2 da equação é: " + x2);

        input.close();
    }

}
