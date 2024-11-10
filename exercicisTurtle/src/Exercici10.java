public class Exercici10 {
    public static void main(String[] args) {
        Turtle t = new Turtle(500,500);

        int costados = 70;


        t.forward(costados);
        t.turnRight(90);
        for (int i = 0; i < 20; i++) {
            t.forward(5);
            t.turnRight(5);
        }
        t.turnRight(80);
        t.forward(costados);

        t.setDelay(100);
        t.markCursor();
        t.show();
    }
}
