public class eliminarEspaciosPrueba {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";

        String cadenaNueva = eliminarEspacios(cadena);
        System.out.println(cadenaNueva);
    }

    public static String eliminarEspacios(String cadena) {
        return cadena.replace(" ", "");
    }
}
