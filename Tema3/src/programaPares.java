import java.util.Scanner;

/*
Haz un programa que le pida al usuario numeros
si los numeros son pares, sigue pidiendote numeros
si es inpar, el programa se detiene
 */
public class programaPares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean esPar = true;
        while (esPar) {
            int num = scanner.nextInt();
            if (num % 2 != 0) {
                System.out.println("El numero " + num + " no es par");
                esPar = false;
            }
        }
    }
}
