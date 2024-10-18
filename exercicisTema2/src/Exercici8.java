import java.util.Scanner;

/*
8- Escriu un programa que multipliqui per 9 un número emprant només l’operació de desplaçament
i l’operació de suma.
 */
public class Exercici8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero:");
        int num = scanner.nextInt();

        int multi9 = (num << 7 / 2) + num;

        System.out.println("El resultado multiplicado por 9 es: " + multi9);
    }
}
