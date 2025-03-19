import java.util.Scanner;

public class contadorVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una palabra");
        String palabra = sc.nextLine();
        int contarVocales = 0;
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contarVocales++;
            }
        }
        System.out.println("La palabra " + palabra + " tiene " + contarVocales + " vocales");
    }
}
