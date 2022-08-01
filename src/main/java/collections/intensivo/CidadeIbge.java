package collections.intensivo;

import java.util.HashMap;
import java.util.Map;

public class CidadeIbge {

    public static void main(String[] args) {
        Map<Integer, String> cidades = new HashMap<>();
        cidades.put(3550308, "Itabuna");
        cidades.put(3550309, "Rio de Janeiro");
        cidades.put(3550310, "Belo Horizonte");
        cidades.put(3550311, "São Paulo");

        for (Integer chave : cidades.keySet()) {
            System.out.println(chave + " ==> " + cidades.get(chave));
        }

        for (String valores: cidades.values()) {

            if (valores.equals("São Paulo")) {
                System.out.println(valores);
            }
        }
    }

}
