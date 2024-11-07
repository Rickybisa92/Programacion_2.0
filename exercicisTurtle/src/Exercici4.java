public class Exercici4 {
    public static void main(String[] args) {
        Turtle t = new Turtle(500,500);


        int numeroHojas = 1;
        int longitud = 50;

        for (int i = 0; i < numeroHojas; i++) {
            dibujaHojas(t, longitud);
        }

        t.setDelay(550);

        t.markCursor();
        t.show();

    }

    public static void dibujaHojas(Turtle t, int longitud) {
        t.turnLeft(90);
        t.forward(longitud);
        t.turnRight(135);
        t.forward(longitud);
    }
}
