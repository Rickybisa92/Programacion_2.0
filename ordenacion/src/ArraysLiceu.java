import java.util.Arrays;

public class ArraysLiceu {
    public static void main(String[] args) {
        int[] ar = {5, 6, 7, 8, 4, 3};
        //bubbleSort(ar);
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
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
