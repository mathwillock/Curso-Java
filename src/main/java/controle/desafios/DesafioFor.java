package controle.desafios;

public class DesafioFor {

    /*
        * Desafio:
        * Sem usar números, constuir um for que imprima # para cada linha e, a cada ‘loop’ acrescente uma # na próxima linha.
        * Exemplo:
        * #
        * ##
        * ###
        * ####
        * #####
        * ######
        * a condição de parada é até que seja impressa 5 #s.
     */

    public static void main(String[] args) {


        String valor = "#";
        String parada = "######";

        for(int i = valor.length(); i < parada.length() ; i++){
            System.out.println(valor);
            valor += "#";
        }
    }
}
