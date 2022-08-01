package collections;

import java.util.Deque;
import java.util.LinkedList;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> pilhaDeLivros = new LinkedList<>();

        pilhaDeLivros.add("O peixe");
        pilhaDeLivros.push("O carneiro"); // gera um erro caso exceda o tamnho da pilha.
        pilhaDeLivros.add("O Hobbit");

        for(String livro: pilhaDeLivros) {
            System.out.println(livro);
        }

        System.out.println(pilhaDeLivros.peek()); // retorna o primeiro elemento da pilha.
        System.out.println(pilhaDeLivros.element()); // retorna o primeiro elemento da pilha.

        System.out.println(pilhaDeLivros.pop()); // retorna o primeiro elemento da pilha e remove ele.
        System.out.println(pilhaDeLivros.remove()); // retorna o primeiro elemento da pilha e remove ele.
        System.out.println(pilhaDeLivros.poll()); // retorna o primeiro elemento da pilha e remove ele.

    }



}
