
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

        String caracteresEspeciales = "ÁÃÂÉÍÓÚÀÈÌÒÙÇ";

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

      char letraS = letraMasRepetida(s);
        char letraSS = letraMasRepetida(ss);

        int delta = letraS - letraSS;
        return decypher(s, delta);


    }

    static char letraMasRepetida(String texto) {
        int[] contarLetras = new int[26];  // Array para contar letras A-Z
        texto = texto.toUpperCase();  // Convertir todo a mayúsculas para evitar errores

        for (char caracter : texto.toCharArray()) {
            if (caracter >= 'A' && caracter <= 'Z') {  // Solo contar letras A-Z
                contarLetras[caracter - 'A']++;
            }
        }

        int max = 0;
        char letraMasFrecuente = 'A'; // Valor por defecto

        for (int i = 0; i < 26; i++) {
            if (contarLetras[i] > max) {
                max = contarLetras[i];
                letraMasFrecuente = (char) ('A' + i);
            }
        }

        return letraMasFrecuente;
    }



}
