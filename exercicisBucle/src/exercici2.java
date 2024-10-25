import java.util.Scanner;

/*
Exercici 2: Generar una sèrie de números utilitzant for
Crea un programa que imprimeixi els primers n números de la sèrie: 1, 4, 9, 16,
25... (és a dir, els quadrats dels números naturals), on n és un número introduït per
l'usuari. Utilitza un bucle for.
 */
public class exercici2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int n = scanner.nextInt();
        int resultado = 0;

        for (int i = 1; i <= n; i++) {
            resultado = i * i;
            System.out.println(resultado);
        }
    }
}
