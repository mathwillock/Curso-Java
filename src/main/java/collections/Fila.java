package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Offer e Add -> Adcionam elementos na fila
        // A diferença é o comportamento quando a fila está cheia!
        // O add retorna um boolean (false no cao de não conseguir).
        // O offer retorna um erro.
        fila.add("João");
        fila.offer("Maria");
        fila.add("Ana");
        fila.offer("José");

        // Peek e element -> Retorna o primeiro elemento da fila sem remover.
        //A diferença é quando ocorre um erro, quando a fila estiver vazia
        System.out.println(fila.peek()); //retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element()); // retorna uma exceção
        System.out.println(fila.element());

        System.out.println(fila.poll()); // retorna o primeiro elemento e remove ele da fila.
        System.out.println(fila.poll()); // retorna false uqando a fila estiver vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // retorna uma exceção quando a fila estiver vazia

    }

}
