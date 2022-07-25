package fundamentos;

import java.util.Locale;

public class NotacaoPonto {

    public static void main(String[] args) {
        String s = "abc";
        s = s.replace("a", "x");
        s = s.toUpperCase(Locale.ROOT);
        s = s.concat("!!!");

        System.out.println(s);

    }
}
