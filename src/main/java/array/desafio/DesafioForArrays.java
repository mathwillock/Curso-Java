package array.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioForArrays {

    /*
        * Desafio:
        * Calcular a média das notas de um aluno.
        * Sacanner da quantidade de notas do aluno.
        * dois for
        * for common para scannear as notas de acordo com a quantidade de notas do aluno informada anteriormente.
        * Segundo for each somar as notas e dividir pelo total de notas.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas do aluno: ");
        int quantidadeNotas = scanner.nextInt();
        double[] notasAluno = new double[quantidadeNotas];
        double nota = 0;

        if (quantidadeNotas > 0) {
            for (int i = 0; i < quantidadeNotas; i++) {
                System.out.printf("Informe a nota %d do aluno: ", i + 1);
                nota = Double.parseDouble(scanner.next().replace(",", "."));

                if(nota >= 0 && nota <= 10) {
                    notasAluno[i] = nota;
                } else {
                    System.out.println("\nNota inválida!\n");
                    i--;
                }

            }

            nota = 0;

            for (double notaAluno : notasAluno) {
                nota += notaAluno;
            }
            double media = nota / notasAluno.length;

            System.out.printf("Média final do aluno: %.2f", media);

        }


    }

}
