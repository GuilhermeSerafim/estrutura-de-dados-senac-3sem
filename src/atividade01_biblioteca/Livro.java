package atividade01_biblioteca;

public class Livro {
    private Tema tema;
    private int id; // Gerado pela biblioteca
    private String titulo;
    private String autor;
    private boolean lido;

    public Livro(String titulo, String autor, Tema tema) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.lido = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    @Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", tema=" + tema.getDescricao() + ", lido=" + lido
                + "]";
    }
    
}
