package desafio.cases;

import java.util.Scanner;

import desafio.Fila;

public class CaseAumentaLengthFila {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fila<Integer> fila = new Fila<Integer>(10);

        System.out.println(fila.getCount());
        System.out.println(fila.getLength());
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        fila.enfileira(5);
        fila.enfileira(6);
        fila.enfileira(7);
        fila.enfileira(8);
        fila.enfileira(9);
        fila.enfileira(10);
        System.out.println(fila.getCount());
        System.out.println(fila.getLength());

        System.out.println("enfileirando um a mais do que o range...");
        fila.enfileira(11);
        System.out.println("Tamanho da fila atualizado (tamanhoAtual * 2): " + fila.getLength());
        in.close();
    }
}
