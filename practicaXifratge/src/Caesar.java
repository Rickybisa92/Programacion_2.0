
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

        s = s.toUpperCase();

        char[] resultado = new char[s.length()];


        // Asegurarse de que el delta esté dentro del rango de 0 a 25 (alfabeto de 26 letras)
        delta = delta % 26;

        String caracteresEspeciales = "ÁÉÍÓÚÀÈÌÒÙÇ";

        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);

            if (caracteresEspeciales.indexOf(caracter) != -1) {
                resultado[i] = caracter;

            } else if (Character.isLetter(caracter)) {
                caracter = (char) ('A' + (caracter - 'A' - delta + 26) % 26);
                resultado[i] = caracter;

            } else {
                resultado[i] = caracter;
            }
        }
        return new String(resultado);
    }

    static String magic(String s, String ss) {

        // Creamos un array de caracteres para guardar la versión descifrada
        char[] resultado = new char[s.length()];

        // Recorremos la cadena cifrada y asignamos la letra correspondiente
        for (int i = 0; i < s.length(); i++) {
            char cifrado = s.charAt(i);
            char original = ss.charAt(i);

            if (Character.isLetter(cifrado)) {
                // Si la letra es alfabética, asignamos la letra correspondiente de 'ss' a 'resultado'
                if (Character.isLowerCase(cifrado)) {
                    // Si la letra es minúscula, la asignamos tal cual
                    resultado[i] = Character.toLowerCase(original);
                } else {
                    // Si la letra es mayúscula, la asignamos tal cual
                    resultado[i] = Character.toUpperCase(original);
                }
            } else {
                // Si no es una letra (por ejemplo, un espacio o puntuación), no la tocamos
                resultado[i] = cifrado;
            }
        }

        // Convertimos el array de caracteres en un String y lo retornamos
        return new String(resultado);
    }


}
