package challenge.cases;

import challenge.CustomQueue;

public class CaseEnfileiraEEspia {
    public static void main(String[] args) {
        CustomQueue<Integer> fila = new CustomQueue<Integer>(10);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        System.out.println(fila);
        int x = fila.peek();
        System.out.println("Espiando o primeiro da fila: " + x);
    }
}
