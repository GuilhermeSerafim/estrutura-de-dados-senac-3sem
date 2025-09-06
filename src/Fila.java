// FIFO - First In First Out
public class Fila<T> extends EstruturaEstatica<T> {
    // Boas práticas
    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        this.adiciona(elemento);
    }
    
    public T espiar() {
        if(this.estaVazia()) return null;
        return this.elementos[0];
    }

    public T desenfileira() {
        if(this.estaVazia()) return null;

        final int POS = 0;
        T elementoASerremovido = this.elementos[POS];
        this.remove(POS);
        return elementoASerremovido;
    }
}
