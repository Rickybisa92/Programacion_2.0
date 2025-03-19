public class mayorValorPrueba {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
         int numeroMayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
        }
        System.out.println("El número mayor del array es: " + numeroMayor);
    }
}
