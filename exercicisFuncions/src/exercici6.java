import java.util.Scanner;

/*
Objectiu: Refactoritza el codi creant una funció anomenada esAnyDeTraspas que
determini si un any és de traspàs. Demana a l'usuari que introdueixi l'any i mostra el resultat
de la funció.
 */
public class exercici6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un año: ");
        int año = scanner.nextInt();

        boolean esDeTraspado = esAñoDeTraspaso(año);
        System.out.println("Es año de traspaso: " + esDeTraspado);

    }
    public static boolean esAñoDeTraspaso(int num) {
        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
