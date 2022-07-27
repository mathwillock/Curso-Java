package controle.desafios.exercicios;

public class VerificarPar {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i >= 0 && i <= 10) {
                System.out.println(i + " é par está entre 0 e 10.");
            }
        }

    }

}
