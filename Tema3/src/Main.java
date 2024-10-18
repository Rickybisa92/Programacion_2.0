import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Estructuras de CONTROL

        //Estructuras de SELECION
        // Permiten tomar decisiones sobre que
        //intruciones se tienen que ejecutar en un punto
        //del programa(dependiendo de la condicion)

        //Estructura de selecion SIMPLE
        //Permite ejecutar un conjunto de instruciones
        //si y solo si se cumple una condicion.
        //En caso contrario, estas instruciones no ejecutan.

        // if (condicion) {
        //      Instruciones que se tiene que ejecutar si la condicion
        //      es cierta
        // }

        int a = 7;
        int b = 9;

        if (a < 9) {
            // El codigo siguiente solo se ejecutara si "a < b"
            System.out.println("A es menor que B");
        }

        //Se le pide un precio al usuario y si este precio es
        //mayor que 100, se aplica un 15% de descuento
        //se tiene que imprimir el precio final del producto

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pon un precio:");
        int precio = scanner.nextInt();

        if (precio > 100) {
            int descuento = precio * 15 / 100;
            precio = precio - descuento; // Aplicar el descuento
            System.out.println("Enhorabuena tienes descuento del 15%, este es tu descuento: " + precio);
        } else {
            System.out.println("Lo sentimos, no llegas al limite para el descuento");
        }


        //Estructura de selecion DOBLE
        //ejecuta un conjunto de instruciones si se cumple
        //la condicion y si esta no se cumple, ejecuta
        //otro conjunto de instruciones

        // if (condicion) {
        //     Instruciones que se ejecutan si la condicion es VERDADERA
        // } else {
        //      Instruciones que se ejecutan si la condicion es FALSA
        // }

        int n1 = 7;
        int n2 = 9;
        if (n1 < n2) {
            //La condicion es Verdadera "n1 < n2"
            System.out.println("N1 es menor que N2");
        } else {
            //La condicion es falsa "n1 < n2"
            System.out.println("N1 es mayor que N2");
        }

        //Estructura de selecion MULTIPLE
        //permite controlar que instruciones se ejecutan
        // cuando se cumple una de un conjunto de condiciones

        // if (condicion1) {
        //  instruciones que se ejecutan si condicion1 es cierto
        // } else if (condicion2) {
        //  instruciones que se ejecutan si condicion1 es falsa y condicion2 es cierta
        // } else if (condicion3) {
        //  instruciones que se ejecutan si la condicion1 y condicion2 es falsa
        //  y condicion3 es cierta
        // } else if {
        //   instruciones que se ejecutan si la condicion1, condicion2 y condicion3 es falsa
        //   y condicion4 es cierta
        // }

        int nota = 7;
        if (nota < 4) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Excelente");
        }

    }
}