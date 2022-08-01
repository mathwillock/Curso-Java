package collections.intensivo;

import java.util.Deque;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public class ListaNumeros {

    public static void main(String[] args) {
        //98, 30, 56, 87, 12, 45, 99, 1, 34, 67,23,45

        SortedSet<Integer> numeros = new TreeSet<>();
        numeros.add(98);
        numeros.add(30);
        numeros.add(56);
        numeros.add(87);
        numeros.add(12);
        numeros.add(45);
        numeros.add(99);
        numeros.add(1);
        numeros.add(34);
        numeros.add(67);
        numeros.add(23);
        numeros.add(45);

        int size = numeros.size();

        for (int i = 0; i < size; i++) {
            System.out.println(numeros.last());
            numeros.remove(numeros.last());
        }


    }

}
