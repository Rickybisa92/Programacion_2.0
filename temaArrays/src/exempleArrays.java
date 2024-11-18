import java.util.Arrays;
import java.util.Scanner;

public class exempleArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declarando una tabla o ARRAY de 30 elementos
        // donde cada elemento de la tabla es un "int"
        System.out.println("Cuantas notas quieres añadir: ");
        int cuantasNotas = scanner.nextInt();
        int [] notas = new int[cuantasNotas];
        for (int i = 0; i < cuantasNotas; i++) {
            System.out.println("Pon una nota: ");
            notas[i] = scanner.nextInt();
        }



        double media = calculaMedia(notas);
        int max = calculaMaxNota(notas);
        int min = calculaMinNota(notas);
        System.out.printf("La nota minima es %d, la maxima es %d y la media es %f", min, max, media);

        //Para imprimir un array tenemos que llamar  a
        //la funcion "Arrays.toString"
        System.out.println(Arrays.toString(notas));

        //Declaramos una nueva variable de tipo ARRAY
        //Y le asignamos la tabla "notas"
        int[] notas2 = notas;
        notas2[3] = 100;

        //Una tabla de Strings, donde cada elemento
        //es un string
        String [] palabras = new String[3];

        palabras[0] = "Hola";
        palabras[1] = "jodido";
        palabras[2] = "mundo";

        System.out.println(Arrays.toString(palabras));



    }

    public static double calculaMedia(int[] ar) {
        int suma = 0;
        for (int i = 0; i < ar.length; i++) {
            suma += suma + ar[i];
        }
        double media = suma / (double) ar.length;
        return media;
    }

    public static int calculaMaxNota(int[] ar){
        int notaMaximi = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > notaMaximi) {
                notaMaximi = ar[i];
            }
        }
        return notaMaximi;
    }

    public static int calculaMinNota(int[] ar){
        int notaMinima = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < notaMinima) {
                notaMinima = ar[i];
            }
        }
        return notaMinima;
    }
}
