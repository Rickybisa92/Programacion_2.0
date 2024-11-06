import java.util.Scanner;

/*
Objectiu: Refactoritza el codi creant una funció anomenada sumaTresNumeros que calculi
la suma de tres nombres. Demana a l'usuari que introdueixi aquests tres nombres i mostra
el resultat de la funció.
 */
public class exercici5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int a = scanner.nextInt();

        System.out.println("Dame otro numero: ");
        int b = scanner.nextInt();

        System.out.println("Dame otro numero: ");
        int c = scanner.nextInt();

        int suma = sumar(a, b, c);
        System.out.println("La suma dels nombres és: " + suma);
    }

    public static int sumar(int num1, int num2, int num3) {
        int resultado = num1 + num2 + num3;
        return resultado;
    }
}
