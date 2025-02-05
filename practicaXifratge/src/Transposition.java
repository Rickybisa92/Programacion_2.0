
public class Transposition {

    static String cypher(String s, int dim) {
        char[][] matriz = matrizCifrado(s, dim);
        return leerColumnas(matriz, dim);
    }

    private static char[][] matrizCifrado(String s, int dim) {
        int filas = s.length() / dim; // Número de filas
        if (s.length() % dim != 0) {
            filas++;
        }

        char[][] matriz = new char[filas][dim]; // Rellenar por filas
        int index = 0; // Indice de la cadena

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < dim; j++) {
                if (index < s.length()) {
                    matriz[i][j] = s.charAt(index);
                    index++;
                } else {
                    matriz[i][j] = '\0';
                }
            }
        }
        return matriz;
    }

    static String leerColumnas(char[][] matriz, int dim) {
        String result = "";
        for (int j = 0; j < dim; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] != '\0') {
                    result += matriz[i][j];
                }
            }
        }
        return result;
    }


    static String decypher(String s, int dim) {
        char [][] matriz = matrizDescifrado(s, dim);
        return leerFilas(matriz);
    }

    private static char[][] matrizDescifrado(String s, int dim) {
        int filas = (s.length() + dim - 1) / dim;

        char[][] matriz = new char[filas][dim];
        int index = 0;
        int extraChars = s.length() % dim;

        for (int j = 0; j < dim; j++) { // Rellenar por columnas
            int limite = (j < extraChars || extraChars == 0) ? filas : filas - 1;
            for (int i = 0; i < limite; i++) {
                if (index < s.length()) {
                    matriz[i][j] = s.charAt(index);
                    index++;
                } else {
                    matriz[i][j] = '\0';
                }
            }
        }
        return matriz;
    }

    static String leerFilas(char[][] matriz) {
        String result = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != '\0') {
                    result += matriz[i][j];
                }
            }
        }
        return result;
    }

    static String cypher(String s, String key) {


        return "";
    }


    static String decypher(String s, String key) {

        return "";
    }

}
