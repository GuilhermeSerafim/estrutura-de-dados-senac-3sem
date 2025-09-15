package aula03;
import java.util.Stack;

public class TesteStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.size());
        System.out.println(stack);
        // Verifica topo
        System.out.println(stack.peek());

        // Método para desempilhar
        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
