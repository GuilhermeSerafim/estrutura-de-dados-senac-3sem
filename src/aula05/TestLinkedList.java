package aula05;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Guilherme");
        linkedList.add("Isabella");
        linkedList.add("Aurora");
        System.out.println(linkedList);

        linkedList.addFirst("Start");
        linkedList.addLast("End");
        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println(linkedList.get(1));
    }
}
