import java.util.Scanner;

public class exempleStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        //String es un "objeto" al igual que Scanner
        String s = scanner.nextLine();
        String ss = "12345";
        int i = 12_345;


        int nVocals = 0;
        int nConsonantes = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (esVocal(c)) {
                nVocals++;
            } else if (esConsonante(c)) {
                nConsonantes++;
            }
        }

        System.out.println("Hay " + nVocals + " vocales, y " + nConsonantes + " consonantes");
    }

    public static boolean esVocal(char character) {

        String vocalesMin = "aeiou";
        for (int i = 0; i < vocalesMin.length(); i++) {
            char vocals = vocalesMin.charAt(i);
            if (character == vocals) return true;
            if (character == vocals + 32) return true;
        }
        return false;
    }

        public static boolean esConsonante ( char character){
            String consonantes = "bcdfghjklmnpqrstvwxyz";
            for (int i = 0; i < consonantes.length(); i++) {
                char cons = consonantes.charAt(i);
                if (cons == character) return true;
                if (character == cons - 32) return true;

            }
            return false;
        }
}
