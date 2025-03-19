import java.util.Scanner;

public class numeroParImpar {
    public static void main(String[] args) {
        // Escribe un programa que pida un número al usuario y muestre si es par o impar.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
