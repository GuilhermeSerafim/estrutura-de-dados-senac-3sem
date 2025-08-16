package aula01;

public class Main {
    public static void main(String[] args) throws Exception {
        // Criou um vetor de String que posição nulas em cada uma
        Vetor v = new Vetor(500);
        v.adiciona("a");
        v.adiciona("b");
        v.adiciona("c");
        System.out.println(v.toString());
    }
}
