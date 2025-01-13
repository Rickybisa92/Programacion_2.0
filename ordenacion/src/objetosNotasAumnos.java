import java.util.Arrays;
import java.util.Scanner;

public class objetosNotasAumnos {
    public static void main(String[] args) {
        Estudiante[] arrayEstudiantes = pedirDatos();
        muestraDatos(arrayEstudiantes);
        ordenarPorNotaMat(arrayEstudiantes);
    }

    static void ordenarPorNotaMat(Estudiante[] arrayEstudiantes) {
        for (int i = arrayEstudiantes.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayEstudiantes[j].notaMatematicas > arrayEstudiantes[j+1].notaMatematicas) {
                    Estudiante t = arrayEstudiantes[j];
                    arrayEstudiantes[j] = arrayEstudiantes[j+1];
                    arrayEstudiantes[j+1] = t;
                }
            }

        }
    }

    static Estudiante[] pedirDatos() {
        Scanner scanner = new Scanner(System.in);

        final int maxEstudiantes = 100;
        Estudiante[] estudiantes = new Estudiante[maxEstudiantes];

        int indice = 0;

        while (true) {
            System.out.print("Nombre de el estudiante " + (indice + 1) + ": ");
            String nombre = scanner.nextLine();
            if (nombre.equals(".")) {
                break;
            }
            System.out.print("Nota de Matemáticas de " + nombre + ": ");
            double notaMate = Double.parseDouble(scanner.nextLine());
            System.out.print("Nota de Castellano de " + nombre + ": ");
            double notaCast = Double.parseDouble(scanner.nextLine());

            estudiantes[indice] = new Estudiante(nombre, notaMate, notaCast);
            indice++;
        }


        Estudiante[] arrayEstudiantes = new Estudiante[indice];

        for (int i = 0; i < indice; i++) {
            arrayEstudiantes[i] = estudiantes[i];
        }
        return arrayEstudiantes;
    }

    static void muestraDatos(Estudiante[] arrayEstudiantes) {

        System.out.printf("%-15s |  %-20s |  %-20s%n", "Nombre", "Nota Matemáticas", "Nota Castellano");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < arrayEstudiantes.length; i++) {
            System.out.printf("%-15s |  %-20.2f |  %-20.2f%n",arrayEstudiantes[i].nombre, arrayEstudiantes[i].notaMatematicas, arrayEstudiantes[i].notaCastellano);
        }

        System.out.println("--------------------------------------------------------------------------");

        System.out.printf("%-15s |  ", "Media");
        for (int i = 0; i < arrayEstudiantes.length; i++) {
            double media = (arrayEstudiantes[i].notaMatematicas + arrayEstudiantes[i].notaCastellano) / 2;
            System.out.printf("%-20.2f |  ", media);
        }
    }
}
