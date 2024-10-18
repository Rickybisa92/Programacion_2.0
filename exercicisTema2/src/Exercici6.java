import java.util.Scanner;

/*
6- Escriu un programa que multipliqui per 8 un número emprant només l’operació de desplaçament
bit a bit.
 */
public class Exercici6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero para multiplicar por 8:");
        int num = scanner.nextInt();

        int multi8 = num << 3;

        System.out.println("El resultado multiplicado por 8 es: " + multi8);
    }
}
