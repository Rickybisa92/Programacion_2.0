public class invertirArray {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5};

        for (int i = numeros.length - 1; i >= 0; i--) {
            int invertido = numeros[i];
            System.out.println(invertido);
        }
    }
}
