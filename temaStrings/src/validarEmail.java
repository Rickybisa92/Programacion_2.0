 //Hacer servir un programa que diga si
    //un string es una direccion de email valida
    //
    // tiene que a ver un solo caracter "@"
    // Tiene que acabar en ".es" ".cat" ".com" ."edu"
    // Tiene que tener entre 3 i 64 caracteres antes del @
    // No puede tener ".."
    // El punto no puede estar ni al principio, ni justo al final ni despues del @
    // Tiene que haber al menos un "." entre @ y el final
    //
    // escola@esliceucom. --> invalido
    // .escola@esliceu.com --> invalido
    // escola@.esliceu.com --> invalido
    // escola@com --> invalido
    // No puede a ver otros caracteres especiales "#$%&!|()/"

 public class validarEmail {
     public static void main(String[] args) {
         String email = "abc@gmail.com";

         boolean esValido = validarEmail(email);

         if (esValido) {
             System.out.println("El email es valido");
         } else {
             System.out.println("El email no es valido");
         }
     }

     public static boolean validarEmail(String email) {
         if (!tieneArroba(email)) {
             return false;
         }
         if (!dominioEmail(email)) {
             return false;
         }
         if (!dosPuntos(email)) {
             return false;
         }
         if (!caracteresAntesArroba(email)) {
             return false;
         }
         if (!posicionPunto(email)) {
             return false;
         }
         if (!puntoDespuesDeArrroba(email)) {
             return false;
         }
         if (!contieneCaracteresEspeciales(email)) {
             return false;
         }
         return true;
     }


     public static boolean tieneArroba(String s) {
         int contarArroba = 0; // Inicializa un contador para contar los '@' en el string.
         for (int i = 0; i < s.length(); i++) { // Recorrer cada carácter del string 's'.
             if (s.charAt(i) == '@') {
                 contarArroba++; // Si el carácter actual es un '@', incrementamos el contador
             }
         }
         return contarArroba == 1; // Devolcemos true si hay exactamente un '@', de lo contrario, false.
     }

     public static boolean dominioEmail (String s) {
         if (s.endsWith(".es") ||        //Comprobamos si tiene al final del email contiene estos dominios
                 s.endsWith(".com") ||
                 s.endsWith(".cat") ||
                 s.endsWith(".edu")) {
             return true; //Si es asi devolveremos true
         }
         return false; // si no los contiene false
     }

     public static boolean dosPuntos(String s) {
         if (s.contains("..")) {  // revisaremos si contiene mas de dos puntos
             return false; // si es asi devolveremos false
         }
         return true;  // si no contiene dos puntos y solo uno devolvemos true
     }

     public static boolean caracteresAntesArroba(String s) {
         if (!s.contains("@")) {
             return false; // Si no contiene @, directamente imprimimos que no es valido
         }
         int posicionArroba = s.indexOf('@');// Encuentra la posicion del primer '@'
         String antesDelArroba = s.substring(0, posicionArroba); // Cuenta lo que hay antes del '@',
                                                                // cuenta desde el index 0 hasta donde encuentra el primer '@"

         if (antesDelArroba.length() >= 3 && antesDelArroba.length() <= 64) {
             return true; // Verificamos los caracteres que hay antes del '@'
         }
         return false;
     }

     public static boolean posicionPunto(String s) {
         if (s.startsWith(".") || s.endsWith(".") || s.contains("@.") || s.indexOf('.') == s.indexOf('@') + 1) {
             return false;
         }
         return true;
     }

     public static boolean puntoDespuesDeArrroba(String s) {
         int posicionArroba = s.indexOf('@'); // Buscamos la posición del carácter '@' en el string

         String despuesDeArroba = s.substring(posicionArroba + 1); // Extraemos lo que hay despues del "@"

         if (despuesDeArroba.contains(".")) {
             return true; // Comprobamos si lo que hemos extraido despues del '@' contiene un punto, si es asi devolvemos true
         }
         return false; // en caso contrario false
     }

     public static boolean contieneCaracteresEspeciales(String s) {
         String caracteresEspeciales = "#$%&!|()/"; // Defino una variable con los caracteres especiales

         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i); // guardamos la posicion del caracter

             if (caracteresEspeciales.indexOf(c) >= 0) { //Comprobamos si el caracter esta en el String de "CaracteresEspeciales"
                                                        // si el indice es mayor o igual a 0, quiere decir que encontro un caracter
                 return false; // Y al encontrarlo devolvemos false
             }
         }
         return true; // Si no hay ninguno devolvemos true
     }
 }
