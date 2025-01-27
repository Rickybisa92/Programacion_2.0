
public class Caesar {
    static String cypher(String s, int delta) {
        s = s.toUpperCase(); // Convertir el texto de entrada a mayúsculas
        char[] result = new char[s.length()]; // Array para almacenar el resultado
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Obtener el carácter actual
            if (Character.isLetter(c)) {
                // Calcular el nuevo carácter (base 'A' para mayúsculas)
                c = (char) ('A' + (c - 'A' + delta) % 26);
            }
            result[i] = c; // Guardar el carácter en el array
        }
        return new String(result); // Convertir el array en un String
    }

    static String decypher(String s, int delta) {

        return "";
    }

    static String magic(String s, String ss) {

        return "";
    }
}
