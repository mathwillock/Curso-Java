package controle.desafios.exercicios;

public class Bissexto {

    public static void main(String[] args) {

        int ano = 1988;

        for(int i = 0; i <= 20; i++){
            if(ano % 4 == 0){
                System.out.println(ano + " é um ano bissexto.");
            }
            ano++;
        }
    }
}
