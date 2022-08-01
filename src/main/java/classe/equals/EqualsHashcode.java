package classe.equals;

import java.util.Date;

public class EqualsHashcode {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();
        usuario1.nome = "João";
        usuario1.email = "joao.silva@email.com";

        Usuario usuario2 = new Usuario();
        usuario2.nome = "João";
        usuario2.email = "joao.silva@email.com";

        System.out.println(usuario1 == usuario2);
        System.out.println(usuario1.equals(usuario2));
        System.out.println(usuario2.equals(usuario1));

        System.out.println(usuario2.equals(new Date()));

    }

}
