public class buscarElemento {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int elemento = 5;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == elemento) {
                encontrado = true;
                System.out.println("El elemento " + elemento + " ha sido encontrado en la posición " + i);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El elemento " + elemento + " no se encuentra en el array");
        }
    }
}
