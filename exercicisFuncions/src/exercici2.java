import java.util.Scanner;

/*
Objectiu: Refactoritza el codi creant una funció anomenada factorial que calculi el
factorial d'un número donat. Demana a l'usuari que introdueixi el número i mostra el resultat
de la funció.
 */
public class exercici2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Añade un numero para ver su factorial: ");
        int n = scanner.nextInt();
        int factorial = factorial(n);
        System.out.println("El factorial de 5 és: " + factorial);
    }

    public static int factorial(int num) {
        num = 1;
        for (int i = 1; i <= 5; i++) {
            num *= i;
        }
        return num;
    }

}
