package classe.desafio.exercicioFinal;

public class Jantar {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("José", 80);
        Comida comida1 = new Comida("Pizza", 0.500);
        Comida comida2 = new Comida("Lasanha", 0.250);

        System.out.println("Peso da pessoa ates de comer: " + pessoa.peso);

        pessoa.comer(comida1);
        System.out.println("Peso da pessoa depois de comer pizza: " + pessoa.peso);

        pessoa.comer(comida2);
        System.out.println("Peso total  da pessoa depois de comer lasanha e pizza: " + pessoa.peso);

    }

}
