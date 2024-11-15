import java.util.Scanner;
//Generar un String con los numeros hasta el maximo
public class exerciciString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero maximo: ");
        int max = scanner.nextInt();

        String resultado ="";

        for (int i = 1; i <= max; i++) {
            resultado += " " + i;
        }

        System.out.println(resultado);


    }
}
