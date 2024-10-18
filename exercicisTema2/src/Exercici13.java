import java.util.Scanner;

/*
13- Fes un programa que calculi la distància entre dos punts (en un espai bidimensional). Cada
punt ve donat per dos números (coordenada x i coordenada y)
 */
public class Exercici13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Primer punto
        System.out.println("Dame las coordenadas del punto x1:");
        double x1 = scanner.nextInt();
        System.out.println("x1: " + x1);
        System.out.println("Ahora dame las de punto y1:");
        double y1 = scanner.nextInt();
        System.out.println("y1: " + y1);

        //Segundo punto
        System.out.println("Ahora dame las del punto x2:");
        double x2 = scanner.nextInt();
        System.out.println("x2: " + x2);
        double y2 = scanner.nextInt();
        System.out.println("y2: " + y2);

        //Teorema de pitagoras
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
}
