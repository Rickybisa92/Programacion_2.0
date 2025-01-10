import java.util.Arrays;

public class ordenacionEscoba {
    public static void main(String[] args) {
        int[] ar = {5, 7, 4, 1, 9, -3, 4, 2, 3, 6, 8, 0, 10};
        ordenacionEscoba(ar);
        System.out.println(Arrays.toString(ar));
    }

    static void ordenacionEscoba(int[] ar) {
        int right = ar.length - 1;
        int left = 0;

        while (left < right) {
            for (int i = left; i < right; i++) {
                if (ar[i] > ar[i + 1]) {
                    int t = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = t;
                }
            }
            right--;
            System.out.println(Arrays.toString(ar));

            for (int i = right; i >= left; i--) {
                if (ar[i] > ar[i + 1]) {
                    int t = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = t;
                }
            }
            left++;
            System.out.println(Arrays.toString(ar));
        }
    }
}
