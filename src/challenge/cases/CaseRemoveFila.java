package challenge.cases;

import challenge.CustomQueue;

public class CaseRemoveFila {
    public static void main(String[] args) {
        CustomQueue<Integer> fila = new CustomQueue<Integer>(10);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        System.out.println(fila);
        System.out.println("Quantidades preenchidas da fila: " + fila.getCount());

        System.out.println();

        System.out.println("Desenfileira: ");
        fila.dequeue();
        System.out.println(fila);
        System.out.println("Quantidades preenchidas da fila: " + fila.getCount());
    }
}
