import java.util.Scanner;
//1- Dibuixa el següent gràfic. Paràmetres: Nombre de quadres en horitzontal, nombre de quadres en
//vertical i longitud de costat.

public class Exercici1 {
    public static void main(String[] args) {
        // Create Turtle object
        Turtle t = new Turtle(500,500);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero de cuadrados horizontal:");
        int numeroCuadradosHorizontal = scanner.nextInt();

        System.out.println("Numero de cuadrados vertical:");
        int numeroCuadradosVertical = scanner.nextInt();

        System.out.println("Tamaño del costado del cuadrado:");
        int costado = scanner.nextInt();

        // Movements

        for (int i = 0; i < numeroCuadradosHorizontal; i++) {
            dibujaColumna(t, costado, numeroCuadradosVertical);
            posicionSiguiente(t, numeroCuadradosVertical,costado);
        }




        // Show cursor
        t.markCursor();

        // Show canvas
        t.show();

    }

    public static void cuadrado(Turtle t, int costados) {
        for (int i = 0; i < 4; i++) {
            t.forward(costados);
            t.turnRight(90);
        }
    }

    public static void dibujaColumna(Turtle t,int costados, int numeroCuadradosVertical) {
        for (int i = 0; i < numeroCuadradosVertical; i++) {
            cuadrado(t,costados);
            t.setPenDown(false);
            t.forward(costados/2+costados);
            t.setPenDown(true);
        }
    }

    public static void posicionSiguiente(Turtle t, int numeroCuadradosVertical, int costado){
        t.setPenDown(false);
        t.forward(-numeroCuadradosVertical*(costado+costado/2));
        t.turnRight(90);
        t.forward(costado + costado/2);
        t.turnLeft(90);
        t.markCursor(Turtle.Color.RED);
        t.setPenDown(true);
    }
}
