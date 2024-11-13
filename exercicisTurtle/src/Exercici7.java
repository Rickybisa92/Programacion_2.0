import java.util.Scanner;

//7- Dibuixa el següent gràfic. Paràmetres: nombre de fulles.

public class Exercici7 {
    public static void main(String[] args) {
        Turtle t = new Turtle(500,500);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige el numero de petalos que quieres: ");
        int numPetalo = scanner.nextInt();

        double angulo = 360d / (double) numPetalo;


        for (int i = 0; i < numPetalo; i++) {
            hoja(t,i*angulo);
        }






        t.setDelay(300);
        t.markCursor();
        t.show();
    }

    public static void hoja(Turtle t, double angulo) {
        t.goTo(0, 0);
        t.resetAngle();
        t.turnRight((int) angulo);
        for (int i = 0; i < 20; i++) {
            t.forward(9);
            t.turnRight(3);
        }
        t.goTo(0, 0);
        t.resetAngle();
        t.turnRight((int) angulo);
        t.turnRight(57);
        for (int i = 0; i < 20; i++) {
            t.forward(9);
            t.turnLeft(3);

        }
    }
}
