package collections;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario usuario1 = new Usuario("Alex");

        lista.add(new Usuario("João"));
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("João"));
        lista.add(new Usuario("Ana"));
        lista.add(usuario1);

        for(Usuario usuario: lista) {
            System.out.println(usuario.toString());
        }

        System.out.println("\n" + lista.size());
        System.out.println(lista.get(3));
        System.out.println(lista.get(3).nome);

        System.out.println("\nAlex e Ana foram removidos" );

        System.out.println(lista.remove(usuario1));
        System.out.println(lista.remove(new Usuario("Ana")));


    }

}
