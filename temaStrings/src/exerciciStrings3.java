import java.util.Scanner;

public class exerciciStrings3 {
    public static void main(String[] args) {
        //recibe una frase y que cambie la primera letra de cada palabra
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        boolean entreParaules = true;

        String resultat = tranformaPrimeraLetra(frase,entreParaules);
        System.out.println(resultat);
    }

    private static String tranformaPrimeraLetra(String frase, boolean entreParaules) {
        String resultat = "";
        for (int i = 0; i <frase.length() ; i++) {

            char c = frase.charAt(i);
            if (c != ' ' && entreParaules){
                //comenza una palabra nueva
                resultat += (char) (c -32);
            } else {
                resultat += c;
            }
            if (c == ' '){
                entreParaules = true;
            } else {
                entreParaules = false;
            }

        }
        return resultat;
}


}