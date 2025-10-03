package aula07;

public class ListaEncadeada<T> {
    private No inicio;
    private int tamanho = 0;
    private No fim;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.tamanho++;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + ", tamanho=" + tamanho + ", fim=" + fim + "]";
    }

    public int getTamanho() {
        return tamanho;
    }

}
