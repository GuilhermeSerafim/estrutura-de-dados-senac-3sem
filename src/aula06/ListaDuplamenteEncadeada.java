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

    public void adicionar(String s) {
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

    public void adicionar(String s, int i) throws Exception {

        // (Ineficiente, mas usando seu método tamanhoLista())
        int tam = tamanhoLista();

        // ERRO 1 (CORRIGIDO) - Validação correta
        if (i < 0 || i > tam) {
            throw new Exception("Posição Inválida! Posição: " + i + ", Tamanho: " + tam);
        }

        NoDuplo novoElemento = new NoDuplo(s);

        // --- Caso 1: Adicionar no Início (i == 0) ---
        if (i == 0) {
            if (inicio == null) { // Lista estava vazia
                // ERRO 2 (CORRIGIDO) - Atualiza inicio e fim
                inicio = novoElemento;
                fim = novoElemento;
            } else { // Lista já tinha elementos
                novoElemento.proximo = inicio;
                inicio.anterior = novoElemento;
                inicio = novoElemento;
            }
        }
        // --- Caso 2: Adicionar no Fim (i == tam) ---
        // (Esta é uma otimização, já que temos o 'fim'. Seu código faria isso no
        // 'else')
        else if (i == tam) {
            novoElemento.anterior = fim;
            fim.proximo = novoElemento;
            fim = novoElemento;
        }
        // --- Caso 3: Adicionar no Meio (i > 0 e i < tam) ---
        else {
            NoDuplo aux = inicio; // aux está no índice 0

            // ERRO 3 (CORRIGIDO) - Navega até a posição i-1
            // Queremos parar 'aux' no nó ANTERIOR (i-1)
            for (int contador = 1; contador < i; contador++) {
                aux = aux.proximo;
            }

            // 'aux' está no nó (i-1). Vamos inserir 'novoElemento' DEPOIS dele.
            NoDuplo proximoNo = aux.proximo; // O nó que atualmente está em 'i'

            // ERRO 4 (CORRIGIDO) - Refazendo todas as 4 conexões

            // 1. O 'proximo' do novo aponta para o 'proximoNo'
            novoElemento.proximo = proximoNo;

            // 2. O 'anterior' do novo aponta para 'aux'
            novoElemento.anterior = aux;

            // 3. O 'proximo' de 'aux' aponta para o 'novoElemento'
            aux.proximo = novoElemento;

            // 4. O 'anterior' do 'proximoNo' aponta para o 'novoElemento'
            // (Isso só pode ser feito se proximoNo não for null)
            if (proximoNo != null) {
                proximoNo.anterior = novoElemento;
            }
            // (Se proximoNo fosse null, estaríamos no fim,
            // mas já tratamos isso no 'else if (i == tam)')
        }
    }

}
