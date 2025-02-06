
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
        char[][] matriz = matrizDescifrado(s, dim);
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
        Integer[] indice = ordenarClave(key);
        char[][] matriz = rellenarMatriz(s, key.length());
        return leerColumnas(matriz, indice);
    }

    static Integer[] ordenarClave(String clave) {
        int longitudClave = clave.length();
        Integer[] indice = new Integer[longitudClave]; // Array de índices

        // Inicializar los índices con su posición original
        for (int i = 0; i < longitudClave; i++) {
            indice[i] = i;
        }

        // Ordenar los índices manualmente con el algoritmo de la burbuja
        for (int i = 0; i < longitudClave - 1; i++) {
            for (int j = 0; j < longitudClave - i - 1; j++) {
                if (clave.charAt(indice[j]) > clave.charAt(indice[j + 1])) {
                    // Intercambiar los índices si están en el orden incorrecto
                    int temp = indice[j];
                    indice[j] = indice[j + 1];
                    indice[j + 1] = temp;
                }
            }
        }

        return indice;
    }


    static char[][] rellenarMatriz(String s, int columnas) {
        int filas = (s.length() + columnas + 1) / columnas; // Calcular el número de filas
        char[][] matriz = new char[filas][columnas]; // Crear la matriz
        int indice = 0; // Indice de la cadena

        // Rellenar la matriz con el texto
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (indice < s.length()) {
                    matriz[i][j] = s.charAt(indice++);
                } else {
                    matriz[i][j] = '\0'; // Usar un carácter nulo para marcar espacios vacíos
                }
            }
        }
        return matriz;
    }

    static String leerColumnas(char[][] matriz, Integer[] indice) {
        int totalChars = matriz.length * matriz[0].length; // Número total de caracteres en la matriz
        char[] result = new char[totalChars]; // Array para almacenar la cadena cifrada
        int k = 0; // Indice del resultado final de la cadena cifrada

        // Leer las columnas en el orden dado por los índices
        for (int col : indice) {
            for (int i = 0; i < matriz.length; i++) {
                // Solo añadir caracteres que no sean espacios innecesarios
                if (matriz[i][col] != '\0') {
                    result[k++] = matriz[i][col];
                }
            }
        }

        return new String(result, 0, k);
    }


    static String decypher(String s, String key) {
        Integer[] indice = ordenarClaveInverso(key);
        char[][] matriz = reconstruirMatriz(s, indice, key.length());
        return leerFilasKey(matriz);
    }

    static char[][] reconstruirMatriz(String s, Integer[] indice, int columnas) {
        int filas = (s.length() + columnas + 1) / columnas;
        char[][] matriz = new char[filas][columnas];
        int indiceCadena = 0;

        // Rellenar la matriz con el texto cifrado en el orden correcto de las columnas
        for (int col : indice) {
            for (int fila = 0; fila < filas; fila++) {
                if (indiceCadena < s.length()) {
                    matriz[fila][col] = s.charAt(indiceCadena++);
                } else {
                    matriz[fila][col] = '\0';
                }
            }
        }
        return matriz;
    }

    static String leerFilasKey(char[][] matriz) {
        // Calcular el tamaño máximo del resultado
        int totalChars = 0;

        // Contar el número de caracteres válidos en la matriz
        for (char[] fila : matriz) {
            for (char c : fila) {
                if (c != '\0') { // Solo contamos caracteres válidos
                    totalChars++;
                }
            }
        }

        // Crear un array de caracteres para almacenar el resultado
        char[] result = new char[totalChars];
        int k = 0; // Índice para llenar el array

        // Leer las filas y añadir los caracteres válidos al array
        for (char[] fila : matriz) {
            for (char c : fila) {
                if (c != '\0') { // Solo añadimos caracteres válidos
                    result[k++] = c;
                }
            }
        }

        // Convertir el array de caracteres a String
        return new String(result); // Eliminar espacios adicionales
    }

    static Integer[] ordenarClaveInverso(String clave) {
        int longitudClave = clave.length();
        Integer[] indice = new Integer[longitudClave]; // Array de índices

        // Inicializar los índices con su posición original
        for (int i = 0; i < longitudClave; i++) {
            indice[i] = i;
        }

        // Ordenar los índices manualmente con el algoritmo de la burbuja
        for (int i = 0; i < longitudClave - 1; i++) {
            for (int j = i + 1; j < longitudClave; j++) {
                if (clave.charAt(indice[i]) < clave.charAt(indice[j])) {
                    // Intercambiar los índices si están en el orden incorrecto
                    int temp = indice[i];
                    indice[i] = indice[j];
                    indice[j] = temp;
                }
            }
        }

        return indice;
    }

}
