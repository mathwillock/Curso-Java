package fundamentos.desafios.exercicios;

import java.util.Scanner;

public class ImprimirIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua altura: ");
        double altura = Double.parseDouble(scanner.nextLine().replace(",", "."));

        System.out.println("Digite seu peso: ");
        double peso = Double.parseDouble(scanner.nextLine().replace(",", "."));

        double imc =  Math.ceil(peso / Math.pow(altura, 2));

        System.out.println("Olá " + nome + " seu IMC é: " + imc);

        scanner.close();

    }

}
