import java.util.Scanner;

/*
Exercici 4: Dibuixar un triangle d'asteriscs amb for
Escriu un programa que imprimeixi un triangle d'asteriscs de n files (sent n un número
introduït per l'usuari). Per exemple, si l'usuari introdueix 4, el programa ha de mostrar:
*
**
***
****
 */
public class exercici4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num ; i++) {
            // i es la fila "*"
            for (int j = 1; j <= i ; j++) {
                // j es la columna "**"
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
