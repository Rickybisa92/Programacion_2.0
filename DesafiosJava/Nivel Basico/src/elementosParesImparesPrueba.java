public class elementosParesImparesPrueba {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
                System.out.println("El número " + numeros[i] + " es par");
            } else {
                impares++;
                System.out.println("El número " + numeros[i] + " es impar");
            }
        }
        System.out.println("El número de elementos pares es: " + pares);
        System.out.println("El número de elementos impares es: " + impares);
    }
}
