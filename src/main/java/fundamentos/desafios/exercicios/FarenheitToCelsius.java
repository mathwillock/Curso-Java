package fundamentos.desafios.exercicios;

import java.util.Scanner;

public class FarenheitToCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double farenheit = Double.parseDouble(input.nextLine().replace(",", "."));

        double celsius = (farenheit - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é: " + celsius + "°C");

        input.close();

    }


}
