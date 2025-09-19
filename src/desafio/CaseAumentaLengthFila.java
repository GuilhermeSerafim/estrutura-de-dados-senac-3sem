package desafio;

import java.util.Scanner;

public class CaseAumentaLengthFila {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fila<Integer> fila = new Fila<Integer>(10);

        System.out.println(fila.getCount());
        System.out.println(fila.getLength());
        fila.adiciona(1);
        fila.adiciona(2);
        fila.adiciona(3);
        fila.adiciona(4);
        fila.adiciona(5);
        fila.adiciona(6);
        fila.adiciona(7);
        fila.adiciona(8);
        fila.adiciona(9);
        fila.adiciona(10);
        System.out.println(fila.getCount());
        System.out.println(fila.getLength());

        System.out.println("Adicionando um a mais do que o range...");
        fila.adiciona(11);
        System.out.println("Tamanho da fila atualizado (tamanhoAtual * 2): " + fila.getLength());
        in.close();
    }
}
