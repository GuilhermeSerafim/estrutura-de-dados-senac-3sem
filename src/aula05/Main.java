package aula05;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> l = new ListaEncadeada<>();
        l.adiciona("Isabela");
        l.adiciona("Guilherme");
        l.adiciona("Aurora");
        NO n = l.get(2);
        System.out.println(n);
    }
}
