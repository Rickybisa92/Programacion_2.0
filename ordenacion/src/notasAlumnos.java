import java.util.Arrays;
import java.util.Scanner;

public class notasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Inicialización de arrays
        String[] nombres = new String[50];
        double[] notasMatematicas = new double[50];
        double[] notasCastellano = new double[50];
        int indice = 0;  // Índice para colocar los alumnos

        while (true) {
            // Pedir el nombre del alumno
            System.out.println("Nombre del alumno " + (indice + 1) + ": ");
            String nombre = sc.nextLine();

            if (nombre.equals(".")) {
                break;  // Si el nombre es ".", se sale del bucle
            }

            // Pedir las notas
            System.out.println("Nota de Matemáticas de " + nombre + ": ");
            double notaMatematicas = sc.nextDouble();
            System.out.println("Nota de Castellano de " + nombre + ": ");
            double notaCastellano = sc.nextDouble();
            sc.nextLine();

            // Guardar los datos en los arrays
            nombres[indice] = nombre;
            notasMatematicas[indice] = notaMatematicas;
            notasCastellano[indice] = notaCastellano;
            indice++;  // Incrementar el índice para el siguiente alumno
        }

        // Imprimir la tabla con los resultados
        System.out.printf("%-15s |  %-20s |  %-20s%n", "Nombre", "Nota Matemáticas", "Nota Castellano");
        System.out.println("--------------------------------------------------------------------------");

        //Imprimimos primero notas de los alumnos
        for (int i = 0; i < indice; i++) {
            System.out.printf("%-15s |  %-20.2f |  %-20.2f%n", nombres[i], notasMatematicas[i], notasCastellano[i]);
        }

        System.out.println("--------------------------------------------------------------------------");

        //Imprimimos la media de las notas de los alumnos
        System.out.printf("%-15s |  ", "Media");
        for (int i = 0; i < indice; i++) {
            double media = (notasMatematicas[i] + notasCastellano[i]) / 2;
            System.out.printf("%-20.2f |  ", media);
        }
    }

}

