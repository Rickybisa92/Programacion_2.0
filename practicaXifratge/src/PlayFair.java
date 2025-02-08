/**
 * Codificador / Decodificador PLAYFAIR
 * Ver https://en.wikipedia.org/wiki/Playfair_cipher
 *
 */
public class PlayFair {

    public static String encrypt(String text, String pass) {
        char[][] claveMatriz = generarClaveMatriz(pass);
        String textoLimpio = prepararTexto(text);
        String[] digramas = crearDigramas(textoLimpio);

        String result = "";
        for (int i = 0; i < digramas.length; i++) { // Cifrar cada digrama
            if (i > 0) result += " "; // Agregar espacio entre digramas
            result += encryptDigrama(digramas[i], claveMatriz); // Cifrar digrama y agregar al resultado
        }
        return result;
    }

    public static String decrypt(String text, String pass) {
        char[][] claveMatriz = generarClaveMatriz(pass);
        String textoEcriptadoLimpio = eliminarEspacios(text);

        String result = "";
        for (int i = 0; i < textoEcriptadoLimpio.length(); i += 2) { // Descifrar cada digrama
            String digrama = "" + textoEcriptadoLimpio.charAt(i) + textoEcriptadoLimpio.charAt(i + 1); // Digrama a descifrar
            if (i > 0) result += " ";
            result += decryptDigrama(digrama, claveMatriz);
        }
        return result;
    }


    // Generar matriz de clave a partir de la clave
    static char[][] generarClaveMatriz(String clave) {
        String claveLimpia = ""; // Clave sin caracteres repetidos
        clave = clave.toUpperCase();

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            c = convertirCaracteresEspeciales(c); // Convertir caracteres especiales
            if (c >= 'A' && c <= 'Z') { // Solo caracteres válidos
                if (!claveLimpia.contains(String.valueOf(c))) { // No repetir caracteres
                    claveLimpia += c; // Agregar caracter a la clave
                }
            }
        }

        String alfabeto = "ABCDEFGHIKLMNOPQRSTUVWXYZ"; // Alfabeto sin la J
        for (int i = 0; i < alfabeto.length(); i++) { // Agregar caracteres del alfabeto que no estén en la clave
            char c = alfabeto.charAt(i);
            if (!claveLimpia.contains(String.valueOf(c))) {
                claveLimpia += c;
            }
        }

        char[][] matriz = new char[5][5]; // Matriz de clave
        int index = 0;
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                matriz[r][c] = claveLimpia.charAt(index++); // Llenar la matriz con la clave
            }
        }
        return matriz;
    }


    // Preparar texto para cifrado / descifrado eliminando caracteres no válidos y convirtiendo a mayúsculas
    static String prepararTexto(String texto) {
        String limpio = "";
        texto = texto.toUpperCase();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            c = convertirCaracteresEspeciales(c);
            if (c >= 'A' && c <= 'Z') {
                limpio += c;
            }
        }
        return limpio;
    }


    // Convertir caracteres acentuados y especiales a sus equivalentes sin acento
    static char convertirCaracteresEspeciales(char c) {

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



    // Crear digramas a partir de un texto (si es necesario, agregar una X al final)
    static String[] crearDigramas(String texto) {
        String nuevoTexto = ""; // Texto con X agregada si es necesario
        int i = 0;
        while (i < texto.length()) { // Crear digramas a partir del texto limpio
            char first = texto.charAt(i); // Primer caracter del digrama
            char second = (i + 1 < texto.length()) ? texto.charAt(i + 1) : 'X'; // Segundo caracter del digrama
                                                                                //(si no hay, usar X)
            if (first == second) {
                second = 'X';
                i++;
            } else {
                i += 2;
            }

            nuevoTexto += first;
            nuevoTexto += second;
        }

        if (nuevoTexto.length() % 2 != 0) { // Si el texto tiene una longitud impar, agregar una X al final
            nuevoTexto += "X";
        }

        int numDigramas = nuevoTexto.length() / 2; // Número de digramas en el texto limpio
        String[] digramas = new String[numDigramas]; // Arreglo de digramas

        for (i = 0; i < numDigramas; i++) { // Crear digramas a partir del texto limpio
            digramas[i] = nuevoTexto.substring(i * 2, i * 2 + 2); // Agregar digrama al arreglo de digramas
        }
        return digramas;
    }

    // Eliminar espacios en blanco de una cadena
    static String eliminarEspacios(String s) {
        return s.replace(" ", "");
    }


    // Cifrar un diagrama utilizando la matriz de clave
    private static String encryptDigrama(String digram, char[][] matriz) {
        return procesarDigrama(digram, matriz, true);
    }


    //Descifrar un diagrama utilizando la matriz de clave
    private static String decryptDigrama(String digram, char[][] matriz) {
        return procesarDigrama(digram, matriz, false);
    }


    // Procesar un digrama (cifrado o descifrado) utilizando la matriz de clave
    private static String procesarDigrama(String digrama, char[][] matriz, boolean cifrar) {
        char a = digrama.charAt(0); // Primer caracter del digrama
        char b = digrama.charAt(1); // Segundo caracter del digrama
        int fila1 = -1, col1 = -1, fila2 = -1, col2 = -1; // Fila y columna de cada caracter en la matriz

        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (matriz[r][c] == a) {
                    fila1 = r; col1 = c;
                }
                if (matriz[r][c] == b) {
                    fila2 = r; col2 = c;
                }
            }
        }

        int shift = cifrar ? 1 : 4;
        char c1, c2;

        if (fila1 == fila2) {  // Misma fila → mover a la derecha (cifrado) o izquierda (descifrado)
            c1 = matriz[fila1][(col1 + shift + 5) % 5];
            c2 = matriz[fila2][(col2 + shift + 5) % 5];

        } else if (col1 == col2) {  // Misma columna → mover hacia abajo (cifrado) o arriba (descifrado)
            c1 = matriz[(fila1 + shift + 5) % 5][col1];
            c2 = matriz[(fila2 + shift + 5) % 5][col2];

        } else {  // Diferente fila y columna → formar un rectángulo y cambiar las letras de columna
            c1 = matriz[fila1][col2];
            c2 = matriz[fila2][col1];
        }
        return "" + c1 + c2;
    }
}
