package atividade01;

public class Vetor {
    public Object[] elementos;
    private int qtdItensPreenchido;

    public Vetor(int capacidade) {
        this.elementos = new Object[capacidade];
    }

    public int getQtdItensPreenchido() {
        return qtdItensPreenchido;
    }

    public void adiciona(Object elemento) throws Exception {
        if (this.qtdItensPreenchido < this.elementos.length) {
            this.elementos[qtdItensPreenchido++] = elemento;
        } else {
            throw new Exception("Limite do vetor atingido.");
        }
    }

    public void remove(int posicao) throws Exception {
        if (posicao >= 0 && posicao < qtdItensPreenchido) {
            for (int i = 0; i < this.qtdItensPreenchido - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.elementos[qtdItensPreenchido] = null;
            this.qtdItensPreenchido--;
        } else {
            throw new Exception("Posição Inválida");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.qtdItensPreenchido - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.qtdItensPreenchido > 0) {
            s.append(this.elementos[this.qtdItensPreenchido - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
