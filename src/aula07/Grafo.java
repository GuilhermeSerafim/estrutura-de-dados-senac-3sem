package aula07;

import java.util.ArrayList;

// Vertice = Nó
// Aresta = Ligação entre os nós
public class Grafo<T> {
    private ArrayList<Vertice<T>> vertices;
    private ArrayList<Aresta<T>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice<T>>();
        this.arestas = new ArrayList<Aresta<T>>();
    }

    public void adicionarVertice(T dado) {
        if(dado == null) {
            throw new IllegalArgumentException("O dado do vértice não pode ser nulo.");
        }
        Vertice<T> novoVertice = new Vertice<T>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Double peso, T dadoInicio, T dadoFim) {
        Vertice<T> inicio = this.getVertice(dadoInicio);
        Vertice<T> fim = this.getVertice(dadoFim);

        if(inicio == null || fim == null) {
            throw new IllegalArgumentException("Um dos vértices não existe no grafo.");
        }

        Aresta<T> aresta = new Aresta<T>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }
    public void adicionarAresta(T dadoInicio, T dadoFim) {
        Vertice<T> inicio = this.getVertice(dadoInicio);
        Vertice<T> fim = this.getVertice(dadoFim);

        if(inicio == null || fim == null) {
            throw new IllegalArgumentException("Um dos vértices não existe no grafo.");
        }

        Aresta<T> aresta = new Aresta<T>(inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public Vertice<T> getVertice(T dado) {
        Vertice<T> vertice = null;
        for (int i = 0; i < this.vertices.size(); i++) {
            Vertice<T> verticeAtual = this.vertices.get(i);
            if (verticeAtual.getDado().equals(dado)) {
                vertice = verticeAtual;
                break;
            }
        }
        return vertice;
    }

}
