import java.util.Scanner;

public class exerciciPrintf {
    public static void main(String[] args) {
        //Pedir un string al usuario  y imprimirlo girado
        //Ejemplo: liceu --> uecil

        //Dada una frase, gire cada palabra individualmente

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un String: ");
        String s = scanner.nextLine();

        String resultado = girarString(s);
        System.out.println(resultado);
    }

    public static String girarString(String s){
        String res = "";
        for (int i = (s.length()-1); i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
