public class Main {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i = 1; i < 11; i++) {
            pilha.adiciona(i);
        }

        System.out.println("Dados da Pilha: " + pilha.toString());
        System.out.println("Quantidade de dados na Pilha: " + pilha.tamanho());

        pilha.desempilha();

        System.out.println("Dados da Pilha: " + pilha.toString());
        System.out.println("Quantidade de dados na Pilha: " + pilha.tamanho());

    }
}
