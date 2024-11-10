public class Exercici6 {
    public static void main(String[] args) {
        Turtle t = new Turtle(500, 500);

        int costados = 50;
        int numeroVueltas = 10;
        int poligonoCostados = 5;

        for (int i = 0; i < numeroVueltas; i++) {
            poligono(t, costados, poligonoCostados);
            costados += 15;
        }



        //t.setDelay(500);
        t.markCursor();
        t.show();
    }


    public static void poligono(Turtle t, int costados, int poligonoCostados) {
        for (int i = 0; i < poligonoCostados - 4; i++) {
            t.forward(costados);
            t.turnRight(360/poligonoCostados);
        }
    }

    public static void costadoPlus(Turtle t, int costado) {

    }


}
