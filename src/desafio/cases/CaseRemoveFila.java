package desafio.cases;

import desafio.Fila;

public class CaseRemoveFila {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>(10);
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        System.out.println(fila);
        System.out.println("Quantidades preenchidas da fila: " + fila.getCount());

        System.out.println();

        System.out.println("Desenfileira: ");
        fila.desenfileira();
        System.out.println(fila);
        System.out.println("Quantidades preenchidas da fila: " + fila.getCount());
    }
}
