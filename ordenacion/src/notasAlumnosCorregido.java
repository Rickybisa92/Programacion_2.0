import java.util.Arrays;
import java.util.Scanner;

public class notasAlumnosCorregido {

    // estas clases estaran disponible para todos los metodos
    static String[] arrayNombres;
    static double[] arrayNotasMate;
    static double[] arrayNotasCast;

    public static void main(String[] args) {
        pedirDatos();
        muestraDatos();
        ordenarPorNotaMat();
    }

    static void ordenarPorNotaMat() {
        for (int i = arrayNotasMate.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayNotasMate[j] > arrayNotasMate[j+1]) {
                    double t = arrayNotasMate[j];
                    arrayNotasMate[j] = arrayNotasMate[j+1];
                    arrayNotasMate[j+1] = t;

                    String t2 = arrayNombres[j];
                    arrayNombres[j] = arrayNombres[j+1];
                    arrayNombres[j+1] = t2;

                     t = arrayNotasCast[j];
                    arrayNotasCast[j] = arrayNotasCast[j+1];
                    arrayNotasCast[j+1] = t;
                }
            }

        }

        System.out.println("Ordenado por nota de Matemáticas");
        muestraDatos();
    }

    static void pedirDatos() {
        Scanner scanner = new Scanner(System.in);

        final int maxEstudiantes = 100;
        String[] nombres = new String[maxEstudiantes];
        double[] notasMate = new double[maxEstudiantes];
        double[] notasCast = new double[maxEstudiantes];

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

            nombres[indice] = nombre;
            notasMate[indice] = notaMate;
            notasCast[indice] = notaCast;
            indice++;
        }

        //Crear los arrays otra vez con el tamaño correcto
        //y copiar los datos a los nuevos arrays
        arrayNombres = new String[indice];
        arrayNotasMate = new double[indice];
        arrayNotasCast = new double[indice];
        for (int i = 0; i < indice; i++) {
            arrayNombres[i] = nombres[i];
            arrayNotasMate[i] = notasMate[i];
            arrayNotasCast[i] = notasCast[i];
        }

        System.out.println(Arrays.toString(arrayNombres));
    }

    static void muestraDatos() {

        System.out.printf("%-15s |  %-20s |  %-20s%n", "Nombre", "Nota Matemáticas", "Nota Castellano");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.printf("%-15s |  %-20.2f |  %-20.2f%n", arrayNombres[i], arrayNotasMate[i], arrayNotasCast[i]);
        }

        System.out.println("--------------------------------------------------------------------------");

        System.out.printf("%-15s |  ", "Media");
        for (int i = 0; i < arrayNombres.length; i++) {
            double media = (arrayNotasMate[i] + arrayNotasCast[i]) / 2;
            System.out.printf("%-20.2f |  ", media);
        }
    }
}
