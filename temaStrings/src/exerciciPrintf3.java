import java.util.Scanner;

public class exerciciPrintf3 {
    //Un programa que elimine caracteres duplicados ejemplo: "aaabbcdeee" --> "abcde"
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String resultado = simplicarString(str);
        System.out.println(resultado);
    }

   /* public static String eliminarDuplicados(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i);
            if ( c1 == c2 ) {
                res += c1;
                i++;
            } else {
            }
        }
        return res;
    } */

    public static String simplicarString(String str1) {
        int index = 0;
        char anterior = 0;
        String res = "";
        while (index < str1.length()) {
            char c = str1.charAt(index);
            if (c != anterior) {
                res += c;
            }
            index++;
            anterior = c;
        }
        return res;
    }
}
