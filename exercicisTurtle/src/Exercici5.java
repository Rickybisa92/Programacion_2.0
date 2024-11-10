public class Exercici5 {
    public static void main(String[] args) {
        Turtle t = new Turtle(500, 500);

        int numeroCuadrados = 2;
        int costados = 50;

        for (int i = 0; i < numeroCuadrados; i++) {
            cuadrado(t,costados);
            costados += 20;
            siguienteCuadrado(t);
        }


        t.setDelay(700);
        t.markCursor();
        t.show();
    }

    public static void cuadrado(Turtle t, int costados) {
        for (int i = 0; i < 4; i++) {
            t.forward(costados);
            t.turnRight(90);
        }


    }

    public static void siguienteCuadrado(Turtle t) {
        t.setPenDown(false);
        t.turnLeft(90);
        t.forward(10);
        t.turnLeft(90);
        t.forward(10);
        t.setPenDown(true);
        t.turnRight(180);
    }
}
