package fundamentos.desafios.exercicios;

import java.util.Scanner;

public class ResultadoQuadradoCubo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = Double.parseDouble(scanner.nextLine().replace(",", "."));

        double quadrado = Math.pow(numero, 2);
        System.out.println("O quadrado de " + numero + " é: " + quadrado);
        double cubo = Math.pow(numero, 3);
        System.out.println("O cubo de " + numero + " é: " + cubo);




    }


}
