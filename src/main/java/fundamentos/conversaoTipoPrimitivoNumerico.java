package fundamentos;

public class conversaoTipoPrimitivoNumerico {

/*
* Double suporta 8 ‘bytes’ de precisão, ou seja, um double pode armazenar um valor de até 15 dígitos decimais.
* Float suporta 4 ‘bytes’ de precisão, ou seja, um float pode armazenar um valor de até 7 dígitos decimais.
*/

    public static void main(String[] args) {
        double a = 1; // Implicíta
        System.out.println(a); // 1.0

        float b = (float) 1.123456788888; // Explicita (CAST)
        System.out.println(b); // 1.1234568

        int c = 340; // Implicíta
        byte d = (byte) c; // Explicita (CAST)
        System.out.println(d); // 4

        double e = 1.123456789; // Implicíta
        int f = (int) e; // Explicita (CAST)
        System.out.println(f); // 1
    }


}
