import java.util.Scanner;

/*
Exercici 9: Seqüència de Collatz amb while
Escriu un programa que demani un número a l'usuari i generi la seqüència de Collatz. La
seqüència de Collatz es defineix així:
● Si el número és parell, es divideix entre 2.
● Si és senar, es multiplica per 3 i se suma 1. El bucle continua fins que el número
sigui 1. Utilitza un bucle while per a aquest exercici.
 */
public class exercici9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num = scanner.nextInt();

        while (num != 1) {
            if (num % 2 == 0) {
                System.out.println(num + " es par, se divide por 2: ");
                num = num / 2;
            } else  {
                System.out.println(num + " es impar, se multiplica por 3 y se le suma 1: ");
                num = num * 3 + 1;
            }
            System.out.println(num);

        }
    }
}
