package atividade01;

import java.util.Scanner;

import atividade01.enums.Tema;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Biblioteca bib = new Biblioteca(100);
        int opcao;
        try {

            do {
                mostrarMenu();
                opcao = lerInt(in, "Opção: ");
                switch (opcao) {
                    case 1 -> incluirLivro(in, bib);
                    case 2 -> pesquisarPorId(in, bib);
                    case 3 -> alterarLivro(in, bib);
                    case 4 -> removerLivro(in, bib);
                    case 5 -> bib.listarLivros();
                    case 0 -> System.out.println("Até mais, Astro! 🌌");
                    default -> System.out.println("Opção inválida.");
                }
                System.out.println();
            } while (opcao != 0);
            in.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Ações
    private static void incluirLivro(Scanner in, Biblioteca bib) {
        System.out.println("\n--- Incluir Livro ---");
        System.out.println("Título: ");
        String titulo = in.nextLine().trim();

        System.out.println("Autor: ");
        String autor = in.nextLine().trim();

        Tema tema = lerTema(in);

        boolean ok = bib.adicionarLivro(new Livro(titulo, autor, tema));
        System.out.println(ok ? "✔ Incluído com sucesso." : "✘ Falha ao incluir (dados inválidos ou acervo cheio).");
    }

    private static void pesquisarPorId(Scanner in, Biblioteca bib) {
        System.out.println("\n --- Pesquisar por ID ---");
        int id = lerInt(in, "ID: ");
        Livro l = bib.buscarPorId(id);
        System.out.println(l != null ? l : "Não encontrado.");
    }

    private static void alterarLivro(Scanner in, Biblioteca bib) {
        System.out.println("\n --- Alterar Livro ---");
        int id = lerInt(in, "ID: ");
        Livro atual = bib.buscarPorId(id);
        if (atual == null) {
            System.out.println("ID não encontrado.");
            return;
        }
        System.out.println("Atual: " + atual);
        System.out.print("Novo Título (enter p/ manter): ");
        String novoTitulo = in.nextLine().trim();
        if (novoTitulo.isBlank())
            novoTitulo = null;

        System.out.print("Novo Autor (enter p/ manter): ");
        String novoAutor = in.nextLine().trim();
        if (novoAutor.isBlank())
            novoAutor = null;

        System.out.print("Novo Tema (enter p/ manter): ");
        Tema novoTema = lerTemaOpcional(in); // Pode retornar null

        System.out.print("Marcar como lido? (s = lido, n = não lido, enter = manter: )");
        String s = in.nextLine().trim().toLowerCase();
        Boolean lido = s.equals("s") ? Boolean.TRUE : s.equals("n") ? Boolean.FALSE : null;

        boolean ok = bib.alterarLivro(id, novoTitulo, novoAutor, novoTema, lido);

        System.out.println(ok ? "✔ Alterado." : "✘ Não foi possível alterar.");
    }

    private static void removerLivro(Scanner in, Biblioteca bib) {
        System.out.println("\n --- Remover Livro ---");
        int id = lerInt(in, "ID ");
        boolean ok = bib.removerLivro(id);
        System.out.println(ok ? "✔ Removido." : "✘ ID não encontrado.");
    }

    // Utils
    private static void mostrarMenu() {
        System.out.println("=== LibAstros (Array + Vetor) ===");
        System.out.println("1) Incluir livro");
        System.out.println("2) Pesquisar por ID");
        System.out.println("3) Alterar livro");
        System.out.println("4) Remover livro");
        System.out.println("5) Listar livros");
        System.out.println("0) Sair");
    }

    private static Tema lerTema(Scanner in) {
        while (true) {
            System.out.println("tema:");
            imprimirTemasNumerados();
            int n = lerInt(in, "Escolha (número): ");
            Tema t = temaPorIndice(n);
            if (t != null)
                return t;
            System.out.println("Opção de tema inválida.\n");
        }
    }

    private static Tema lerTemaOpcional(Scanner in) {
        System.out.println("Temas disponíveis (ou enter p/ manter):");
        imprimirTemasNumerados();
        System.out.println("Escolha (número ou enter): ");
        String s = in.nextLine().trim();
        if (s.isBlank())
            return null;
        try {
            int n = Integer.parseInt(s);
            return temaPorIndice(n);
        } catch (Exception e) {
            System.out.println("Entrada inválida. Mantendo tema atual.");
            return null;
        }
    }

    private static int lerInt(Scanner in, String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                String s = in.nextLine().trim();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    private static void imprimirTemasNumerados() {
        Tema[] valores = Tema.values();
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%d) %s%n", i + 1, valores[i].getDescricao());
        }
    }

    private static Tema temaPorIndice(int n) {
        Tema[] valores = Tema.values();
        if (n >= 1 && n <= valores.length)
            return valores[n - 1];
        return null;
    }
}
