package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos?");
        int quantidadeAlunos = scanner.nextInt();

        System.out.println("Quantas notas por aluno?");
        int quantidadeNotas = scanner.nextInt();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];

        double total = 0;

        for(int aluno = 0; aluno < notasDaTurma.length; aluno++) {

            for(int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
                System.out.printf("Digite a nota %d do aluno %d: ", nota + 1, aluno + 1);

                notasDaTurma[aluno][nota] = Double.parseDouble(
                        scanner.next().replace(",", ".")
                );

                total += notasDaTurma[aluno][nota];
            }
        }

        double mediaDaTurma = total / (quantidadeAlunos * quantidadeNotas);
        System.out.println("\nMédia da turma: " + mediaDaTurma);

        for (double[] notas : notasDaTurma) {
            System.out.println(Arrays.toString(notas));
        }

        scanner.close();

    }

}
