import java.util.Scanner;

/*
Objectiu: Refactoritza el codi creant una funció anomenada esParell que determini si un
número és parell o senar. Demana a l'usuari que introdueixi el número i mostra el resultat de
la funció.
 */
public class exercici3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int nombre = scanner.nextInt();
        if(esPar(nombre)) {
            System.out.println("es par");
        } else {
            System.out.println("Es impar");
        }
    }

    public static boolean esPar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
