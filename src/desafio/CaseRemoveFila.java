package desafio;

public class CaseRemoveFila {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>(10);
        fila.adiciona(1);
        fila.adiciona(2);
        fila.adiciona(3);
        System.out.println(fila);
        System.out.println("Quantidades preenchidas da fila: " + fila.getCount());

        System.out.println();

        System.out.println("Desenfileira: ");
        fila.desenfileira();
        System.out.println(fila);
        System.out.println("Quantidades preenchidas da fila: " + fila.getCount());
    }
}
