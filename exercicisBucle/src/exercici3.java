import java.util.Scanner;

/*
Exercici 3: Comptar números positius i negatius amb do...while
Escriu un programa que permeti a l'usuari introduir números fins que introdueixi un 0. El
programa ha de comptar quants d'aquests números van ser positius i quants negatius
utilitzant un bucle do...while.
 */
public class exercici3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int positivo = 0;
        int negativo = 0;


        do {
            System.out.println("Dame un numero:");
             n = scanner.nextInt();
             if ( n > 0) {
                 positivo++;
             } else if (n < 0) {
                 negativo++;
             }
        } while (n != 0);
        System.out.println("Numeros positivos: " + positivo + " y numero negativos: " + negativo);
    }
}
