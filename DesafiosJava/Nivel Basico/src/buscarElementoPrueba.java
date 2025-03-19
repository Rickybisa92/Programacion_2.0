public class buscarElementoPrueba {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int elementoBuscado = 3;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == elementoBuscado) {
                encontrado = true;
                System.out.println("El elemento " + elementoBuscado + " se encuentra en la posición " + i);
            }
        }
        if (!encontrado) {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el array");
        }
    }
}
