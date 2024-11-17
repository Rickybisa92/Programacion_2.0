import java.util.Scanner;

public class exerciciPrintf2 {
    //Saber si una palabra es polindrome

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una palabra: ");
        String palabra = scanner.nextLine();
        boolean esPolindrome = polindrome(palabra);
        if (esPolindrome) {
            System.out.println("La palabra es polindrome");
        } else {
            System.out.println("La palabra no es polindrome");
        }
    }
    public static boolean polindrome(String s){
        String girado = girarString(s);
        if (girado.equals(s)) {
            return true;
        }
        return false;
    }

    public static String girarString (String palabra){
        String res = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            res += palabra.charAt(i);
        }
        return res;
    }
}
