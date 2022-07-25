package fundamentos.desafios;

public class DesafiosAritimeticos {

    public static void main(String[] args) {
        /*
            int a = 3*4-10;
            int b = (int) Math.pow(a, 3);
            double c = Math.pow(a, 3);

            System.out.println(b);
            System.out.println(c);

         */

        // desafio
        var a = 3+2;
        var b = Math.pow((6*a),2);
        var c = b / (3*2);
        System.out.println(c); // 150.0

        var d = 2-7;
        var e = 1-5;
        var f = (d*e) / 2;
        var g = Math.pow(f, 2);
        System.out.println(g); // 100.0

        var h = (c-g);
        System.out.println(h); // 50.0

        var i = Math.pow(h, 3);
        var j = Math.pow(10, 3);
        System.out.println(i); // 125000.0
        System.out.println(j); // 1000.0

        int resultadoFinal = (int) (i / j);
        System.out.println(resultadoFinal); // 125.0

    }
}
