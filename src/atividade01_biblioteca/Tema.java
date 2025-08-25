package atividade01_biblioteca;

public enum Tema {
    ASTRONOMIA("Astronomia"),
    COSMOLOGIA("Cosmologia"),
    NEUROCIENCIA("Neurociência"),
    TECNOLOGIA("Tecnologia"),
    FISICA_QUANTICA("Física Quântica"),
    MATERIA_ESCURA("Matéria Escura"),
    PRODUTIVIDADE("Produtividade"),
    OUTRO("Outro");

    private final String descricao;

    Tema(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}
