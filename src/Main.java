public class Main {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println("Verifica se a Pilha está vazia: " + pilha.estaVazia());
        System.out.println("Informação no Topo da Pilha: " + pilha.topo());

        for (int i = 1; i < 11; i++) {
            pilha.adiciona(i);
        }
        
        System.out.println("Pilha está vazia? " + pilha.estaVazia());
        System.out.println("Informação no Topo da Pilha: " + pilha.topo());
        
        System.out.println("Dados da Pilha: " + pilha.toString());
        System.out.println("Quantidade de dados na Pilha: " + pilha.tamanho());


    }
}
