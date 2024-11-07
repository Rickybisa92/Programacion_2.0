import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {

        Turtle t = new Turtle(700,700);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige un tamaño de pixel horizontal:");
        int pixelHorizontal = scanner.nextInt();

        System.out.println("Elije un tamaño de pixel vertical:");
        int pixelVertical = scanner.nextInt();

        System.out.println("Elije numero de escalones");
        int numeroEscalones = scanner.nextInt();

        t.turnRight(90);
        dibujaEscalones(t, pixelHorizontal,pixelVertical,numeroEscalones);


        t.setDelay(750);
        t.markCursor();
        t.show();

    }


    public static void dibujaEscalones(Turtle t, int pixelHorizontal, int pixelVertical, int numeroEscalones) {
        for (int i = 0; i < numeroEscalones; i++) {
            t.forward(pixelHorizontal);
            t.turnRight(90);
            t.forward(pixelVertical);
            t.turnLeft(90);
        }

        for (int i = 0; i < numeroEscalones; i++) {
            t.forward(pixelHorizontal);
            t.turnLeft(90);
            t.forward(pixelVertical);
            t.turnRight(90);
        }



    }

}
