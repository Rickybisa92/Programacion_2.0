import java.util.Scanner;

public class mayorDeTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Dame el segundo número");
        int numero2 = sc.nextInt();
        System.out.println("Dame el tercer número");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("El número mayor es: " + numero3);
        }
    }
}
