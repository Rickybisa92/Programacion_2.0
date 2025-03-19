import java.util.Scanner;

public class sumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = sc.nextInt();

        int sumaDigitos = 0;

        while(numero > 0) {
            int ultimoDigito = numero % 10;
            sumaDigitos += ultimoDigito;
            numero = numero / 10;
        }
        System.out.println("La suma de los dígitos es: " + sumaDigitos);
    }
}
