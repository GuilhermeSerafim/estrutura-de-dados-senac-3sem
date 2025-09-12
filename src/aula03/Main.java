package aula03;

public class Main {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.adiciona(1);
        pilha.adiciona(2);
        pilha.adiciona(3);

        System.out.println("Dados da Pilha: " + pilha.toString());
        System.out.println("Quantidade de dados na Pilha: " + pilha.tamanho());

        pilha.desempilha();

        System.out.println("Dados da Pilha: " + pilha.toString());
        System.out.println("Quantidade de dados na Pilha: " + pilha.tamanho());

    }
}
