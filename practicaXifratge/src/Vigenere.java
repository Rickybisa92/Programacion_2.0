

public class Vigenere {


    static String encode(String s, String password) {

        return procesarTexto(s, password, true);
    }

    static String procesarTexto(String s, String password, boolean esEncode) {

        //Convertimos el texto y la contraseña en mayusculas
        s = s.toUpperCase();
        password = password.toUpperCase();

        //Creamos un array de caracteres donde almacenaremos el resultado
        char[] resultado = new char[s.length()];

        // Para que pueda cubrir la longitud del texto
        int indicePassword = 0;

        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);

            //Solo modificaremos las letras desde 'A' hasta 'Z'
            if (caracter >= 'A' && caracter <= 'Z' ){
                // Sacamos el caracter que corresponde de la contraseña
                char letraPassword = password.charAt(indicePassword % password.length());
                indicePassword++;

                // Calcular la posicion del caracter y del caracter de la contraseña
                int posicionCaracter = caracter - 'A';
                int posicionPassword = letraPassword - 'A';

                //Aplicamos el desplazamiento segun si desciframos o ciframos
                int posicionNueva;
                if (esEncode) {
                    posicionNueva = (posicionCaracter + posicionPassword) % 26; //cifrar
                } else {
                    posicionNueva = (posicionCaracter - posicionPassword + 26) % 26; //descifrar
                }

                //Convertimos el numero de la nueva posicion en caracter
                caracter = (char) ('A' + posicionNueva);
            }

            // Almacenamos el caracter en el array de resultado
            resultado[i] = caracter;
        }

        // Convertimos el array  de caracteres en String
        return new String(resultado);
    }


    static String decode(String s, String password) {

        return "";
    }
}


