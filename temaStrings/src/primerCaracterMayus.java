public class primerCaracterMayus {
    public static void main(String[] args) {

        String frase = "hola mundo java";
        boolean entrePalabras = true;

        String resultado = transformarPrimerCaracter(frase,entrePalabras);
        System.out.println(resultado);
    }

    public static String transformarPrimerCaracter(String frase, boolean entrepalabras) {
        String res = "";
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if ( caracter != ' ' && entrepalabras) {
                //Comienza en Mayusculas
                res += (char) (caracter - 32);
            } else {
                res += caracter;
            }
            if ( caracter == ' ') {
                entrepalabras = true;
            } else {
                entrepalabras = false;
            }
        }
        return res;

    }
}
