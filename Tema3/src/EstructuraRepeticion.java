import java.util.Scanner;

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

        // La sentencia "while" permite repetir la ejecuccion del bucle
        //mientras se cumple una determinada condicion
        //Esta condicion se verifica antes de cata iteracion
        //Si la condicion no se cumple al principio, el bucle ya no se ejecuta

        // while (condicion) {
        //      instrucciones que se ejecutan dentro el bucle
        // }

        ////////////////////////////////////////////////////////////////////////////////////////////

        /*int contador = 10;

        while (contador > 0) {
            System.out.println("Contador: " + contador);
            contador = contador - 1;
        } */

        //////////////////////////////////////////////////////////////////////////////////////////7

        /*int acumulador1 = 0;
        int contador1 = 1;

        while (contador1 <= 10) {
            acumulador1 = acumulador1 + contador1;
            System.out.println(contador1);
        } */

        ////////////////////////////////////////////////////////////////////////////////////////7

        /*int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        } */


        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos guiones quieres poner: ");
        int numGuiones = scanner.nextInt();
        int contador = 1;

        while (contador <= numGuiones) {
            System.out.print("-");
            contador++;
        }

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos guiones quieres poner: ");
        int numGuiones = scanner.nextInt();

        while (numGuiones > 0) {
            System.out.print("-");
            numGuiones--;
        }
    }
}
