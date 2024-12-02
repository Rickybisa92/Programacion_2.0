import java.util.Scanner;

public class numerosEnSprueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe el numero de filas: ");
        int filas = scanner.nextInt();

        System.out.println("Escribe el numero de columnas: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int [filas][columnas];
        
        int n = 1;

        for (int i = 0; i < filas; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = n;
                    n++;
                }
            } else {
                for (int j = columnas -1; j >= 0; j--) {
                    matriz[i][j] = n;
                    n++;
                }
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
