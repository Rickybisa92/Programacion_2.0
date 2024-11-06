import java.util.Scanner;

/*
Objectiu: Refactoritza el codi creant una funció anomenada esPalindrom que determini si
una paraula és un palíndrom. Demana a l'usuari que introdueixi la paraula i mostra el
resultat de la funció.
 */
public class exercici7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String paraula = scanner.next();

        if (esPalindrom(paraula)) {
            System.out.println("La palabra es polindrome");
        } else {
            System.out.println("No es una palabra polindrome");
        }
    }

    public static boolean esPalindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i -
                    1)) {

                return false;

            }
        }
        return true;
    }
}
