package aula07;

public class ListaEncadeada<T> {
    private No inicio;
    private int tamanho = 0;
    private No ultimo;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + ", tamanho=" + tamanho + ", ultimo=" + ultimo + "]";
    }

    public int getTamanho() {
        return tamanho;
    }

}
