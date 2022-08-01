package collections;

import java.util.*;

public class conjuntoOrganizado {

    public static void main(String[] args) {

//        Set<String> listaDeAlgo = new HashSet<String>();
        SortedSet<String> listaDeAlgo = new TreeSet<>();
        listaDeAlgo.add("João");
        listaDeAlgo.add("1.2");
        listaDeAlgo.add("true");
        listaDeAlgo.add("João");

        for (String algo : listaDeAlgo) {
            System.out.println(algo);
        }

        listaDeAlgo.remove("João");

        for (String algo : listaDeAlgo) {
            System.out.println(algo);
        }

        Set<Integer> listaDeNUmeros = new HashSet<>();
        listaDeNUmeros.add(1);
        listaDeNUmeros.add(2);
        listaDeNUmeros.add(3);
        listaDeNUmeros.add(4);

        for (Integer numero : listaDeNUmeros) {
            System.out.println(numero);
        }

    }

}
