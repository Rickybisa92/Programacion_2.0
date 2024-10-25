import java.util.Scanner;

/*
Exercici 5: Números primers en un rang amb for
Crea un programa que mostri tots els números primers entre 1 i n, on n és un número
introduït per l'usuari. Utilitza un bucle for per realitzar-ho.
 */
public class exercici5 {
    public static void main(String[] args) {

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
    }
}
