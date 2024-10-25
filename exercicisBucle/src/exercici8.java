import java.util.Scanner;

/*
Exercici 8: Imprimir números en ordre invers amb for
Escriu un programa que demani un número n i després imprimeixi els números des de n fins
a 1 en ordre invers utilitzant un bucle for.
 */
public class exercici8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }




    }
}
