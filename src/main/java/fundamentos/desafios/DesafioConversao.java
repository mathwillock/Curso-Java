package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

/*
    * Utilizar o Scanner.NextLine() para ler uma string.
    * Criar 3 Strings: Ultimos tres salários
    * o input dos salários devem poder aceitar vírgula e ponto.
    * Somar os salários e dividir pelo número de salários e dar a média.
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o antepenúltimo salário: ");
        String ultimoSalario1 = input.nextLine();

        System.out.println("Digite o penúltimo salário: ");
        String ultimoSalario2 = input.nextLine();

        System.out.println("Digite o último salário: ");
        String ultimoSalario3 = input.nextLine();

        double salario1 = Double.parseDouble(ultimoSalario1.replace(',', '.'));
        double salario2 = Double.parseDouble(ultimoSalario2.replace(',', '.'));
        double salario3 = Double.parseDouble(ultimoSalario3.replace(',', '.'));

        double soma = salario1 + salario2 + salario3;
        double media = soma / 3;

        System.out.println("Soma dos salários: " + soma);
        System.out.println("Média dos salários: " + media);

        input.close();

    }

}
