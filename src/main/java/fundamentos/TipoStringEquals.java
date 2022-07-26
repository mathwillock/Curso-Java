package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

//    Quando se comparar String utilizar o equals que é muito mais assertivo do que o '=='

    public static void main(String[] args) {
        System.out.println("2" == "2"); // true

        String s = new String("2");
        System.out.println("2".equals(s)); // true
        System.out.println("2" == s); // false

        Scanner scanner = new Scanner(System.in);

        String s2 = scanner.nextLine();
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));
        scanner.close();


    }




}
