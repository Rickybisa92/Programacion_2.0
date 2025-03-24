import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        arr = growArray(arr, 10);
        System.out.println(Arrays.toString(arr));

        // Crear un array de Strings
        String[] noms2 = new String[10];

        // Crear un ArrayList de Strings
        List<String> noms = new ArrayList<>();
        noms.add("Pepito");
        noms.add("Juanito");
        noms.add("Jaimito");

    }

    // Esta funcion crea un nuevo array de tamaño arr.length + size
    // y copia los elementos de arr en el nuevo array
    static int[] growArray(int[] arr, int size) {
        int[] newArr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}