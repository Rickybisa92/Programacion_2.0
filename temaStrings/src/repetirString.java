import java.util.Scanner;

public class repetirString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que String quieres poner: ");
        String frase = scanner.nextLine();

        System.out.println("Repeticion del String: ");
        int repetirString = scanner.nextInt();


        String resultado = repetirString(repetirString, frase);
        System.out.println(resultado);

    }

    public static String repetirString(int repeticiones, String s) {
        String res = ""; // Donde se imprimiran todas las palabras repetidas
        for (int i = 0; i < repeticiones; i++) {
            if (i == 0) {
                res = s; //cuando i es 0, significa que estamos agregando la primera palabra,
                // y no queremos un espacio antes de esta primera palabra para que el formato de la cadena sea correcto.
            } else {
                res += " " + s;
            }
        }
        return res;
    }
}
