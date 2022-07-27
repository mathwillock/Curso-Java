package classe.desafio.intensivo;

public class Pessoa {

    String nome;
    double peso;
    double caloriasGastasDiariamente;

    Pessoa(String nome, double peso, double caloriasGastasDiariamente) {
        this.nome = nome;
        this.peso = peso;
        this.caloriasGastasDiariamente = caloriasGastasDiariamente;
    }

    void exercitar(Exercicios exercicio) {
        if (exercicio != null) {
            caloriasGastasDiariamente += exercicio.calorias;
        }
    }

    void pesoAtual() {
        if(caloriasGastasDiariamente > 0) {
            this.peso -= this.caloriasGastasDiariamente;
        }
    }

}
