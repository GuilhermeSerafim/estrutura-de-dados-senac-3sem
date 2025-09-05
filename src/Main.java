public class Main {

    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>();
        System.out.println("Pilha está vazia? " + pilha.estaVazia());
        System.out.println("Dados da Pilha: " + pilha.toString());
        System.out.println("Quantidade de dados na Pilha: " + pilha.tamanho());
    }
}
