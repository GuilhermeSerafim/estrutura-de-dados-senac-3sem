package aula07;

public class ExemploGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Cleuza");
        grafo.adicionarVertice("Kleber");
        grafo.adicionarVertice("Claudio");

        grafo.adicionarAresta("Paulo", "Lorenzo");
        grafo.adicionarAresta("Lorenzo", "Kleber");
        grafo.adicionarAresta("Kleber", "Cleuza");
        grafo.adicionarAresta("Paulo", "Cleuza");
        grafo.adicionarAresta("Claudio", "Lorenzo");
        grafo.adicionarAresta("Claudio", "Paulo");

        grafo.BuscaEmLargura();
    }
}
