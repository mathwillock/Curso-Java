package fundamentos.desafios.exercicios;

import java.util.Scanner;

public class Areatriangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da altura: ");
        double altura = Double.parseDouble(input.nextLine().replace(",", "."));

        System.out.println("Digite o valor da base: ");
        double base = Double.parseDouble(input.nextLine().replace(",", "."));

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);

        input.close();

    }
}
