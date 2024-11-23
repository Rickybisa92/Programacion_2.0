public class Fractions {

    public static String toWords(String s) {
        // Encuentra la barra con indexOf y separa numerador y denominador
        int barra = s.indexOf('/');
        int numerador = Integer.parseInt(s.substring(0, barra));
        int denominador = Integer.parseInt(s.substring(barra + 1));

        // Convierte numerador y denominador
        String numeradorTexto = convertirNumeroATexto(numerador);
        String denominadorTexto = generarDenominador(denominador, numerador == 1);

        // Construye y devuelve el resultado con mayúscula inicial
        return mayusPrimeraLetra(numeradorTexto + " " + denominadorTexto);
    }

    private static String convertirNumeroATexto(int numero) {
        if (numero >= 11 && numero <= 19) {
            return numerosEspeciales(numero);  // Usamos la función para los números 11-19
        } else if (numero < 10) {
            return convertirUnidades(numero);
        } else if (numero < 100) {
            return convertirDecenas(numero, true);
        } else if (numero < 1000) {
            return convertirCentenas(numero);  // Convertimos los números de 100 a 999
        } else {
            return convertirMiles(numero);  // Convertimos los números mayores a 1000
        }
    }

    private static String convertirUnidades(int numero) {
        String[] unidades = {"", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou"};
        return unidades[numero];
    }

    public static String numerosEspeciales (int numero) {
        String[] numerosEspeciales = {"", "onze", "dotze", "tretze", "catorze", "quinze",
                "setze", "disset", "divuit", "dinou"};
            return numerosEspeciales[numero - 10]; // Ajuste para el índice correcto

    }

    private static String convertirDecenas(int numero, boolean conSeparador) {
        String[] decenas = {"", "deu", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta"};
        int decena = numero / 10;
        int unidad = numero % 10;

        // Si no hay decena (es decir, es un número menor que 10), devolvemos la unidad directamente
        if (decena == 0) {
            return convertirUnidades(unidad);
        }


        if (unidad == 0) {
            return decenas[decena];
        }

        // Decide el separador
        String separador = "";

        // Para los números entre 20-29, usamos el guion "-i-" (veintitrés -> vint-i-tres)
        if (decena == 2) {
            separador = "-i-";
        } else {
            // Para el resto de decenas, usamos un guion normal
            separador = "-";
        }

        return decenas[decena] + separador + convertirUnidades(unidad);
    }

    private static String convertirCentenas(int numero) {
        // Array de las centenas
        String[] CENTENAS = {
                "", "cent", "dos-cents", "tres-cents", "quatre-cents",
                "cinc-cents", "sis-cents", "set-cents", "vuit-cents", "nou-cents"
        };

        int centena = numero / 100;
        int resto = numero % 100;

        // Obtenemos la palabra para la centena correspondiente
        String textoCentena = CENTENAS[centena];

        // Si no hay resto, devolvemos solo la centena
        if (resto == 0) {
            return textoCentena;
        }



        // Añadimos el resto usando decenas
        String textoResto = convertirDecenas(resto, false);

        return textoCentena + " " + textoResto; // Concatenamos con un espacio
        }


    private static String convertirMiles(int numero) {
        int mil = numero / 1000;
        int resto = numero % 1000;

        // En caso de ser 1000, devolvemos "mil"
        if (mil == 1 && resto == 0) {
            return "mil";
        }

        // Para otros casos, devolvemos el valor en miles y el resto
        String textoMil = convertirUnidades(mil) + "-mil";

        if (resto == 0) {
            return textoMil;
        }

        return textoMil + " " + convertirCentenas(resto);
    }

    private static String generarDenominador(int denominador, boolean esSingular) {
        // Casos específicos de ordinales singulares y plurales
        String[] ordinalesSingulares = {"","", "mig", "terç", "quart", "cinquè", "sisè", "setè", "vuitè", "novè", "dècim",
                "onzè", "dotzè", "tretzè", "catorzè", "quinzè", "setzè", "dissetè"};
        String[] ordinalesPlurales = {"", "", "mitjos", "terços", "quarts", "cinquens", "sisens", "setens", "vuitens",
                "novens", "dècims", "onzens", "dotzens", "tretzens", "catorzens", "quinzens",
                "setzens", "dissetens"};


        // Si el denominador es menor que 17, usamos los valores de los arrays predefinidos
        if (denominador < 17) {
            if (esSingular) {
                return ordinalesSingulares[denominador];
            } else {
                return ordinalesPlurales[denominador];
            }
        }

        // Para denominadores grandes, usar la función construirOrdinal
        return construirOrdinal(denominador, esSingular);

    }

    private static String construirOrdinal(int numero, boolean esSingular) {
        String base = convertirNumeroATexto(numero);

        // Caso especial para "centèsim"
        if (base.equals("cent") && esSingular) {
            return "centèsim";
        }
        if (base.equals("cent") && !esSingular) {
            return "centens";
        }

        // Si ya termina en "è", asumimos que es correcto y devolvemos directamente
        if (base.endsWith("è")) {
            return base;
        }


        // Eliminar la última vocal si es necesario
        if (base.endsWith("a") || base.endsWith("e") || base.endsWith("o")) {
            base = base.substring(0, base.length() - 1);
        }

        // Caso específico para "u" cuando es singular
        if (base.endsWith("u")) {
            base = base.substring(0, base.length() - 1);
            if (esSingular) {
                return base + "vè"; // Singular, caso especial para "u"
            } else {
                return base + "vens"; // Plural, caso especial para "u"
            }
        }

        // Añadir sufijo correspondiente
        if (esSingular) {
            return base + "è";
        }
        return base + "ens";
    }

    private static String mayusPrimeraLetra(String texto) {
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
