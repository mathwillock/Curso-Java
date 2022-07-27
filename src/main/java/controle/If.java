package controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a média do aluno: ");
        double media = Double.parseDouble(input.nextLine().replace(",", "."));

        if(media <= 10.0 && media >= 7.0){
            System.out.println("Aluno aprovado!");
            System.out.println("Parabéns!");
        }

        if (media < 7.0 && media>= 4.5) {
            System.out.println("Aluno em recuperação!");
            System.out.println("Faltam " + (7.0 - media) + " para aprovação!");
        }

        boolean criterioDeAprovaçao = media < 4.5 && media >= 0.0;

        if (criterioDeAprovaçao) {
            System.out.println("Aluno reprovado!");
            System.out.println("Faltam " + (4.5 - media) + " para aprovação!");
        }

        input.close();

    }

}
