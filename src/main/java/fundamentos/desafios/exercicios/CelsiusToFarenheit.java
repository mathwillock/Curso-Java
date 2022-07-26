package fundamentos.desafios.exercicios;

import java.util.Scanner;

public class CelsiusToFarenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = Double.parseDouble(input.nextLine().replace(",", "."));

        double farenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura em Farenheit é: " + farenheit + "ºF");

        input.close();

    }

}
