public class EstructuraRepeticion {
    public static void main(String[] args) {
        //Estructuras de repeticion
        //Permiten repetir una secuencia de instruciones
        //varias veces segun una cierta condicion

        //Un bucle es un conjunto de instruciones quw
        //se tiene que repetir.
        //Cada vez que se ejecuta este conjunto se llama
        //ITERACION

        //Hay un tipo de bucle que se llama bucle infinito
        // consiste en repetir de manera INDEFINIDA unas instruciones

        //En un bucle hay variables de control.
        //
        // -Contador: es una variable que va aumentando o disminuyendo
        //            indicando el numero de iteracciones que tiene que hacer
        //
        // -ACUMULADOR: es una variable donde vamos acumulando los calculos
        //              que se quieren realizar

        int contador = 10;

        while (contador > 0) {
            System.out.println("contador " + contador);
            contador = contador - 1;
        }
    }
}
