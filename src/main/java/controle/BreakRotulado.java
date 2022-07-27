package controle;

public class BreakRotulado {

    public static void main(String[] args) {
        externo: for (int i = 1; i < 10; i++) {
            interno: for (int j = 0; j < 10; j++) {
                if (i == j) {
                    break externo;
                }
                System.out.printf("[%d %d] ", i, j);
            }

            System.out.println();
        }

        System.out.println("Fim do programa!");
    }




}
