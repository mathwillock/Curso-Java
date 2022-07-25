package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.print("Olá, ");
        System.out.print("mundo!\n\n");

        System.out.println("Olá, ");
        System.out.println("mundo!");

        System.out.printf("Megasenha: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Nome: %s%n", "João");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        String idade = entrada.nextLine();

        System.out.printf("%s %s tem %s anos.", nome, sobrenome, idade);

        entrada.close();

    }


}
