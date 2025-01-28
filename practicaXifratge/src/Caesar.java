
public class Caesar {
    static String cypher(String s, int delta) {
        s = s.toUpperCase(); // Convertir el texto de entrada a mayúsculas

        char[] resultado = new char[s.length()]; // Array para almacenar el resultado

        // Definir las vocales acentuadas que no deben ser modificadas
        String caracteresEspeciales = "ÁÉÍÓÚÀÈÌÒÙÇ";

        for (int i = 0; i < s.length(); i++) { // Recorrer todos los caracteres
            char caracter = s.charAt(i); // Obtener el carácter actual

            // Si es una vocal acentuada, no la modificamos
            if (caracteresEspeciales.indexOf(caracter) != -1) {
                resultado[i] = caracter; // Dejar la vocal acentuada tal cual

            } else if (Character.isLetter(caracter)) { // Si es una letra normal
                // Calcular el nuevo carácter (base 'A' para mayúsculas)
                caracter = (char) ('A' + (caracter - 'A' + delta) % 26);
                resultado[i] = caracter;

            } else { // Si no es una letra (como espacios o puntuación), lo dejamos tal cual
                resultado[i] = caracter;
            }
        }
        return new String(resultado); // Convertir el array en un String
    }

    static String decypher(String s, int delta) {

        s = s.toUpperCase(); // Convertir el texto de entrada a mayúsculas

        char[] resultado = new char[s.length()]; // Array para almacenar el resultado


        // Asegurarse de que el delta esté dentro del rango de 0 a 25 (alfabeto de 26 letras)
        delta = delta % 26;

        // Definir las vocales acentuadas que no deben ser modificadas
        String caracteresEspeciales = "ÁÉÍÓÚÀÈÌÒÙÇ";

        for (int i = 0; i < s.length(); i++) { // Recorrer todos los caracteres
            char caracter = s.charAt(i); // Obtener el carácter actual

            // Si es una vocal acentuada, no la modificamos
            if (caracteresEspeciales.indexOf(caracter) != -1) {
                resultado[i] = caracter;

            } else if (Character.isLetter(caracter)) { // Si es una letra normal
                // Calcular el nuevo carácter (base 'A' para mayúsculas)
                caracter = (char) ('A' + (caracter - 'A' - delta + 26) % 26);
                resultado[i] = caracter;

            } else { // Si no es una letra (como espacios o puntuación), lo dejamos tal cual
                resultado[i] = caracter;
            }
        }
        return new String(resultado); // Convertir el array en un String
    }

    static String magic(String s, String ss) {

        // Verificar si las longitudes de los dos textos son iguales
        if (s.length() != ss.length()) {
            throw new IllegalArgumentException("Los textos no tienen la misma longitud.");
        }

        // Crear arrays para almacenar los caracteres de 's' y 'ss'
        char[] sArray = new char[s.length()]; // Inicializamos el arreglo de 's'
        char[] ssArray = new char[s.length()]; // Inicializamos el arreglo de 'ss'

        // Aquí podemos empezar a calcular los desplazamientos entre los caracteres.

        return ""; // Aquí devolveremos el resultado más adelante
    }
}
