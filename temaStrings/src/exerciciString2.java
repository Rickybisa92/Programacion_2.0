import java.util.Scanner;
// Haz una funcion que al introducir un String, lo repita por el numero de veces que le han escrrito
public class exerciciString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que String quieres introducir: ");
        String palabra = scanner.nextLine();

        System.out.println("Repeticion del String: ");
        int repetirString = scanner.nextInt();



        String resultadoFinal = repetcionString(repetirString,palabra);
        System.out.println(resultadoFinal);

    }

    public static String repetcionString(int repeticiones, String palabra) {
        String res = "";
        for (int i = 0; i < repeticiones; i++) {
            if (i == 0) {
                res = palabra;
            } else {
                res += " " + palabra;
            }
        }
        return res;
    }

}
