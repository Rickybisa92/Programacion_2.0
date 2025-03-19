import java.util.Scanner;

public class numeroCapicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = sc.nextInt();
        int numeroInvertido = 0;
        int numeroOriginal = numero;

        int signoNegativo = (numero < 0) ? -1 : 1;
        numero = Math.abs(numero);

        while (numero > 0) {
            int ultimoDigito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;
            numero = numero / 10;
        }

        numeroInvertido = numeroInvertido * signoNegativo;

        if (numeroOriginal == numeroInvertido) {
            System.out.println("El número es capicúa");
        } else {
            System.out.println("El número no es capicúa");
        }

    }
}
