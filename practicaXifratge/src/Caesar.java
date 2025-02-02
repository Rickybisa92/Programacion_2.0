
public class Caesar {
    static String cypher(String s, int delta) {
        return procesarTexto(s, controlDelta(delta), true);
    }

    static String decypher(String s, int delta) {

        return procesarTexto(s,controlDelta(-delta),false);
    }

    static int controlDelta(int delta) {
        int resto = delta % 26; // Obtenemos el resto

        if (resto < 0) { // Si el resto fuese negativo le sumamos 26
            resto += 26;
        }

        return resto; // Y devolvemos el resultado que nunca sera negativo y se mantiene en el rango
    }

    static String procesarTexto(String s, int delta, boolean isCypher) {
        s = s.toUpperCase(); // Convertimos el texto a mayúsculas
        char[] resultado = new char[s.length()]; // Array para almacenar el resultado

        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);

            // Solo modificamos los caracteres dentro del rango 'A' a 'Z'
            if (caracter >= 'A' && caracter <= 'Z') {
                int posicion = caracter - 'A'; // Calculamos la posicion del caracter restandole 'A'
                                                // Ejemplo: caracter = 'C', posicion = 'C' - 'A' = 2

                int nuevaPosicion = (posicion + delta) % 26; //Sumamos el delta a la posicion indicada
                                                            // Ejemplo: Posicion 2, delta 3, (2+3) % 26 = 5

                if (nuevaPosicion < 0) { //Si el resultado fuese negativo, le sumamos 26 para convertirlo en positivo
                    nuevaPosicion += 26;
                }

                caracter = (char) ('A' + nuevaPosicion); //Convertimos el numero en caracter
            }

            // Dejamos todos los demás caracteres intactos
            resultado[i] = caracter;
        }

        return new String(resultado); // Convertimos el array en un String
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
        char letraMasFrecuente = 'A'; // Valor por defectopublic

        for (int i = 0; i < 26; i++) {
            if (contarLetras[i] > max) {
                max = contarLetras[i];
                letraMasFrecuente = (char) ('A' + i);
            }
        }

        return letraMasFrecuente;
    }



}
