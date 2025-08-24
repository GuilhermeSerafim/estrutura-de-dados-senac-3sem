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
                opcao = letInt(in, "Opção: ");
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

    private static Object removerLivro(Scanner in, Biblioteca bib) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerLivro'");
    }

    private static Object alterarLivro(Scanner in, Biblioteca bib) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarLivro'");
    }

    private static int letInt(Scanner in, String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'letInt'");
    }

    private static void mostrarMenu() {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMenu'");
    }

    // Utils
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

    private static Tema temaPorIndice(int n) {
        Tema[] valores = Tema.values();
        if (n >= 1 && n <= valores.length)
            return valores[n - 1];
        return null;
    }

    private static void imprimirTemasNumerados() {
        Tema[] valores = Tema.values();
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%d) %s%n", i + 1, valores[i].getDescricao());
        }
    }
}
