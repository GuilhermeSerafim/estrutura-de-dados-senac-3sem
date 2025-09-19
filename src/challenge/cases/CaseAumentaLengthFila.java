package challenge.cases;

import java.util.Scanner;

import challenge.CustomQueue;

public class CaseAumentaLengthFila {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CustomQueue<Integer> fila = new CustomQueue<Integer>(10);

        System.out.println(fila.getCount());
        System.out.println(fila.getLength());
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);
        fila.enqueue(7);
        fila.enqueue(8);
        fila.enqueue(9);
        fila.enqueue(10);
        System.out.println(fila.getCount());
        System.out.println(fila.getLength());
        
        fila.enqueue(11);
        System.out.println(fila.getCount());
        System.out.println(fila.getLength());
        in.close();
    }
}
