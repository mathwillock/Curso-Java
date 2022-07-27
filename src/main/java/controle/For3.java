package controle;

public class For3 {

    /*
        * Escopo de variáveis:
        * - Variáveis declaradas dentro do bloco de código são chamadas de variáveis de escopo local.
        * - Variáveis declaradas fora do bloco de código são chamadas de variáveis de escopo global.
        * - Variáveis declaradas dentro de um bloco de código são chamadas de variáveis de escopo de bloco.
     */

    public static void main(String[] args) {

        int i = 0;

        for ( ;i < 10; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("Fim do programa");
        System.out.println("i = " + i);

        System.out.println("\nNovo For ---------------\n");

        for (int j = 0; j < 10; j++) {
            for(int k = 0; k < 10; k++) {
                System.out.printf("[%d][%d]\n", j, k);
            }
            System.out.println("-----------------------");
        }

        System.out.println("Fim do programa");
    }
}
