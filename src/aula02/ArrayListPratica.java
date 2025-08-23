package aula02;

import java.util.ArrayList;

public class ArrayListPratica {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Guiler0");
        arr.add("Guiler1");
        arr.add("Guiler2");
        arr.add("Guiler3");
        arr.add("Guiler4");

        System.out.println("Tamanho do vetor" + arr.size());
        System.out.println("Informações do vetor" + arr.toString());
        System.out.println("Item da posição 4: " + arr.get(4));

    }
}
