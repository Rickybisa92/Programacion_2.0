public class palabraPalindromo {
    public static void main(String[] args) {
        String palabra = "oso";
        boolean esPalindromo = true;

        for (int i = 0; i < palabra.length() / 2; i++) {
            char caractereInicio = palabra.charAt(i);
            char caracteresFinal = palabra.charAt(palabra.length() - 1 - i);

            if (caractereInicio != caracteresFinal) {
                System.out.println("La palabra no es palíndromo");
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palíndromo");
        }
    }
}
