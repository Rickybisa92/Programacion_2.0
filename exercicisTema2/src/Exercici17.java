import java.util.Scanner;

/*
17- Fes un programa que, donades les variables “mes” i “dia” (de tipus int) que representen una
data de naixament d’una persona, emmagatzemi el valor “true” dins la variable “libra” si es
correspon a una data del signe zodiacal libra i el valor “false” si no és així.
 */
public class Exercici17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el mes (1-12):");
        int mes = scanner.nextInt();

        System.out.println("Dame el día(1-31):");
        int dia = scanner.nextInt();

        boolean libra = (mes == 9 && dia >= 23 || mes == 10 && dia <= 22 );


        /* Asi es como lo hice yo en un principio,
        lo he dejado para que lo puedas ver y decirme si esta opcion tambien estaria bien.

        String libra = (mes == 9 && dia >= 23 || mes == 10 && dia <= 22 ) ? "Es libra" : "No es libra";
        System.out.println(libra);

         */
    }
}
