package array;

public class ForEach {

    public static void main(String[] args) {
        double[] notasAlunoA = {9.9, 8.7, 7.2, 9.4};

        System.out.println("---------for common--------\n");

        for (int i = 0; i < notasAlunoA.length ; i++) {
            System.out.println("Nota do aluno A: " + notasAlunoA[i]);
        }

        System.out.println("\n---------for Each--------\n");

        for(double nota: notasAlunoA) {
            System.out.println("Nota do aluno A: " + nota);
        }

    }

}
