package controle;

public class ContinueRotulado {

    public static void main(String[] args) {
        externo: for (int i = 0; i < 3; i++) {
            interno: for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue interno;
                }
                System.out.printf("[%d %d] ", i, j);
            }

            System.out.println();
        }

        System.out.println("Fim do programa!");
    }
}
