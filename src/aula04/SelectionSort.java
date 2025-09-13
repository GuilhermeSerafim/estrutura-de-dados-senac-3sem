package aula04;

public class SelectionSort {
    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
        }

        int menor_posicao, aux;
        for (int i = 0; i < v.length; i++) {
            menor_posicao = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[menor_posicao])
                    menor_posicao = j;
            }
            aux = v[menor_posicao];
            v[menor_posicao] = v[i];
            v[i] = aux;
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
