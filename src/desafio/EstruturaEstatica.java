package desafio;

public class EstruturaEstatica<T> {
    public T[] elementos;
    public int count;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.count = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    public boolean adiciona(T elemento) {
        boolean capacidadeMaxima = this.count == this.elementos.length;
        if (capacidadeMaxima)
            aumentaCapacidade();
        this.elementos[this.count] = elemento;
        this.count++;
        return true;
    }

    public void adiciona(int posicao, T elemento) {
        boolean posicaoInvalida = posicao < 0 || posicao > count;
        boolean capacidadeMaxima = this.count == this.elementos.length;
        if (posicaoInvalida)
            throw new IllegalArgumentException("Posição Inválida");
        if (capacidadeMaxima)
            aumentaCapacidade();

        for (int i = this.count; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.count++;
    }

    private void aumentaCapacidade() {
        T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            // Populando array novo com os itens antigos
            elementosNovos[i] = this.elementos[i];
        }
        this.elementos = elementosNovos;
    }

    public int getCount() {
        return this.count;
    }

    public int getLength() {
        return this.elementos.length;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.count - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.count > 0) {
            s.append(this.elementos[this.count - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public boolean estaVazia() {
        return this.count == 0;
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < count)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < count - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        count--;
    }
}
