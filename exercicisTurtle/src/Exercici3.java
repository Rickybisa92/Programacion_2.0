import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Turtle t = new Turtle(500,500);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige el tamaño del cuadrado:");
        int costados = scanner.nextInt();

        System.out.println("Numero de cuadrados vertical:");
        int numeroCuadradosVertical = scanner.nextInt();

        System.out.println("Numero de cuadrados horizontal");
        int numeroCuadradosHorizontal = scanner.nextInt();


        for (int i = 0; i < numeroCuadradosHorizontal; i++) {
            dibujaColumna(t, costados, numeroCuadradosVertical);
            posicionSiguiente(t, numeroCuadradosVertical, costados);

        }



        t.setDelay(200);
        t.markCursor();
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
            cuadrado(t, costados);
            t.setPenDown(false);
            t.forward(costados);
            t.setPenDown(true);
        }
    }

    public static void posicionSiguiente(Turtle t, int numeroCuadradosVertical, int costado){
        t.setPenDown(false);
        t.forward(-numeroCuadradosVertical*costado);
        t.turnRight(90);
        t.forward(costado);
        t.turnLeft(90);
        t.markCursor(Turtle.Color.RED);
        t.setPenDown(true);
    }
}
