import java.util.Arrays;

public class invertirArrayPrueba {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = numeros.length - 1; i >= 0; i--) {
            int numeroInvertido = numeros[i];
            System.out.print(Arrays.toString(new int[]{numeroInvertido}));
        }
    }
}
