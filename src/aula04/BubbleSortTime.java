package aula04;

public class BubbleSortTime {
    public static void main(String[] args) {
        int[] v = new int[1000000];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
        }

        long inicio = System.currentTimeMillis();
        int a;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[i]) {
                    a = v[j];
                    v[j] = v[i];
                    v[i] = a;
                }

            }
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (fim - inicio));

    }
}
