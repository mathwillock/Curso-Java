package fundamentos;


import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a média do aluno: ");
        double media = Double.parseDouble(input.nextLine());

        String resultado = media >= 7 ? "Aprovado!" : "Reprovado!";

        System.out.println("O aluno está " + resultado);
    }



}
