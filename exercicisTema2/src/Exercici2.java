/*
2- Fes un programa que calculi l’àrea d’un triangle. A = (base * altura) / 2
 */

import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la base:");
        double base = scanner.nextInt();
        System.out.println("Escribe la altura:");
        double altura = scanner.nextInt();

        double areaTriangulo = (base * altura) / 2;

        System.out.println("El area es: " + areaTriangulo);

    }
}
