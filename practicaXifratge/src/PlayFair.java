/**
 * Codificador / Decodificador PLAYFAIR
 * Ver https://en.wikipedia.org/wiki/Playfair_cipher
 *
 */
public class PlayFair {

    public static String encrypt(String text, String pass) {
        char[][] claveMatriz = generarClaveMatriz(pass);
        String cleanText = prepareText(text);
        String[] digrams = createDigrams(cleanText);

        String result = "";
        for (int i = 0; i < digrams.length; i++) {
            if (i > 0) result += " ";
            result += encryptDigram(digrams[i], claveMatriz);
        }
        return result;
    }

    public static String decrypt(String text, String pass) {
        char[][] claveMatriz = generarClaveMatriz(pass);
        String cleanEncrypted = removeSpaces(text);

        String result = "";
        for (int i = 0; i < cleanEncrypted.length(); i += 2) {
            String digram = "" + cleanEncrypted.charAt(i) + cleanEncrypted.charAt(i + 1);
            if (i > 0) result += " ";
            result += decryptDigram(digram, claveMatriz);
        }
        return result;
    }

    static char[][] generarClaveMatriz(String key) {
        String cleanKey = "";
        key = key.toUpperCase();
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            c = convertirCaracteresEspeciales(c);
            if (c >= 'A' && c <= 'Z') {
                if (!cleanKey.contains(String.valueOf(c))) {
                    cleanKey += c;
                }
            }
        }

        String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            if (!cleanKey.contains(String.valueOf(c))) {
                cleanKey += c;
            }
        }

        char[][] matrix = new char[5][5];
        int index = 0;
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                matrix[r][c] = cleanKey.charAt(index++);
            }
        }
        return matrix;
    }

    static String prepareText(String text) {
        String clean = "";
        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            c = convertirCaracteresEspeciales(c);
            if (c >= 'A' && c <= 'Z') {
                clean += c;
            }
        }
        return clean;
    }

    static char convertirCaracteresEspeciales(char c) {
        // Mapear caracteres acentuados y especiales a sus equivalentes sin acento
        if (c == 'á' || c == 'à' || c == 'â' || c == 'ä' || c == 'ã'
                || c == 'Á' || c == 'À' || c == 'Â' || c == 'Ä' || c == 'Ã') {
            return 'A';
        } else if (c == 'ç' || c == 'Ç') {
            return 'C';
        } else if (c == 'é' || c == 'è' || c == 'ê' || c == 'ë'
                || c == 'É' || c == 'È' || c == 'Ê' || c == 'Ë') {
            return 'E';
        } else if (c == 'í' || c == 'ì' || c == 'î' || c == 'ï'
                || c == 'Í' || c == 'Ì' || c == 'Î' || c == 'Ï') {
            return 'I';
        } else if (c == 'ó' || c == 'ò' || c == 'ô' || c == 'ö' || c == 'õ'
                || c == 'Ó' || c == 'Ò' || c == 'Ô' || c == 'Ö' || c == 'Õ') {
            return 'O';
        } else if (c == 'ú' || c == 'ù' || c == 'û' || c == 'ü'
                || c == 'Ú' || c == 'Ù' || c == 'Û' || c == 'Ü') {
            return 'U';
        } else if (c == 'J') {
            return 'I';
        } else {
            return c;
        }
    }


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

            newText += first;
            newText += second;
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

    static String removeSpaces(String s) {
        return s.replace(" ", "");
    }

    private static String encryptDigram(String digram, char[][] matrix) {
        return processDigram(digram, matrix, true);
    }

    private static String decryptDigram(String digram, char[][] matrix) {
        return processDigram(digram, matrix, false);
    }

    private static String processDigram(String digram, char[][] matrix, boolean encrypt) {
        char a = digram.charAt(0);
        char b = digram.charAt(1);
        int row1 = -1, col1 = -1, row2 = -1, col2 = -1;

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

        int shift = encrypt ? 1 : 4;
        char c1, c2;

        if (row1 == row2) {  // Misma fila → mover a la derecha (cifrado) o izquierda (descifrado)
            c1 = matrix[row1][(col1 + shift + 5) % 5];
            c2 = matrix[row2][(col2 + shift + 5) % 5];

        } else if (col1 == col2) {  // Misma columna → mover hacia abajo (cifrado) o arriba (descifrado)
            c1 = matrix[(row1 + shift + 5) % 5][col1];
            c2 = matrix[(row2 + shift + 5) % 5][col2];

        } else {  // Diferente fila y columna → formar un rectángulo y cambiar las letras de columna
            c1 = matrix[row1][col2];
            c2 = matrix[row2][col1];
        }
        return "" + c1 + c2;
    }
}
