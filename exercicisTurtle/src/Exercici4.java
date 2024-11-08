public class Exercici4 {
    public static void main(String[] args) {
        Turtle t = new Turtle(500, 500);

        int numeroHojas = 5;  // Número de hojas o niveles en el dibujo
        int cateto1 = 40;      // Longitud del cateto
        int hipotenusa = (int) Math.sqrt((cateto1 * cateto1) + (cateto1 * cateto1));  // Longitud de la hipotenusa


        // Dibuja el tronco después de las hojas
        t.forward(cateto1 / 2);  // Dibuja el tronco

        t.turnLeft(90);
        hojasDerecha(t, cateto1, hipotenusa, numeroHojas);
        t.turnRight(135);
        t.forward(20);
        t.turnRight(90);
        t.forward(20);
        hojasIzquierda(t, cateto1, hipotenusa,numeroHojas);
        t.turnRight(45);
        t.forward(cateto1 / 2);
        t.turnLeft(90);

        t.setDelay(100);
        t.markCursor();
        t.show();
    }

    public static void hojasDerecha(Turtle t, int cateto, int hipotenusa, int numeroHojas) {

        for (int i = 0; i < numeroHojas; i++) {
            t.forward(cateto);
            t.turnRight(135);
            t.forward(hipotenusa);
            t.turnLeft(135);

        }


    }

    public static void hojasIzquierda(Turtle t, int cateto, int hipotenusa, int numeroHojas) {

        for (int i = 0; i < numeroHojas; i++) {
            t.forward(hipotenusa);
            t.turnLeft(225);
            t.forward(cateto);
            t.turnRight(225);





        }
    }
}
