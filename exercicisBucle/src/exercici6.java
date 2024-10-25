import java.util.Scanner;

/*
Exercici 6: Mitjana de qualificacions amb while
Escriu un programa que permeti a l'usuari introduir n qualificacions i calculi la mitjana de
totes elles. L'entrada de qualificacions finalitza quan l'usuari introdueix un número negatiu.
Utilitza un bucle while per a aquest exercici.
 */
public class exercici6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int contador = 0;
        int total;
        int suma = 0;

        while ( n >= 0) {
            System.out.println("Introduce una calificación: ");
            n = scanner.nextInt();

            if (n >= 0) {
                suma += n;
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            long redondeoMedia = Math.round(media);
            System.out.println("La media de las calificaciones es: " + redondeoMedia);
        } else {
            System.out.println("No se han introducido calificaciones.");
        }
    }
}
