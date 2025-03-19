import java.util.Scanner;

public class numeroAmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = sc.nextInt();
        int contadorDigitos = 0;
        int numeroOriginal = numero;

        numero = Math.abs(numero);

        while (numero > 0) {
            numero = numero / 10; // Quitamos el último dígito
            contadorDigitos++;
        }

        // Restauramos el valor original
        numero = numeroOriginal;
        int sumaPotencias = 0;


        for (int i = 0; i < contadorDigitos; i++) {
            int ultimoDigito = numero % 10; // Obtenemos el último dígito
            sumaPotencias += Math.pow(ultimoDigito, contadorDigitos); // Sumamos la potencia del último dígito
            numero = numero / 10; // Quitamos el último dígito
        }
            if (sumaPotencias == numeroOriginal) {
                System.out.println("El número es un número de Armstrong");
            } else {
                System.out.println("El número no es un número de Armstrong");
            }
    }
}
