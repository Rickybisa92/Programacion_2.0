import java.util.Scanner;

public class exerciciPrintf1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pon una palabra: ");
        String palabra = scanner.nextLine();

        System.out.println(buscarPalabra(palabra));
    }

    public static String girarString (String palabra){
        String res = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            res += palabra.charAt(i);
        }
        return res;
    }

    public static String buscarPalabra (String s){
        boolean entrePalabras = true;
        int index = 0;
        String res = "";
        String palabra = "";
        while (index < s.length()){
            char c = s.charAt(index);
            if (c == ' ' && entrePalabras == false){
                res += girarString(palabra);
                palabra = "";
            }
            entrePalabras = (c == ' ');
            if (!entrePalabras){
                palabra += c;
            }else {
                res += " ";
            }
            index++;
        }

        if (palabra.length() > 0){
            res += girarString(palabra);
        }
        return res;
}

}
