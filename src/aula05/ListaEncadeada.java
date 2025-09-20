package aula05;

public class ListaEncadeada<T> {
    private NO inicio;
    private NO fim;
    private int tamanho;

    public ListaEncadeada() {
        tamanho = 0;
    }

    public NO getInicio() {
        return inicio;
    }

    public void setInicio(NO inicio) {
        this.inicio = inicio;
    }

    public NO getFim() {
        return fim;
    }

    public void setFim(NO fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + ", fim=" + fim + ", tamanho=" + tamanho + "]";
    }

    public void adiciona(T elemento) {
        NO<T> celula = new NO<T>(elemento);
        if (this.inicio == null && this.fim == null) {
            this.inicio = celula;
            this.fim = celula;
        } else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }

    public NO get(int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            return null;
        }
        NO atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void remover(T elemento) {
        NO anterior = null;
        NO atual = this.inicio;

        for (int i = 0; i < getTamanho(); i++) {
            if (atual.getElemento().equals(elemento)) {
                if (this.tamanho == 1) {
                    this.inicio = null;
                    this.fim = null;
                } else if (atual == inicio) {
                    this.inicio = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == fim) {
                    this.fim = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                }
                    atual = null;
                    this.tamanho--;
                    break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
}
