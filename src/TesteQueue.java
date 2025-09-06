import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
    public static void main(String[] args) {
        // Instanciando como Linked, mas usando metodos da queue
        Queue<Integer> fila = new LinkedList<Integer>();
        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila.toString());

        // "Espiar"
        System.out.println(fila.peek());

        System.out.println(fila.remove());
        System.out.println("Fila depois de remover possilvemnete o primeiro da fila: " + fila.toString());
    }
}
