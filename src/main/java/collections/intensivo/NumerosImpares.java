
package collections.intensivo;

import java.util.SortedSet;
import java.util.TreeSet;

public class NumerosImpares {

    public static void main(String[] args) {

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

        SortedSet<Integer> numerosImpares = new TreeSet<>();

        for (Integer numero : numeros) {
            if(numero % 2 != 0) {
                numerosImpares.add(numero);
            }
        }

        for (Integer numero : numerosImpares) {
            System.out.println(numero);
        }

    }
}
