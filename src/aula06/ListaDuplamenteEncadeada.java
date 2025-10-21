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

}
