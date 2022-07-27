package controle.desafios.exercicios;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1 do aluno: ");
        double nota1 = Double.parseDouble(scanner.nextLine().replace(",", "."));

        System.out.println("Digite a nota 2 do aluno: ");
        double nota2 = Double.parseDouble(scanner.nextLine().replace(",", "."));

        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else if (media < 7.0 && media > 4.0) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }

    }

}
