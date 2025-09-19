package desafio.cases;

import desafio.Fila;

public class CaseEnfileiraEEspia {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>(10);
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        System.out.println(fila);
        int x = fila.espiar();
        System.out.println("Espiando o primeiro da fila: " + x);
    }
}
