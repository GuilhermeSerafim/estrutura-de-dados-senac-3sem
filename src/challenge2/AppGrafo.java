package challenge2;

import java.util.*;

// Guilherme da Silva Serafim - ID: 1143043623 - 3ªTADS Noite
// ADO 4 - Estrutura de Dados - Desafio 2 - Grafos
public class AppGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();
        Scanner in = new Scanner(System.in);
        popularGrafo(grafo);
        imprimirGrafo(grafo);

        System.out.print("Digite um ponto de partida  (Ex: A): ");
        String pontoPartida = in.nextLine();

        System.out.print("Digite um ponto de chegada (Ex: B): ");
        String pontoChegada = in.nextLine();

        buscarDuasOpcoes(grafo, pontoPartida, pontoChegada);
        in.close();
    }

    public static void popularGrafo(Grafo<String> grafo) {
        grafo.adicionaVertice("A");
        grafo.adicionaVertice("B");
        grafo.adicionaVertice("C");
        grafo.adicionaVertice("D");
        grafo.adicionaVertice("E");
        grafo.adicionaVertice("F");
        grafo.adicionaVertice("G");
        grafo.adicionaVertice("H");
        grafo.adicionaVertice("I");
        grafo.adicionaVertice("J");
        grafo.adicionaVertice("K");
        grafo.adicionaVertice("L");
        grafo.adicionaVertice("M");
        grafo.adicionaVertice("N");
        grafo.adicionaVertice("O");
        grafo.adicionaVertice("P");
        grafo.adicionaVertice("Q");
        grafo.adicionaVertice("R");
        grafo.adicionaVertice("S");
        grafo.adicionaVertice("T");
        grafo.adicionaVertice("U");
        grafo.adicionaVertice("V");
        grafo.adicionaVertice("W");
        grafo.adicionaVertice("X");

        grafo.adicionaArestaBidirecional("A", "B", 300.0);
        grafo.adicionaArestaBidirecional("A", "V", 370.0);
        grafo.adicionaArestaBidirecional("A", "X", 317.0);

        // Lado Direito (B até K)
        grafo.adicionaArestaBidirecional("B", "C", 47.0);
        grafo.adicionaArestaBidirecional("C", "D", 62.0);
        grafo.adicionaArestaBidirecional("C", "H", 141.0);
        grafo.adicionaArestaBidirecional("D", "E", 8.0);
        grafo.adicionaArestaBidirecional("E", "F", 13.0);
        grafo.adicionaArestaBidirecional("E", "G", 230.0);
        grafo.adicionaArestaBidirecional("H", "I", 138.0);
        grafo.adicionaArestaBidirecional("I", "J", 153.0);
        grafo.adicionaArestaBidirecional("J", "K", 512.0);

        // Parte Inferior e Esquerda (K até Q)
        grafo.adicionaArestaBidirecional("K", "L", 135.0);
        grafo.adicionaArestaBidirecional("L", "M", 50.0);
        grafo.adicionaArestaBidirecional("L", "N", 187.0);
        grafo.adicionaArestaBidirecional("N", "O", 108.0);
        grafo.adicionaArestaBidirecional("O", "P", 82.0);
        grafo.adicionaArestaBidirecional("P", "Q", 215.0);

        // Parte Superior Esquerda e Centro (Q até U/V)
        grafo.adicionaArestaBidirecional("Q", "R", 97.0);
        grafo.adicionaArestaBidirecional("R", "S", 33.0);
        grafo.adicionaArestaBidirecional("R", "T", 243.0);
        grafo.adicionaArestaBidirecional("S", "T", 207.0);
        grafo.adicionaArestaBidirecional("S", "V", 38.0);
        grafo.adicionaArestaBidirecional("T", "U", 22.0);
        grafo.adicionaArestaBidirecional("U", "V", 210.0);
        grafo.adicionaArestaBidirecional("U", "X", 107.0);
    }

    public static void imprimirGrafo(Grafo<String> grafo) {
        System.out.println("Localizações e distancias respectivas:");
        for (Vertice<String> vertice : grafo.getVertices()) {
            System.out.print(vertice.getDado() + " até: ");

            StringJoiner joiner = new StringJoiner(", ");

            for (Aresta<String> aresta : vertice.getArestasSaida()) {
                joiner.add(aresta.getFim().getDado() + " (" + aresta.getPeso().intValue() + " Metros)");
            }

            System.out.println(joiner.toString());
        }
    }

    /**
     * Implementa o Algoritmo de Dijkstra para encontrar o caminho mais curto entre dois vértices.
     * * @param grafo O grafo contendo os vértices e arestas.
     * @param inicio O identificador (nome) do vértice de partida.
     * @param fim O identificador (nome) do vértice de destino.
     * @return Uma lista ordenada com os nomes dos vértices que compõem o caminho (ex: [A, B, C]), 
     * ou null caso não exista caminho.
     */
    public static List<String> calcularMenorCaminho(Grafo<String> grafo, String inicio, String fim) {
        Vertice<String> origem = grafo.getVertice(inicio);
        Vertice<String> destino = grafo.getVertice(fim);

        if (origem == null || destino == null) {
            System.out.println("Ponto de partida ou chegada inválido.");
            return null;
        }

        Map<Vertice<String>, Double> distancias = new HashMap<>();
        Map<Vertice<String>, Vertice<String>> predecessores = new HashMap<>();
        PriorityQueue<Vertice<String>> filaPrioridade = new PriorityQueue<>(
                (v1, v2) -> distancias.get(v1).compareTo(distancias.get(v2)));

        for (Vertice<String> v : grafo.getVertices()) {
            distancias.put(v, Double.MAX_VALUE);
        }
        distancias.put(origem, 0.0);
        filaPrioridade.add(origem);

        while (!filaPrioridade.isEmpty()) {
            Vertice<String> atual = filaPrioridade.poll();
            if (atual.equals(destino))
                break;

            for (Aresta<String> aresta : atual.getArestasSaida()) {
                Vertice<String> vizinho = aresta.getFim();
                Double novaDistancia = distancias.get(atual) + aresta.getPeso();

                if (novaDistancia < distancias.get(vizinho)) {
                    distancias.put(vizinho, novaDistancia);
                    predecessores.put(vizinho, atual);
                    filaPrioridade.remove(vizinho);
                    filaPrioridade.add(vizinho);
                }
            }
        }

        List<String> caminho = new LinkedList<>();
        Vertice<String> passo = destino;

        if (distancias.get(destino) == Double.MAX_VALUE) {
            System.out.println("Não há caminho possível.");
            return null;
        }

        while (passo != null) {
            caminho.add(0, passo.getDado());
            passo = predecessores.get(passo);
        }

        System.out.println("Trajeto: " + String.join(" -> ", caminho));
        System.out.println("Distância Total: " + distancias.get(destino).intValue() + " Metros");

        return caminho;
    }


    /**
     * Encontra e exibe até duas opções de rota entre dois pontos.
     * Utiliza uma heurística de penalidade de peso para forçar a descoberta de um caminho alternativo
     * sem desconectar o grafo.
     * * @param grafo O grafo a ser percorrido.
     * @param inicio Ponto de partida.
     * @param fim Ponto de chegada.
     */
    public static void buscarDuasOpcoes(Grafo<String> grafo, String inicio, String fim) {
        System.out.println("\n=== OPÇÃO 1 (Melhor Caminho) ===");
        List<String> caminho1 = calcularMenorCaminho(grafo, inicio, fim);

        if (caminho1 == null) {
            System.out.println("Nenhum caminho encontrado.");
            return;
        }

        List<Aresta<String>> arestasAlteradas = new ArrayList<>();

        for (int i = 0; i < caminho1.size() - 1; i++) {
            String origem = caminho1.get(i);
            String destino = caminho1.get(i + 1);
            
            Vertice<String> vOrigem = grafo.getVertice(origem);
            for (Aresta<String> aresta : vOrigem.getArestasSaida()) {
                if (aresta.getFim().getDado().equals(destino)) {
                    aresta.setPeso(aresta.getPeso() * 10.0);
                    arestasAlteradas.add(aresta);
                }
            }
            
            Vertice<String> vDestino = grafo.getVertice(destino);
            for (Aresta<String> aresta : vDestino.getArestasSaida()) {
                if (aresta.getFim().getDado().equals(origem)) {
                    aresta.setPeso(aresta.getPeso() * 10.0); 
                    arestasAlteradas.add(aresta);
                }
            }
        }

        System.out.println("\n=== OPÇÃO 2 (Rota Alternativa) ===");
        List<String> caminho2 = calcularMenorCaminho(grafo, inicio, fim);

        if (caminho2 == null) {
            System.out.println("Não existe uma segunda opção viável.");
        }

        for (Aresta<String> aresta : arestasAlteradas) {
            aresta.setPeso(aresta.getPeso() / 10.0);
        }
    }
}
