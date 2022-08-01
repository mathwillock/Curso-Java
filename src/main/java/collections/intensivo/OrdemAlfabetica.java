package collections.intensivo;

import java.util.SortedSet;
import java.util.TreeSet;

public class OrdemAlfabetica {

    public static void main(String[] args) {

        SortedSet<String> nomes = new TreeSet<>();

        nomes.add("Zelia");
        nomes.add("Ana");
        nomes.add("Joana");
        nomes.add("Luiza");
        nomes.add("Betina");

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

}
