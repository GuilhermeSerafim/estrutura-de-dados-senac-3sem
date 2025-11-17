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
        if (dado == null) {
            throw new IllegalArgumentException("O dado do vértice não pode ser nulo.");
        }
        Vertice<T> novoVertice = new Vertice<T>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Double peso, T dadoInicio, T dadoFim) {
        Vertice<T> inicio = this.getVertice(dadoInicio);
        Vertice<T> fim = this.getVertice(dadoFim);

        if (inicio == null || fim == null) {
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

        if (inicio == null || fim == null) {
            throw new IllegalArgumentException("Um dos vértices não existe no grafo.");
        }

        Aresta<T> aresta = new Aresta<T>(inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public Vertice<T> getVertice(T dado) {
        for (Vertice<T> v : this.vertices) {
            if (v.getDado().equals(dado)) {
                return v;
            }
        }
        return null;
    }

    // Documente esse metodo

    /**
     * Busca em largura (BFS - Breadth-First Search) é um algoritmo de
     * travessia ou busca em grafos que explora todos os vizinhos de um
     * vértice antes de avançar para os vértices de nível mais profundo.
     */
    public void BuscaEmLargura() {
        ArrayList<Vertice<T>> marcados = new ArrayList<Vertice<T>>();
        ArrayList<Vertice<T>> fila = new ArrayList<Vertice<T>>();
        Vertice<T> atual = this.vertices.get(0);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while (fila.size() > 0) {
            Vertice<T> visitado = fila.get(0);
            // Percorre todas as arestas de saída do vértice visitado
            for (int i = 0; i < visitado.getArestasSaida().size(); i++) {
                Vertice<T> proximo = visitado.getArestasSaida().get(i).getFim();
                // Se o vértice ainda não foi marcado, marca e adiciona na fila
                if (!marcados.contains(proximo)) {
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }

            }
            // Remove o vértice visitado da fila
            fila.remove(0);
        }
    }

    public void BuscaEmLarguraRecursiva(Vertice<T> atual, ArrayList<Vertice<T>> marcados) {
        marcados.add(atual);
        System.out.println(atual.getDado());

        for (int i = 0; i < atual.getArestasSaida().size(); i++) {
            Vertice<T> proximo = atual.getArestasSaida().get(i).getFim();

            if (!marcados.contains(proximo)) {
                BuscaEmLarguraRecursiva(proximo, marcados); // CHAMADA RECURSIVA → profundidade
            }
        }
    }

}
