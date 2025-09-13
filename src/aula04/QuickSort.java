package aula04;

public class QuickSort {
    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
            System.out.print(v[i] + " ");
        }

        ordenaQuickSort(v, 0, v.length - 1);
        System.out.println("Vetor ordenado");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    static void ordenaQuickSort(int[] v, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = participao(v, esquerda, direita);
            ordenaQuickSort(v, esquerda, p);
            ordenaQuickSort(v, p + 1, direita);
        }
    }

    private static int participao(int[] v, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivo = v[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true) {
            do {
                i++;
            } while (v[i] < pivo);
            do {
                j--;
            } while (v[j] > pivo);
            if (i >= j) {
                return j;
            }

            int aux = v[i];
            v[i] = v[j];
            v[j] = aux;

        }
    }
}
