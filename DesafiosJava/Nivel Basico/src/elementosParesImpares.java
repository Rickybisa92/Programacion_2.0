public class elementosParesImpares {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares += 1;
            } else {
                impares += 1;
            }
        }
        System.out.println("El número de elementos pares es: " + pares);
    }
}
