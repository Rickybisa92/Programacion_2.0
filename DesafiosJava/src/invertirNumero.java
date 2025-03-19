import java.util.Scanner;

public class invertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = sc.nextInt();
        int numeroInvertido = 0;


        while (numero > 0) {
            int ultimoDigito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;
            numero = numero / 10;
        }
        System.out.println("El número invertido es: " + numeroInvertido);
    }
}
