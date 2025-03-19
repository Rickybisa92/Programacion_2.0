public class mayorValorArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int mayor = numeros[0]; // Inicializamos la variable mayor con el primer elemento del array

        for (int i = 1; i < numeros.length; i++) { // Comenzamos el bucle desde el segundo elemento del array
            if (numeros[i] > mayor) { // Si el elemento actual es mayor que el valor de la variable mayor
                mayor = numeros[i]; // Asignamos el valor del elemento actual a la variable mayor
            }
        }
        System.out.println("El número mayor del array es: " + mayor);
    }
}
