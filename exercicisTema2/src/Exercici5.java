import java.util.Scanner;

/*
5- Escriu un programa que, donat un número (int) canvii tots els seus bits (els 0 per 1 i els 1 per 0).
 */
public class Exercici5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int num = scanner.nextInt();

        int cambioBit = ~num;

        System.out.println(cambioBit);
        System.out.println(Integer.toBinaryString(cambioBit));

    }
}
