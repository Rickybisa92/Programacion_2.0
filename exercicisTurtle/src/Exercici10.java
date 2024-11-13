public class Exercici10 {

    //10- Dibuixa el següent gràfic.

    public static void main(String[] args) {
        Turtle t = new Turtle(500,500);

        int costados = 65;

        figura(t, costados);
        t.turnLeft(90);
        figura(t, costados);

        t.setDelay(100);
        t.markCursor();
        t.show();
    }

    public static void figura(Turtle t, int costados) {
        t.forward(costados);
        t.turnRight(90);
        for (int i = 0; i < 20; i++) {
            t.forward(5);
            t.turnRight(5);
        }
        t.turnRight(80);
        t.forward(costados-5);

    }
}
