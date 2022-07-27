package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

    /*
        * Escreva um programa que leia um dia da semana e imprima um númeo respectivo ao dia.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o dia da semana: ");
        String dia = input.next();

        if("segunda".equalsIgnoreCase(dia)) {
            System.out.println(2);
        } else if("terça".equalsIgnoreCase(dia)) {
            System.out.println(3);
        } else if("quarta".equalsIgnoreCase(dia)) {
            System.out.println(4);
        } else if("quinta".equalsIgnoreCase(dia)) {
            System.out.println(5);
        } else if("sexta".equalsIgnoreCase(dia)) {
            System.out.println(6);
        } else if("sábado".equalsIgnoreCase(dia)) {
            System.out.println(7);
        } else if("domingo".equalsIgnoreCase(dia)) {
            System.out.println(1);
        } else {
            System.out.println("Dia inválido!");
        }

        input.close();

    }

}
