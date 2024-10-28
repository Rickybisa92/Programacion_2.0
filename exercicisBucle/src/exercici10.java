import java.util.Scanner;

/*
Exercici 10: Piràmide de números amb for
Escriu un programa que generi una piràmide de números com la següent, on n és el nombre
de files (introduït per l'usuari):
1
22
333
4444
...
nnnnn...n (n vegades)

Cada fila i ha de contenir el número i repetit i vegades. Utilitza un bucle for per
aconseguir-ho.
 */
public class exercici10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el numero de filas que quieres:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
