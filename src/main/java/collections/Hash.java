package collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Maria");
        Usuario usuario3 = new Usuario("Ana");

        boolean resultado = usuarios.contains(usuario1); // retorna false
        System.out.println(resultado);

        usuarios.add(usuario1); // adiciona o usuario1 na lista
        usuarios.add(usuario2); // adiciona o usuario2 na lista
        usuarios.add(usuario3); // adiciona o usuario3 na lista

         resultado = usuarios.contains(usuario1);
        System.out.println(resultado);

    }

}
