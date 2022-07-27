package controle.desafios;

import java.util.Scanner;

/*
    * Desafio:
    * Calcular a média das notas de uma sala de alunos.
    * o Usuário deve digitar uma nota válida entre 0 e 10.
    * Quano o usuário digitar uma nota válido devo armazenar o valor dessa nota dentro de uma variável chamada total
    * total vai armazenar a soma dde todas as notas.
    * Usar uma outra variável para validar quantas notas válidas foram digitadas.
    * Se o usuário digitar uma nota inválida, devo solicitar uma nova nota para ser digitada.
    * Se o usuário digitar -1 ele quer sair do programa.
    * lido -1 ele deve mostrar a média das notas e finalizar o programa.
 */

public class DesafioWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota = 0;
        double total = 0;
        int contador = 0;

       while (nota != -1) {
           System.out.println("\nDigite uma nota válida entre 0 e 10: ");
           nota = Double.parseDouble(input.nextLine().replace(",", "."));

           if (nota >= 0 && nota <= 10) {
               total += nota;
               contador++;
           } else if(nota != -1) {
               System.out.println("Nota inválida!");
           }
       }

        double media = total / contador;

        System.out.println("\nMédia dos alunos: " + media);

        System.out.println("\nFim do programa!");

        input.close();

    }
}
