package fundamentos.desafios;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na Quinta (V ou F)

        boolean trabalhoNaTerca = true;
        boolean trabalhoNaQuinta = true;

        boolean comprouTv50 = trabalhoNaTerca && trabalhoNaQuinta;
        boolean comprouTv32 = trabalhoNaTerca ^ trabalhoNaQuinta;
        boolean comprouSorvete = trabalhoNaTerca || trabalhoNaQuinta;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("comprou Tv 50\"?" + comprouTv50);
        System.out.println("comprou Tv 32\"?" + comprouTv32);
        System.out.println("comprou sorvete?" + comprouSorvete);
        System.out.println("Mais saudável? " + !maisSaudavel);

    }
}
