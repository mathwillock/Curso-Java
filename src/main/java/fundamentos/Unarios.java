package fundamentos;

public class Unarios {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

//        OPeradores unários pós fixado
        a++; // a = a + 1;
        System.out.println(a);
        a--; // a = a - 1;
        System.out.println(a);

//        Operadores unários pré fixado
        --b; // b = b - 1;
        System.out.println(b);
        ++b; // b = b + 1;
        System.out.println(b);

        System.out.println("MIni desafio...");
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a == b--);
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);

    }

}
