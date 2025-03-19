import java.util.Scanner;

public class juegosJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = sc.nextInt();
        int contadorPares = 0;
        int contadorImpares = 0;
        int sumaImpares = 0;

        while (numero > 0) {
            int ultimoDigiuto = numero % 10;
            numero = numero / 10;

            if (ultimoDigiuto % 2 != 0) {
                sumaImpares += ultimoDigiuto;
            }

        }
        System.out.println("La suma de los impares es: " + sumaImpares);

    }
}
