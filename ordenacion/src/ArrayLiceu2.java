import java.util.Arrays;

public class ArrayLiceu2 {
    public static void main(String[] args) {
        int[] ar = generaArray(100_000_000);
        long millis = System.currentTimeMillis();
        //bubbleSort(ar);
        Arrays.sort(ar);
        long delta = System.currentTimeMillis() - millis;
        System.out.println("Tiempo de ejecucion: " + delta + " ms");
        //System.out.println(Arrays.toString(ar));
    }

    static int[] generaArray(int limit) {
        int[] ar = new int[limit];
        for (int i = 0; i < limit; i++) {
            ar[i] = (int) (Math.random() * 10_000);
        }
        return ar;
    }

    static void bubbleSort(int[] ar) {
        //Ordenadr de mayor a menos,
        //los numeros que hay dentro de la tabla "ar"
        for (int j = ar.length - 1; j >= 1; j--) {
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    int t = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = t;
                }
            }
        }
    }
}
