package atividade01.enums;

public enum Tema {
    ASTRONOMIA("Astronomia"),
    COSMOLOGIA("Cosmologia"),
    NEUROCIENCIA("Neurociência"),
    TECNOLOGIA("Tecnologia"),
    FISICA_QUANTICA("Física Quântica"),
    MATERIA_ESCURA("Matéria Escura"),
    PRODUTIVIDADE("Produtividade");

    private final String descricao;

    Tema(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
