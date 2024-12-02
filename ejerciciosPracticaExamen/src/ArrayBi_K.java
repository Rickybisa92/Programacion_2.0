import java.util.Scanner;

public class ArrayBi_K {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tamaño de la letra
        int n = solicitarTamano(scanner);

        // Validar el tamaño ingresado
        if (!esTamanoValido(n)) {
            System.out.println("El tamaño debe ser al menos 3 para formar la letra K.");
            return;
        }

        // Crear e inicializar la matriz
        char[][] matriz = crearMatriz(n);

        // Llenar la matriz con la forma de la letra K
        rellenarColumnaIzquierda(matriz);
        rellenarDiagonales(matriz);

        // Imprimir la matriz
        imprimirMatriz(matriz);
    }

    private static int solicitarTamano(Scanner scanner) {
        System.out.print("Ingrese el tamaño de la letra K (n): ");
        return scanner.nextInt();
    }

    private static boolean esTamanoValido(int n) {
        return n >= 3;
    }

    private static char[][] crearMatriz(int n) {
        char[][] matriz = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }
        return matriz;
    }

    private static void rellenarColumnaIzquierda(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = '*';
        }
    }

    private static void rellenarDiagonales(char[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n / 2; i++) {
            matriz[i][n / 2 - i] = '*'; // Diagonal superior
            matriz[n - 1 - i][n / 2 - i] = '*'; // Diagonal inferior
        }
    }

    private static void imprimirMatriz(char[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}

