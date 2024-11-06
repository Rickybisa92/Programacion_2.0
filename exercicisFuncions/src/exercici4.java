import java.util.Scanner;

/*
Objectiu: Refactoritza el codi creant una funció anomenada convertirAMajuscules que
converteixi una frase a majúscules. Demana a l'usuari que introdueixi la frase i mostra el
resultat de la funció.
 */
public class exercici4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        String palabra = scanner.nextLine();
        System.out.println(convertirMayusculas(palabra));


    }
    public static String convertirMayusculas(String s) {
        String majuscula = s.toUpperCase();
        return majuscula;
    }
}
