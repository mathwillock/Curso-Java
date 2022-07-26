package fundamentos.desafios.intensivo;

import java.util.Scanner;

public class ConverterHorasMinutos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as horas: ");
        String inputHour = scanner.nextLine().replace(':', '.');

        double conversion = Double.parseDouble(inputHour) * 60;

        int minutos = (int) conversion;

        System.out.println(minutos + " minutos");
    }
}
