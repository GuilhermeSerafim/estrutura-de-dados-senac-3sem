package aula03;

public class TestePilha {

    public static void main(String[] args) {
        // Primeiro a entrar é o último a sair - FILO (First in Last out)
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.adiciona(1);
        pilha.adiciona(2);
        pilha.adiciona(3);

        System.out.println("Dados da Pilha: " + pilha);
        System.out.println("Quantidade de dados na Pilha: " + pilha.tamanho());

        pilha.desempilha();

        System.out.println("Dados da Pilha: " + pilha);
        System.out.println("Quantidade de dados na Pilha: " + pilha.tamanho());

    }
}
