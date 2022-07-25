package fundamentos;

/*
    Desafio transformar Ferenheit para Celsius
    Fórmula (F - 32) * 5/9 = C
*/
public class Temperatura {

    public static void main(String[] args) {
        double farenheit;

        farenheit = 100.0;

        double celsius = farenheitParaCelsius(farenheit);

        System.out.println("Temperatura em Celsius: " + Math.ceil(celsius) + "ºC");

    }

    public static double farenheitParaCelsius(double farenheit) {
        final double ajuste = 32;
        final double conversao = 5.0/9.0;
        return (farenheit - ajuste) * conversao;
    }
}
