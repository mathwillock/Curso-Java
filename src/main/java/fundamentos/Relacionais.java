package fundamentos;

public class Relacionais {

    public static void main(String[] args) {

        System.out.println(3> 4); // false
        System.out.println(3>=3); // true
        System.out.println(3<4); // true
        System.out.println(3<=7); // true
        System.out.println(3==3); // true
        System.out.println(30!=4); // true

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("\nTem desconto? " + temDesconto);


    }
}
