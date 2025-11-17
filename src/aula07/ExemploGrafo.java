package aula07;

public class ExemploGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        // Agora imprimiu o Claudio pois foi o primeiro a ser adicionado
        // Fazendo com que a busca em largura inicie por ele
        grafo.adicionarVertice("Claudio");
        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Cleuza");
        grafo.adicionarVertice("Kleber");

        grafo.adicionarAresta("Paulo", "Lorenzo");
        grafo.adicionarAresta("Paulo", "Cleuza");
        grafo.adicionarAresta("Claudio", "Lorenzo");
        grafo.adicionarAresta("Claudio", "Paulo");
        grafo.adicionarAresta("Lorenzo", "Kleber");
        grafo.adicionarAresta("Kleber", "Cleuza");

        grafo.BuscaEmLargura();
    }
}
