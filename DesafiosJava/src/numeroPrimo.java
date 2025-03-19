import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = sc.nextInt();
        boolean esPrimo = true;


        if (numero <= 1) {
            System.out.println("El número no es primo");
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");

            }
        }
    }
}

