import java.util.*;

public class ListArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 3, 4, 5);

        System.out.println(arr);


        Integer[] arr2 = {1, 2, 3, 4, 5};
        List<Integer> list2 = Arrays.asList(arr2);

        int[] arr3 = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            arr3[i] = list2.get(i);
        }

        Integer[] arr4 = new Integer[0];
        arr4 = list2.toArray(arr4);
        System.out.println("-----------------");
        
    }

    static List<Integer> calculaDivisors(int n) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                resultado.add(i);
            }
        }
        return resultado;
    }
}
