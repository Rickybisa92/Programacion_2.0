

public class Vigenere {


    static String encode(String s, String password) {

        return procesarTexto(s, password, true);
    }

    static String decode(String s, String password) {

        return procesarTexto(s, password, false);

    }

    static String normalizarTexto(String texto) {
        return texto.toUpperCase()
                .replace("À", "A")
                .replace("É", "E")
                .replace("È", "E")
                .replace("Í", "I")
                .replace("Ó", "O")
                .replace("Ò", "O")
                .replace("Ú", "U");
    }

    static String procesarTexto(String s, String password, boolean esEncode) {
        s = normalizarTexto(s); // Convertimos el texto a mayúsculas
        password = normalizarTexto(password); // Convertimos la contraseña a mayúsculas

        char[] resultado = new char[s.length()]; // Array para almacenar el resultado

        // Para que la contraseña pueda cubrir la longitud del texto
        int indicePassword = 0;


        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);

            // Procesamos solo los caracteres alfabéticos
            if (Character.isLetter(caracter)) {
                // Ciframos/desciframos el carácter y lo almacenamos
                resultado[i] = procesarCaracter(caracter, password, indicePassword, esEncode);
                indicePassword++; // Incrementamos el índice de la contraseña solo si es letra
            } else {
                // Mantenemos los caracteres no alfabéticos tal como están (espacios, símbolos, etc.)
                resultado[i] = caracter;
            }
        }

        // Convertimos el array de caracteres en un String
        return new String(resultado);
    }

    // Función encargada de manejar cada caracter individualmente
    static char procesarCaracter(char caracter, String password, int indicePassword, boolean esEncode) {

            // Convertimos el caracter a mayúscula para simplificar el cifrado
            char caracterMayuscula = Character.toUpperCase(caracter);

            // Sacamos el caracter correspondiente de la contraseña
            char letraPassword = password.charAt(indicePassword % password.length());

            // Calculamos las posiciones del caracter y la contraseña
            int posicionCaracter = caracterMayuscula - 'A';
            int posicionPassword = Character.toUpperCase(letraPassword) - 'A';

            // Aplicamos el desplazamiento según si estamos cifrando o descifrar
            int posicionNueva;
            if (esEncode) {
                posicionNueva = (posicionCaracter + posicionPassword + 1 ) % 26; // Cifrar
            } else {
                posicionNueva = (posicionCaracter - posicionPassword - 1 + 26) % 26; // Descifrar
            }

            // Convertimos el número de la nueva posición en un carácter
            return (char) ('A' + posicionNueva);

    }
}


