package fundamentos;


import javax.swing.*;

public class ConversaoStringNumero {

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog("Digite o primeiro número");

        System.out.println("Strings concatenadas: " + (valor1 + valor2)); // concatenando strings

        double num1 = Double.parseDouble(valor1); // transformando string em double
        double num2 = Double.parseDouble(valor2);

        double soma = num1 + num2;
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + soma/2);

    }

}
