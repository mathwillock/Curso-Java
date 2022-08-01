package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        // O put tanto adiciona quanto atualiza um elemento.
        usuarios.put(1, "João");
        usuarios.put(2, "Maria");
        usuarios.put(3, "Ana");
        usuarios.put(4, "José");

        System.out.println(usuarios.size()); // retorna o tamanho do mapa.
        System.out.println(usuarios.get(1)); // retorna o valor do elemento com a chave 1.
        System.out.println(usuarios.isEmpty()); // retorna true se o mapa estiver vazio.
        System.out.println(usuarios.containsKey(1)); // retorna true se o mapa contiver a chave 1.
        System.out.println(usuarios.containsValue("João")); // retorna true se o mapa contiver o valor "João".
        System.out.println(usuarios.keySet()); // retorna um Set com todas as chaves do mapa.
        System.out.println(usuarios.remove(1)); // remove o elemento com a chave 1.
        System.out.println(usuarios.remove(1, "João")); // remove o elemento com a chave 1 e o valor "João".

        for (Integer chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valores: usuarios.values()) {
            System.out.println(valores);
        }

        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey() + " ==> " + registro.getValue());
        }

    }


}
