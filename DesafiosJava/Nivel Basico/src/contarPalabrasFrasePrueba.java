public class contarPalabrasFrasePrueba {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ' && (i == 0 || cadena.charAt(i - 1) == ' ')) {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " palabras");
    }
}
