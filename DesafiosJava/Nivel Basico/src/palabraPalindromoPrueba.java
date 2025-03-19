import java.util.Scanner;

public class palabraPalindromoPrueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String cadena = scanner.nextLine().toLowerCase();

        boolean esPalindromo = true;

        for (int i = 0; i < cadena.length() / 2; i++) {
            char caracterInicio = cadena.charAt(i);
            char caracterFinal = cadena.charAt(cadena.length() - 1 - i);

            if (caracterInicio != caracterFinal) {
                System.out.println("La palabra no es palíndromo");
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palíndromo");
        }
    }
}
