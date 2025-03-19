import java.util.*;

public class boletoLoteriaCursoCorregido {
    static final int MIN = 1;
    static final int MAX = 50;
    static final int NUMEROS = 5;

    public static List<Integer> generarBoleto() {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < NUMEROS; i++) {
            int numero = generarNumero(); // Generamos un número aleatorio
            while (numeros.contains(numero)) { // Si el número ya está en la lista, generamos otro
                numero = generarNumero();
            }
            numeros.add(numero); // Añadimos el número a la lista
        }
        Collections.sort(numeros); // Ordenamos la lista
        return numeros;
    }

    private static int generarNumero() {
      return   (int)  (Math.random() * (MAX - MIN + 1)) + MIN;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            List<Integer> boleto = generarBoleto();
            System.out.println(boleto);
        }

    }
}
