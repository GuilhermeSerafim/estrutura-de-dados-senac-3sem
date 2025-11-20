package challenge2;

public class AppGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();
        popularGrafo(grafo);
        imprimirGrafo(grafo);
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

        grafo.adicionaAresta("A", "B", 300.0);
        grafo.adicionaAresta("A", "V", 370.0);
        grafo.adicionaAresta("A", "X", 317.0);

        // Lado Direito (B até K)
        grafo.adicionaAresta("B", "C", 47.0);
        grafo.adicionaAresta("C", "D", 62.0);
        grafo.adicionaAresta("C", "H", 141.0);
        grafo.adicionaAresta("D", "E", 8.0);
        grafo.adicionaAresta("E", "F", 13.0);
        grafo.adicionaAresta("E", "G", 230.0);
        grafo.adicionaAresta("H", "I", 138.0);
        grafo.adicionaAresta("I", "J", 153.0);
        grafo.adicionaAresta("J", "K", 512.0);

        // Parte Inferior e Esquerda (K até Q)
        grafo.adicionaAresta("K", "L", 135.0);
        grafo.adicionaAresta("L", "M", 15.0); // Distância não visível no mapa (mensurei)
        grafo.adicionaAresta("L", "N", 187.0);
        grafo.adicionaAresta("N", "O", 108.0);
        grafo.adicionaAresta("O", "P", 82.0);
        grafo.adicionaAresta("P", "Q", 215.0);

        // Parte Superior Esquerda e Centro (Q até U/V)
        grafo.adicionaAresta("Q", "R", 97.0);
        grafo.adicionaAresta("R", "S", 33.0);
        grafo.adicionaAresta("R", "T", 243.0);
        grafo.adicionaAresta("S", "T", 207.0);
        grafo.adicionaAresta("S", "V", 38.0);
        grafo.adicionaAresta("T", "U", 22.0);
        grafo.adicionaAresta("U", "V", 210.0);
        grafo.adicionaAresta("U", "X", 107.0);
    }

    public static void imprimirGrafo(Grafo<String> grafo) {
        for (Vertice<String> vertice : grafo.getVertices()) {
            System.out.print("Vértice " + vertice.getDado() + " conectado a: ");
            for (Aresta<String> aresta : vertice.getArestasSaida()) {
                System.out.print(aresta.getFim().getDado() + " (" + aresta.getPeso().intValue() + " Metros" + "), ");
            }
            System.out.println();
        }
    }
}
