package atividade01;

import atividade01.enums.Tema;

public class Main {
    public static void main(String[] args) {
        try {

            Biblioteca bib = new Biblioteca(3);

            System.out.println("Cheia? " + bib.isCheia() + " | Vazia? " + bib.isVazia());

            bib.adicionarLivro(new Livro("Cosmos", "Carl Sagan", Tema.ASTRONOMIA));
            bib.adicionarLivro(new Livro("Vreves Respostas para Grandes Questões", "Stephen Hawking", Tema.COSMOLOGIA));
            bib.adicionarLivro(new Livro("Rápido e Devagar", "Daniel Kahneman", Tema.NEUROCIENCIA));

            bib.listarLivros();
            System.out.println("Tamanho: " + bib.getQtdItensPreenchido() + "/" + bib.capacidade());

            bib.alterarLivro(2, "Uma Breve História do ", null, Tema.COSMOLOGIA, null);
            System.out.println("\nApós alterar id=2:");
            bib.listarLivros();

            boolean ok = bib.adicionarLivro(new Livro("O Universo Numa Casca de Noz", "Hawking", Tema.COSMOLOGIA));
            System.out.println("\nTentar incluir mais um (deve falhar): " + ok);
            bib.listarLivros();
            
            bib.removerLivro(1);
            System.out.println("\nApós remover id=1:");
            bib.listarLivros();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
