import java.util.Scanner;

/*
Exercici 5: Números primers en un rang amb for
Crea un programa que mostri tots els números primers entre 1 i n, on n és un número
introduït per l'usuari. Utilitza un bucle for per realitzar-ho.
 */
public class exercici5 {
    public static void main(String[] args) {

            //Determinar si un numero es primo o no
            // un numero es primo si solo se puede dividir entre el mismo
            // y por 1 (que siempre es cierto)

            int n = 8;
            boolean esPrimo = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("El numero " + n + "es primo");
            }

            System.out.println("El numero " + n + "no es primo");


        /* Otra forma de como lo hice yo

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(i);
            }
        }

         */
        }
    }

