package aula01;

import java.util.Arrays;

public class Vetor {
    // Atributos
    public String[] elementos;
    private int tamanho;

    // Metódos
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[tamanho++] = elemento;
        } else {
            throw new Exception("Full!");
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        // Essa frescura por causa da última virgula
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

}
