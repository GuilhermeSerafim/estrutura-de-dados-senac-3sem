package aula08;

public class No {
    int info;
    No direita;
    No esquerda;
    // int level;
    // No pai; // Isso permite que não precisamos usar recursão para subir na árvore

    public No(int info) {
        this.info = info;
        this.direita = null;
        this.esquerda = null;
    }
}
