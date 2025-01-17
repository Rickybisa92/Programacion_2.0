
// 1- Implementa una classe anomenada «QuadratMagic»
// que tingui un mètode «void imprimeix(int n)»
// que mostri el quadrat següent (segons la dimensió que passem com a paràmetre):

public class exercici1 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Cuadrado
        QuadratMagic cuadrado = new QuadratMagic();
        // Llamar al método imprimeix con el valor 5
        cuadrado.imprimeix(5);
    }
}

    class QuadratMagic {
        // Método para imprimir el cuadrado mágico
        public void imprimeix(int n) {
            // Crear la matriz
            int[][] square = new int[n][n];

            // Llenar la matriz según la lógica
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0) {
                        // Primera fila y primera columna son 1
                        square[i][j] = 1;
                    } else {
                        // Suma de la celda de arriba y la de la izquierda
                        square[i][j] = square[i - 1][j] + square[i][j - 1];
                    }
                }
            }

            // Imprimir la matriz
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(square[i][j] + " ");
                }
                System.out.println();
            }
        }
    }