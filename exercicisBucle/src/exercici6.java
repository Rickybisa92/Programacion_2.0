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
        int maximaSuma = scanner.nextInt();
        int suma = 0;
        int contador = 1;

        do {
            suma += contador;
            contador++;
        }

        while ( suma <= maximaSuma);
            System.out.println("He tenido que sumar " + (contador-1) + " termes");

        }
    }
