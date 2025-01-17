
// 1- Implementa una classe anomenada «QuadratMagic»
// que tingui un mètode «void imprimeix(int n)»
// que mostri el quadrat següent (segons la dimensió que passem com a paràmetre):

import java.util.Scanner;

public class exercici1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tamaño quieres el cuadrado?");
        // Crear un objeto de la clase Cuadrado
        QuadratMagic cuadrado = new QuadratMagic(scanner.nextInt());
        // Llamar al método imprimeix con el valor 5
        cuadrado.imprimeix();
    }
}

class QuadratMagic {
    int n;
    int[][] arr; // Matriz para el cuadrado mágico

    // Constructor que crea y llena la matriz
    public QuadratMagic(int n) {
        this.n = n;
        this.arr = new int[n][n];
        // Llenar la matriz según la lógica
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    // Primera fila y primera columna son 1
                    arr[i][j] = 1;
                } else {
                    // Suma de la celda de arriba y la de la izquierda
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
    }

            // Imprimir la matriz

        public void imprimeix() {
            for (int i = 0; i < n; i++) {
                int espacio = calcuaDigits(arr[arr.length -1][arr.length -1]);
                for (int j = 0; j < n; j++) {
                    String s = "%-" + espacio + "d ";
                    System.out.printf(s, arr[i][j]);
                }
                System.out.println();
            }
        }

        private int calcuaDigits(int n) {
            int dec = 10;
            int cont = 1;
            while (true) {
                if (n < dec) return cont;
                cont++;
                dec *= 10;

            }
            }

        }