package aula04;

public class BubbleSort {
    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
            System.out.print(v[i] + " ");
        }
        int a;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    a = v[i];
                    v[i] = v[j];
                    v[j] = a;
                }
            }
        }
        System.out.println("\nOrdenado: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
