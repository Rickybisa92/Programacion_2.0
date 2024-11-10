public class Exercici8 {
    public static void main(String[] args) {
        Turtle t = new Turtle(500,500);

        int lado = 50;
        int numTriangulos = 4;



        t.turnLeft(30);
       for (int i = 0; i < numTriangulos; i++) {
            triangulo(t, lado);

            t.setPenDown(false);
            t.turnLeft(90);
            t.setPenDown(true);
        }



        t.setDelay(300);
        t.markCursor();
        t.show();

    }

    public static void triangulo(Turtle t, int lado) {
        for (int i = 0; i < 3; i++) {
            t.forward(lado);
            t.turnRight(120);
        }
    }
}
