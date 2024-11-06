import java.util.Scanner;

public class exercici1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int a = scanner.nextInt();
        System.out.println("Dame otro numero: ");
        int b = scanner.nextInt();

        int suma = sumar(a,b);
        System.out.println("La suma es: " + suma);

    }

    public static int sumar(int n1, int n2) {
         int resultado = n1 + n2;
         return resultado;
    }
}
