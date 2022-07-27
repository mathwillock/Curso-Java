package classe.classeArea;

public class AreaCirc {

    double raio;
    final static double PI = 3.1415;

    AreaCirc(double areaCirc) {
        raio = areaCirc;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

}