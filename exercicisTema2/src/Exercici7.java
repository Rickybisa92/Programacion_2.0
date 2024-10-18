import java.util.Scanner;

/*
7- Escriu un programa que divideixi un número per 2 només emprant l’operació de desplaçament
bit a bit.
 */
public class Exercici7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero para dividir por 2:");
        int num = scanner.nextInt();

        int div2 = num >> 1;

        System.out.println("El resultado dividido por 2 es: " + div2);

    }
}
