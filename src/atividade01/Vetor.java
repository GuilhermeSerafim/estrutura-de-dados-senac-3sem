package atividade01;

public class Vetor {
    private Object[] elementos;
    private int qtdItensPreenchido;

    public Vetor(int capacidade) {
        if (capacidade <= 0)
            throw new IllegalArgumentException("Capacidade deve ser > 0");
        elementos = new Object[capacidade];
        qtdItensPreenchido = 0;
    }

    // Consultas básicas
    public boolean isEmpty() {
        return qtdItensPreenchido == 0;
    }

    public int getQtdItensPreenchido() {
        return qtdItensPreenchido;
    }

    public int capacidade() {
        return elementos.length;
    }

    public void adiciona(Object elemento) throws Exception {
        if (qtdItensPreenchido < elementos.length) {
            elementos[qtdItensPreenchido++] = elemento;
        } else {
            throw new Exception("Limite do vetor atingido.");
        }
    }

    /**
     * Retorna o elemento armazenado na posição indicada.
     *
     * @param posicao índice do elemento que se deseja obter (de 0 até qtdItensPreenchido - 1)
     * @return o objeto armazenado nessa posição, ou {@code null} caso a posição seja inválida
    */
    public Object get(int posicao) {
        if (posicao < 0 || posicao >= qtdItensPreenchido) {
            return null; // posição inválida
        }
        return elementos[posicao];
    }

    public void remove(int posicao) throws Exception {
        if (posicao >= 0 && posicao < qtdItensPreenchido) {
            // desloca tudo a partir da posição removida
            for (int i = posicao; i < qtdItensPreenchido - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            // limpa a última posição ocupada
            this.elementos[qtdItensPreenchido - 1] = null;
            this.qtdItensPreenchido--;
        } else {
            throw new Exception("Posição Inválida");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < qtdItensPreenchido - 1; i++) {
            s.append(elementos[i]);
            s.append(", ");
        }

        if (qtdItensPreenchido > 0) {
            s.append(elementos[qtdItensPreenchido - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
