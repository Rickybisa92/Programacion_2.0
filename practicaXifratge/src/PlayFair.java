
/**
 * Codificador / Decodificador PLAYFAIR
 * Veure https://en.wikipedia.org/wiki/Playfair_cipher
 *
 */
public class PlayFair {

    // Método público para cifrar el mensaje con la clave dada
    public static String encrypt(String text, String pass) {
        // Generar la matriz clave de 5x5
        char[][] claveMatriz = generarClaveMatriz(pass);
        // Preparar el texto: eliminar caracteres no alfabéticos, convertir a mayúsculas y reemplazar 'J' por 'I'
        String cleanText = prepareText(text);
        // Dividir el texto en dígrafos (pares de letras), insertando 'X' si es necesario
        String[] digrams = createDigrams(cleanText);

        // Cifrar cada dígrafo y concatenar el resultado, separando cada par con un espacio
        String result = "";
        for (int i = 0; i < digrams.length; i++) {
            String encryptedDigram = encryptDigram(digrams[i], claveMatriz);
            if (i == 0) {
                result = encryptedDigram;
            } else {
                result = result + " " + encryptedDigram;
            }
        }
        return result;
    }

    // Método público para descifrar el mensaje cifrado con la clave dada
    static String decrypt(String text, String pass) {
        // Generar la matriz clave de 5x5
        char[][] claveMatriz = generarClaveMatriz(pass);
        // Eliminar espacios del texto cifrado para obtener una secuencia continua de dígrafos
        String cleanEncrypted = removeSpaces(text);

        // Procesar cada dígrafo (dos caracteres a la vez) y concatenar el resultado, separándolos con un espacio
        String result = "";
        for (int i = 0; i < cleanEncrypted.length(); i += 2) {
            String digram = "" + cleanEncrypted.charAt(i) + cleanEncrypted.charAt(i + 1);
            String decryptedDigram = decryptDigram(digram, claveMatriz);
            if (result.equals("")) {
                result = decryptedDigram;
            } else {
                result = result + " " + decryptedDigram;
            }
        }
        return result;
    }

    // -------------------------- Métodos Auxiliares --------------------------

    // Genera la matriz clave de 5x5 a partir de la clave proporcionada
    static char[][] generarClaveMatriz(String key) {
        // Limpiar la clave: convertir a mayúsculas, reemplazar 'J' por 'I'
        String cleanKey = "";
        key = key.toUpperCase();
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if (c == 'J') c = 'I';
                if (cleanKey.indexOf(c) == -1) {
                    cleanKey = cleanKey + c;
                }
            }
        }
        // Completar con el resto del alfabeto (omitimos 'J')
        String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            if (cleanKey.indexOf(c) == -1) {
                cleanKey = cleanKey + c;
            }
        }
        // Llenar la matriz 5x5
        char[][] matrix = new char[5][5];
        int index = 0;
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                matrix[r][c] = cleanKey.charAt(index++);
            }
        }
        return matrix;
    }

    // Prepara el mensaje: convierte a mayúsculas, elimina caracteres no alfabéticos, y reemplaza 'J' por 'I'
    static String prepareText(String text) {
        String clean = "";
        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if (c == 'J') c = 'I';
                clean = clean + c;
            }
        }
        return clean;
    }

    // Divide el mensaje en dígrafos, insertando 'X' entre letras iguales y al final si es necesario
    static String[] createDigrams(String text) {
        String newText = "";
        int i = 0;
        while (i < text.length()) {
            char first = text.charAt(i);
            char second = (i + 1 < text.length()) ? text.charAt(i + 1) : 'X';

            if (first == second) {
                second = 'X';
                i++;
            } else {
                i += 2;
            }

            newText += "" + first + second;
        }

        if (newText.length() % 2 != 0) {
            newText += "X";
        }

        int numDigrams = newText.length() / 2;
        String[] digrams = new String[numDigrams];
        for (i = 0; i < numDigrams; i++) {
            digrams[i] = newText.substring(i * 2, i * 2 + 2);
        }
        return digrams;
    }

    // Elimina espacios de una cadena
    static String removeSpaces(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                res = res + s.charAt(i);
            }
        }
        return res;
    }

    // Cifra un dígrafo utilizando la matriz clave (reglas del cifrado Playfair)
    private static String encryptDigram(String digram, char[][] matrix) {
        char a = digram.charAt(0);
        char b = digram.charAt(1);
        int row1 = -1, col1 = -1, row2 = -1, col2 = -1;
        // Encontrar las posiciones de 'a' y 'b' en la matriz
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (matrix[r][c] == a) {
                    row1 = r; col1 = c;
                }
                if (matrix[r][c] == b) {
                    row2 = r; col2 = c;
                }
            }
        }
        char c1, c2;
        if (row1 == row2) {
            // Regla 1: misma fila, se reemplazan por los caracteres a la derecha (circularmente)
            c1 = matrix[row1][(col1 + 1) % 5];
            c2 = matrix[row2][(col2 + 1) % 5];
        } else if (col1 == col2) {
            // Regla 2: misma columna, se reemplazan por los caracteres debajo (circularmente)
            c1 = matrix[(row1 + 1) % 5][col1];
            c2 = matrix[(row2 + 1) % 5][col2];
        } else {
            // Regla 3: rectángulo, se intercambian las columnas
            c1 = matrix[row1][col2];
            c2 = matrix[row2][col1];
        }
        return "" + c1 + c2;
    }

    // Descifra un dígrafo utilizando la matriz clave (reglas inversas del Playfair)
    private static String decryptDigram(String digram, char[][] matrix) {
        char a = digram.charAt(0);
        char b = digram.charAt(1);
        int row1 = -1, col1 = -1, row2 = -1, col2 = -1;
        // Encontrar las posiciones de 'a' y 'b' en la matriz
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (matrix[r][c] == a) {
                    row1 = r; col1 = c;
                }
                if (matrix[r][c] == b) {
                    row2 = r; col2 = c;
                }
            }
        }
        char c1, c2;
        if (row1 == row2) {
            // Regla 1 inversa: misma fila, se reemplazan por los caracteres a la izquierda (circularmente)
            c1 = matrix[row1][(col1 + 4) % 5];
            c2 = matrix[row2][(col2 + 4) % 5];
        } else if (col1 == col2) {
            // Regla 2 inversa: misma columna, se reemplazan por los caracteres de arriba (circularmente)
            c1 = matrix[(row1 + 4) % 5][col1];
            c2 = matrix[(row2 + 4) % 5][col2];
        } else {
            // Regla 3: rectángulo, se intercambian las columnas (la misma que en cifrado)
            c1 = matrix[row1][col2];
            c2 = matrix[row2][col1];
        }
        return "" + c1 + c2;
    }
}
