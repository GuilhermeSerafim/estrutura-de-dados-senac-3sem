package aula06;

public class ListaDuplamenteEncadeada {
    private NoDuplo inicio;
    private NoDuplo fim;

    public ListaDuplamenteEncadeada() {
    }

    public ListaDuplamenteEncadeada(NoDuplo inicio, NoDuplo fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public NoDuplo getInicio() {
        return inicio;
    }

    public void setInicio(NoDuplo inicio) {
        this.inicio = inicio;
    }

    public NoDuplo getFim() {
        return fim;
    }

    public void setFim(NoDuplo fim) {
        this.fim = fim;
    }

    public void exibir() throws Exception {
        System.out.println("Lista -> ");
        NoDuplo aux = inicio;
        while (aux != null) {
            System.out.println(aux.dado + " -> ");
            aux = aux.proximo;
        }
        System.out.println("NULL\n");
    }

    public int tamanhoLista() throws Exception {
        NoDuplo aux = inicio;
        int tamanho = 0;
        while (aux != null) {
            tamanho++;
            System.out.println(aux.dado + " -> ");
            aux = aux.proximo;
        }
        return tamanho;
    }

    public void adicionar(String s) throws Exception {
        NoDuplo novoElemento = new NoDuplo(s);

        if (inicio == null) { // Lista está vazia
            novoElemento.proximo = null;
            novoElemento.anterior = null;
            inicio = novoElemento;
            fim = novoElemento;
        } else { // Lista NÃO está vazia (aqui é a mágica do O(1))

            // 1. O 'proximo' do novo elemento é null (ele é o último)
            novoElemento.proximo = null;

            // 2. O 'anterior' do novo elemento aponta para o antigo 'fim'
            novoElemento.anterior = this.fim;

            // 3. O 'proximo' do antigo 'fim' aponta para o novo elemento
            this.fim.proximo = novoElemento;

            // 4. Atualiza a referência 'fim' para o novo elemento
            this.fim = novoElemento;
        }
    }

}
