import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int a = scanner.nextInt();

        System.out.println("Introduce otro numero: ");
        int b = scanner.nextInt();


        int max = maximoDeDosNumero(a, b);
        System.out.println("El numero maximo es: " + max);
    }

    public static int maximoDeDosNumero(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
