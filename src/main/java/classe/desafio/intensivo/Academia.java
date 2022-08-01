package classe.desafio.intensivo;

public class Academia {

    public static void main(String[] args) {

        Exercicios exercicio = new Exercicios("esteira", 0.380, Itensidade.BAIXA);

        Pessoa pessoa = new Pessoa("Maria", 80, 0);
        System.out.printf("Quantidade de calorias gastas antes da academia: %.3f", pessoa.caloriasGastasDiariamente);

        pessoa.exercitar(exercicio);
        System.out.printf("\nQuantidade de calorias gastas depois da academia: %.3f", pessoa.caloriasGastasDiariamente);

        Exercicios exercicio2 = new Exercicios("Agachamento", 0.800, Itensidade.MEDIA);

        pessoa.exercitar(exercicio2);
        System.out.printf("\nQuantidade de calorias gastas depois do exercicio 2: %.3f", pessoa.caloriasGastasDiariamente);

        pessoa.pesoAtual();
        System.out.println("\nPeso atual: " + pessoa.peso);

    }

}
