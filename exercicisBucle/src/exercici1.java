/*
Exercici 1: Sumar les xifres d'un número utilitzant while
Escriu un programa que demani un número a l'usuari i sumi totes les seves xifres utilitzant
un bucle while. Per exemple, si l'usuari introdueix 123, el programa ha de retornar 6 (1 + 2
+ 3).
 */

import java.util.Scanner;

public class exercici1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int num = scanner.nextInt();

        int divisor = 1_000_000;
        int cociente = 0;
        int residuo = 0;
        int suma = 0;

        while (divisor > 0) {
            cociente = num / divisor;
            residuo = num % divisor;
            suma = suma + cociente;
            num = residuo;
            divisor = divisor / 10;
        }
        System.out.println("La suma de los digitos es: " + suma);
    }
}

