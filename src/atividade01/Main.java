package atividade01;

import java.util.Scanner;

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

    private static Object removerLivro(Scanner in, Biblioteca bib) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerLivro'");
    }

    private static Object alterarLivro(Scanner in, Biblioteca bib) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarLivro'");
    }

    private static Object pesquisarPorId(Scanner in, Biblioteca bib) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesquisarPorId'");
    }

    private static int letInt(Scanner in, String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'letInt'");
    }

    private static void incluirLivro(Scanner in, Biblioteca bib) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incluirLivro'");
    }

    private static void mostrarMenu() {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMenu'");
    }
}
