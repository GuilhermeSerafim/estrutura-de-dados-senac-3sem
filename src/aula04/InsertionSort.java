package aula04;

public class InsertionSort {
    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
            System.out.print(v[i] + " ");
        }
        System.out.println();
        int a, j;
        for (int i = 1; i < v.length; i++) {
            a = v[i];
            j = i - 1;
            while(j >= 0 && v[j] > a) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = a;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
