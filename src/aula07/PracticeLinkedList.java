package aula07;

import java.util.LinkedList;

public class PracticeLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("List after adding elements: " + list);

        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        String elementAt1 = list.get(1);
        System.out.println("Element at index 1: " + elementAt1);

        int indexOfC = list.indexOf("C");
        System.out.println("Index of element 'C': " + indexOfC);

        int size = list.size();
        System.out.println("Size of the list: " + size);
    }
}
