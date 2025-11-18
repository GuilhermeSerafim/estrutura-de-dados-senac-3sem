package aula08;

public class ExemploArvore {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.insert(50, arvore.root);
        arvore.insert(30, arvore.root);
        arvore.insert(70, arvore.root);
        arvore.insert(20, arvore.root);
        arvore.insert(40, arvore.root);
        arvore.insert(60, arvore.root);
        arvore.insert(80, arvore.root);

        System.out.println("Percurso em pré-ordem:");
        arvore.preOrder(arvore.root);

        System.out.println("Percurso em ordem:");
        arvore.inOrder(arvore.root);
    }
}
