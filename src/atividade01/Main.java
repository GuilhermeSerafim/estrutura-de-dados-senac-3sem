package atividade01;

public class Main {
    public static void main(String[] args) {
        try {
            Vetor v = new Vetor(5); // capacidade 5

            print("Inicial (espera vazio)", v);

            // adiciona 3 itens
            v.adiciona("A");
            v.adiciona("B");
            v.adiciona("C");
            print("Após adicionar A, B, C", v); // [A, B, C]

            // remove do meio (pos 1 -> "B")
            v.remove(1);
            print("Após remover pos 1 (B)", v); // [A, C]

            // adiciona mais 2 itens
            v.adiciona("D");
            v.adiciona("E");
            print("Após adicionar D, E", v); // [A, C, D, E]

            // remove do início (pos 0 -> "A")
            v.remove(0);
            print("Após remover pos 0 (A)", v); // [C, D, E]

            // remove do fim (pos = tamanho-1)
            v.remove(v.tamanho() - 1); // remove "E"
            print("Após remover último (E)", v); // [C, D]

            // testa get
            Object primeiro = v.get(0); // deve ser "C"
            System.out.println("get(0) = " + primeiro);

            // testa exceção: remover posição inválida
            try {
                v.remove(10); // inválida
            } catch (Exception e) {
                System.out.println("Remoção inválida OK -> " + e.getMessage());
            }

            // preenche até lotar
            v.adiciona("W");
            v.adiciona("X");
            v.adiciona("Y");
            print("Após preencher até a capacidade", v);

            // tenta adicionar além do limite
            try {
                v.adiciona("Z"); // estoura capacidade
            } catch (Exception e) {
                System.out.println("Capacidade atingida OK -> " + e.getMessage());
            }

            // status final
            System.out.println("Tamanho: " + v.tamanho());
            System.out.println("Está vazio? " + v.isEmpty());

        } catch (Exception e) {
            // qualquer erro inesperado nos testes
            e.printStackTrace();
        }
    }

    private static void print(String titulo, Vetor v) {
        System.out.println("\n=== " + titulo + " ===");
        System.out.println(v.toString());
        System.out.println("tamanho=" + v.tamanho() + " | vazio=" + v.isEmpty());
    }
}
