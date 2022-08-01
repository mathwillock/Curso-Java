package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add("João"); // String
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add(1); // int -> Integer

        System.out.println("tamanho é: " + conjunto.size());

        conjunto.add("teste");
        conjunto.add("joão");

        System.out.println("tamanho é: " + conjunto.size());

        conjunto.remove("teste");
        conjunto.remove("joão");

        System.out.println("tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains("João"));
        System.out.println(conjunto.contains(1.2));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);



    }

}
