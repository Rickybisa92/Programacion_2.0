public class reemplazarCaracteresPrueba {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";

        System.out.println(reemplazarCaracteres(cadena, 'o', 'a'));
    }

    public static String reemplazarCaracteres(String cadena, char caracter, char reemplazo) {
        return cadena.replace(caracter, reemplazo);
    }
}
