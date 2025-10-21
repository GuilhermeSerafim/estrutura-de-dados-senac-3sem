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

}
