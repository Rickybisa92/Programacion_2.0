/*

1- Escriu un programa que sumi, resti, divideixi i multipliqui dos números. Fes-ho dos cops: primer
amb int i després amb double

 */

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num1 = scanner.nextInt();;
        System.out.println("Dame otro numero:");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int dividir = num1 / num2;
        int multiplicar = num1 * num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La division de " + num1 + " y " + num2 + " es: " + dividir);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicar);

        double n1 = num1;
        double n2 = num2;

        double sumad = n1 + n2;
        double restad = n1 - n2;
        double dividird = n1 / n2;
        double multiplicard = n1 * n2;

        System.out.println("La suma de " + n1 + " y " + n2 + " es: " + sumad);
        System.out.println("La resta de " + n1 + " y " + n2 + " es: " + restad);
        System.out.println("La division de " + n1 + " y " + n2 + " es: " + dividird);
        System.out.println("La multiplicación de " + n1 + " y " + n2 + " es: " + multiplicard);

    }
}
