package aula07;

import java.util.ArrayList;

public class ExemploGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        // Agora imprimiu o Claudio pois foi o primeiro a ser adicionado
        // Fazendo com que a busca em largura inicie por ele
        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Cleuza");
        grafo.adicionarVertice("Kleber");
        grafo.adicionarVertice("Claudio");

        grafo.adicionarAresta("Paulo", "Lorenzo");
        grafo.adicionarAresta("Paulo", "Cleuza");
        grafo.adicionarAresta("Claudio", "Lorenzo");
        grafo.adicionarAresta("Claudio", "Paulo");
        grafo.adicionarAresta("Lorenzo", "Kleber");
        grafo.adicionarAresta("Kleber", "Cleuza");

        System.out.println("Busca em largura:");
        grafo.BuscaEmLargura(grafo.getVertice("Claudio"));

        System.out.println("Busca em profundidade:");
        grafo.dfs(grafo.getVertice("Claudio"), new ArrayList<Vertice<String>>());
    }
}
