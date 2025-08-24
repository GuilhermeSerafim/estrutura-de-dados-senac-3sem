package atividade01;

import atividade01.enums.Tema;

public class Biblioteca {
    private Vetor acervo;
    private int proximoId;
    private int capacidadeMaxima; // espelho da capacidade do vetor

    public Biblioteca(int capacidade) {
        this.acervo = new Vetor(capacidade);
        this.capacidadeMaxima = capacidade;
        this.proximoId = 1; // primeiro livro cadastrado receberá ID 1
    }

    public boolean isVazia() {
        return acervo.isEmpty();
    }

    public boolean isCheia() {
        return acervo.getQtdItensPreenchido() >= capacidadeMaxima;
    }

    public int getQtdItensPreenchido() {
        return acervo.getQtdItensPreenchido();
    }

    public int capacidade() {
        return acervo.capacidade();
    }

    // CRUD

    // Crete
    public boolean adicionarLivro(Livro livro) {
        if (livro == null)
            return false;
        if (isCheia())
            return false;
        if (livro.getTitulo() == null || livro.getTitulo().isBlank())
            return false;
        if (livro.getAutor() == null || livro.getAutor().isBlank())
            return false;
        if (livro.getTema() == null)
            return false;

        livro.setId(proximoId++);

        try {
            acervo.adiciona(livro);
            return true;
        } catch (Exception e) {
            // Deve ocorrer só se a capacidade estourar
            return false;
        }
    }

    // Read
    public void listarLivros() throws Exception {
        if (acervo.isEmpty()) {
            System.out.println("Acervo vazio.");
            return;
        }
        int n = acervo.getQtdItensPreenchido();
        for (int i = 0; i < n; i++) {
            System.out.println((Livro) acervo.get(i));
        }
    }

    // Read por id
    public Livro buscarPorId(int id) throws Exception {
        int idx = indicePorId(id);
        if (idx == -1)
            return null;
        return (Livro) acervo.get(idx);
    }

    // Read por título
    public Livro buscarPrimeiroPorTitulo(String termo) throws Exception {
        if (termo == null || termo.isBlank())
            return null;
        String alvo = termo.toLowerCase();
        int n = acervo.getQtdItensPreenchido();
        for (int i = 0; i < n; i++) {
            Livro l = (Livro) acervo.get(i);
            if (l.getTitulo() != null && l.getTitulo().toLowerCase().contains(alvo))
                return l;
        }
        return null;
    }

    // Update
    public boolean alterarLivro(int id, String novoTitulo, String novoAutor, Tema novoTema, Boolean lido) {
        try {
            int idx = indicePorId(id);
            if (idx == -1)
                return false;
            Livro alvo = (Livro) acervo.get(idx);

            if (novoTitulo != null && !novoTitulo.isBlank())
                alvo.setTitulo(novoTitulo);
            if (novoAutor != null && !novoAutor.isBlank())
                alvo.setAutor(novoAutor);
            if (novoTema != null)
                alvo.setTema(novoTema);
            if (lido != null)
                alvo.setLido(lido);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Delete por id
    public boolean removerLivro(int id) {
        int idx = indicePorId(id);
        if (idx == -1)
            return false;
        try {
            acervo.remove(idx);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Helpers

    private int indicePorId(int id) {
        int n = acervo.getQtdItensPreenchido();
        for (int i = 0; i < n; i++) {
            try {
                Livro l = (Livro) acervo.get(i);
                if (l.getId() == id)
                    return i;
            } catch (Exception e) {
                return -1;
            }
        }
        return -1;
    }
}
