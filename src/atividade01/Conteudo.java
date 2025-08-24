package atividade01;

import java.time.LocalDate;

import atividade01.enums.Formato;
import atividade01.enums.Nivel;
import atividade01.enums.Tema;

public class Conteudo {
    private Nivel nivel;
    private Tema tema;
    private Formato formato;
    private int id;
    private String titulo;
    private String autor;
    private boolean lido;
    private int notaPessoal;
    private String referenciaUrl;
    private LocalDate dataPublicacao;

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
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

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    public int getNotaPessoal() {
        return notaPessoal;
    }

    public void setNotaPessoal(int notaPessoal) {
        this.notaPessoal = notaPessoal;
    }

    public String getReferenciaUrl() {
        return referenciaUrl;
    }

    public void setReferenciaUrl(String referenciaUrl) {
        this.referenciaUrl = referenciaUrl;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

}
