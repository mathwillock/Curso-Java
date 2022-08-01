package array;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];

        System.out.println("Notas dos alunos antes de inserir as notas: " + Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println("\nNotas dos alunos depois de inserir as notas: " + Arrays.toString(notasAlunoA));

        double mediaTotal = 0;

        for (int i = 0; i < notasAlunoA.length; i++) {
            mediaTotal += notasAlunoA[i];
        }

        System.out.printf("\nMédia total: %.2f%n", mediaTotal / notasAlunoA.length);

        double notaArmazenada = 3.6;
        double[] notasAlunoB = {6.9, 8.9, 5.5, notaArmazenada, 10};
        System.out.println("\nNotas dos alunos B: " + Arrays.toString(notasAlunoB));

        double mediaTotalB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            mediaTotalB += notasAlunoB[i];
        }

        System.out.printf("\nMédia total: %.2f%n", mediaTotalB / notasAlunoB.length);

    }

}
