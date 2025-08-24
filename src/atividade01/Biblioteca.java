package atividade01;

public class Biblioteca {
    private Vetor acervo;
    private int proximoId;
    private int capacidadeMaxima;

    public Biblioteca(int capacidade) {
        this.acervo = new Vetor(capacidade);
        this.capacidadeMaxima = capacidade;
        this.proximoId = 1;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

}