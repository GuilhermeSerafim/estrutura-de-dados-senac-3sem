package challenge2;

import java.util.Scanner;
import java.util.StringJoiner;

// Guilherme da Silva Serafim - ID: 1143043623 - 3ªTADS Noite
// ADO 4 - Algoritmos de Grafos
public class AppGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();
        Scanner in = new Scanner(System.in);
        popularGrafo(grafo);
        imprimirGrafo(grafo);
        System.out.println("Digite um ponto de partida: ");
        String pontoPartida = in.nextLine();
        System.out.println("Digite um ponto de chegada: ");
        String pontoChegada = in.nextLine();
        System.out.println("Calculando menor caminho de " + pontoPartida + " até " + pontoChegada + "...");
        // Implementação do Dijkstra ficaria aqui
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
        grafo.adicionaArestaBidirecional("L", "M", 15.0); // Distância não visível no mapa (mensurei)
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
}
