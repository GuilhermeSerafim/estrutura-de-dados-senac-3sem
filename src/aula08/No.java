package aula08;

public class No {
    int info;
    No right;
    No left;
    // int level;
    // No pai; // Isso permite que não precisamos usar recursão para subir na árvore

    public No(int info) {
        this.info = info;
        this.right = null;
        this.left = null;
    }
}
