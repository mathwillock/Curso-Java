package poo.composicao.relacaoOneToOne;

public class Motor {

    Carro carro;
    boolean ligado = false;
    double fatorInjecao = 1;

    Motor(Carro carro) {
        this.carro = carro;
    }

    int giros() {
        return !ligado ? 0 : (int) Math.round(fatorInjecao * 3000);
    }


}
