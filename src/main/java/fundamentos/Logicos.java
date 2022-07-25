package fundamentos;

public class Logicos {
    public static void main(String[] args) {

        boolean cond1 = true;
        boolean cond2 = 3 > 7;

        System.out.println(cond1 && !cond2); // true
        System.out.println(cond1 || cond2); // true
        System.out.println(cond1 ^ cond2); // true
        System.out.println(!!cond1); // true
        System.out.println(!cond2); // true

        System.out.println("\nTabela verdade E (AND)");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println("\nTabela verdade OU (OR)");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        System.out.println("\nTabela verdade OU exclusivo (XOR)");
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false

        System.out.println("\nTabela verdade NEGACAO (NOT)");
        System.out.println(!true); // false
        System.out.println(!false); // true


    }
}
