package atividade01.enums;

public enum Formato {
    ARTIGO("Artigo"),
    LIVRO("Livro"),
    CAPITULO("Capítulo"),
    PAPER("Paper"),
    PODCAST("Podcast"),
    VIDEO_LONGO("Vídeo Longo");

    private final String descricao;

    Formato(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
