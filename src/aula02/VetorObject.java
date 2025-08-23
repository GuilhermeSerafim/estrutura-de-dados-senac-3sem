package aula02;


public class VetorObject {
    // Atributos
    public Object[] elementos;
    private int qtdItensPreenchido;

    // Metódos
    public VetorObject(int capacidade) {
        this.elementos = new Object[capacidade];
    }

    public void adiciona(Object elemento) throws Exception {
        if (this.qtdItensPreenchido < this.elementos.length) {
            this.elementos[qtdItensPreenchido++] = elemento;
        } else {
            throw new Exception("Full!");
        }
    }

    public int qtdItensPreenchido() {
        return this.qtdItensPreenchido;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.qtdItensPreenchido - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        // Essa frescura por causa da última virgula
        if (this.qtdItensPreenchido > 0) {
            s.append(this.elementos[this.qtdItensPreenchido - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public void remove(int posicao) throws Exception {
        if (posicao >= 0 && posicao < qtdItensPreenchido) {
            for (int i = posicao; i < this.qtdItensPreenchido - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.elementos[qtdItensPreenchido] = null;
            this.qtdItensPreenchido--;
        } else {
            throw new Exception("Posição Inválida");
        }
    }

}
