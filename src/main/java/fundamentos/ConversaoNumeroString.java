package fundamentos;

public class ConversaoNumeroString {
/*
    * No tipo primitivo não precisamos converter o número para ‘string’ utilizando o toString();
    * O Java entende que esta operação System.out.println("Numero: " +  num2) já nos retona uma ‘string’.
 */
    public static void main(String[] args) {
        Integer num1 = 10000; // Wrapper
        System.out.println("Numero: " +  num1.toString()); // 10000
        System.out.println("Quantidade de caracteres do número: " + num1.toString().length()); // 4


        int num2 = 10000; // Tipo Primitivo
        System.out.println("Numero: " + num2); // 10000 Nesse caso não precisamos usar o tipo primitivo para converter o número para string.
        System.out.println("Quantidade de caracteres do número: " + Integer.toString(num2).length()); // 4
        System.out.println(("" + num2).length()); // 4
    }
}
