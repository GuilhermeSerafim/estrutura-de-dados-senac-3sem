package aula02;

public class Main {
    public static void main(String[] args) throws Exception {
        Vetor v = new Vetor(500);
        v.adiciona("opa");
        v.adiciona("opa1");
        v.adiciona("opa2");
        v.remove(1);
        System.out.println(v.toString());
    }
}
