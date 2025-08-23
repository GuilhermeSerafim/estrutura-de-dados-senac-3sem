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

    /**
     * Principais Métodos do ArrayList - https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
     * 
     * add(E e) ➕ - Adiciona um elemento ao final da lista
     * Ex: arr.add("Novo");
     * 
     * add(int i, E e) 📝 - Adiciona elemento em posição específica
     * Ex: arr.add(2, "Inserido");
     * 
     * get(int i) 🎯 - Retorna elemento na posição especificada
     * Ex: arr.get(1);
     * 
     * set(int i, E e) ✏️ - Substitui elemento na posição específica
     * Ex: arr.set(0, "Atualizado");
     * 
     * remove(int i) ❌ - Remove elemento pelo índice
     * Ex: arr.remove(3);
     * 
     * remove(Object o) 🗑 - Remove primeira ocorrência do elemento
     * Ex: arr.remove("Guiler1");
     * 
     * size() 📏 - Retorna quantidade de elementos
     * Ex: arr.size();
     * 
     * isEmpty() 🔍 - Verifica se a lista está vazia
     * Ex: arr.isEmpty();
     * 
     * contains(Object o) 🕵️ - Verifica se um elemento existe
     * Ex: arr.contains("Guiler2");
     * 
     * indexOf(Object o) 🧭 - Retorna o índice da primeira ocorrência
     * Ex: arr.indexOf("Guiler3");
     * 
     * lastIndexOf(Object o) 🔄 - Retorna o índice da última ocorrência
     * Ex: arr.lastIndexOf("Guiler3");
     * 
     * clear() 🧹 - Remove todos os elementos
     * Ex: arr.clear();
     * 
     * toArray() 🔄 - Converte para array
     * Ex: arr.toArray();
     * 
     * forEach(Consumer c) 🚀 - Percorre a lista com expressão lambda
     * Ex: arr.forEach(e -> System.out.println(e));
     */

}
