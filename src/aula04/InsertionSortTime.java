package aula04;

public class InsertionSortTime {
    public static void main(String[] args) {
        int[] v = new int[1000000];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
        }

        long s = System.currentTimeMillis();
        int a, j;
        for (int i = 1; i < v.length; i++) {
            a = v[i];
            j = i - 1;
            while (j >= 0 && v[j] > a) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = a;
        }
        long e = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (e - s));
    }
}
