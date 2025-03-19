public class contarPalabrasFrase {
    public static void main(String[] args) {
        String frase = "Hola Mundo";

        int contador = 0;

        // Recorremos la cadena para contar palabras
        for (int i = 0; i < frase.length(); i++) {
            // Si el caracter actual no es un espacio y el anterior es un espacio o estamos en la primera posición
            if (frase.charAt(i) != ' ' && (i == 0 || frase.charAt(i - 1) == ' ')) {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " palabras");
    }
}
