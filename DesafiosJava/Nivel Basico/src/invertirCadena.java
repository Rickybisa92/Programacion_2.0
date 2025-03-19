import java.util.Scanner;

public class invertirCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una cadena");
        String cadena = sc.nextLine();

        String cadenaInvertida = "";


        // Indicando que la variable i es igual a la longitud de la cadena menos 1, el bucle comenzara desde la ultima letra de la cadena
        for (int i = cadena.length() - 1; i >= 0; i--) {
            char letra = cadena.charAt(i);
            cadenaInvertida += letra;
        }
        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }
}
