import java.util.Scanner;

/*
18- Escriu un programa que donat un any, dins la variable “any”, escrigui el valor “true” dins la
variable “esBixest” si aquest any és bixest i “false” si no és així. Segons la wikipedia:
 */
public class Exercici18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un año:");
        int año = scanner.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0 )) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
    }
}
