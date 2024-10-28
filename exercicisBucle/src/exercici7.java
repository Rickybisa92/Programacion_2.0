import java.util.Scanner;

/*
Exercici 7: Nombre de termes per superar un valor amb do...while
Crea un programa que sumi termes consecutius (1, 2, 3,...) fins que la suma superi un
valor S introduït per l'usuari. Utilitza un bucle do...while per calcular quants termes van
ser necessaris per superar S.
 */
public class exercici7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int n = scanner.nextInt();

        int suma = 0;
        int sumaTermes = 0;


        do {
            suma += sumaTermes;
            sumaTermes++;
            System.out.println(sumaTermes);


        } while (suma <= n);
    }
}
