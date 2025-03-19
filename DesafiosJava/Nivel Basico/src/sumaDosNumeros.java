import java.util.Scanner;

public class sumaDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero1 = sc.nextInt();
        System.out.println("Dame otro número");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma de los dos números es: " + suma);
    }
}
