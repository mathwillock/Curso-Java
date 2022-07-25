package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá, mundo!".charAt(2));

        var nome = "João";
        var sobrenome = "Silva";
        var idade = 30;
        var salario = 1234.56;

        System.out.println(
                "nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n"
        );

        System.out.printf(
                "O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario
        );

    }
}
