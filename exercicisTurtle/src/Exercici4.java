public class Exercici4 {
    public static void main(String[] args) {
        Turtle t = new Turtle(500, 500);

        int numeroHojas = 2;  // Número de hojas o niveles en el dibujo
        int cateto = 50;      // Longitud del cateto
        int hipotenusa = 70;  // Longitud de la hipotenusa


        // Dibuja el tronco después de las hojas
        t.forward(cateto / 2);  // Dibuja el tronco



        for (int i = 0; i < numeroHojas; i++) {
            dibujaHoja(t, cateto, hipotenusa);

            // Mueve la tortuga hacia abajo para el siguiente nivel
            t.turnLeft(135);
            t.forward(cateto);
            t.turnRight(135);

        }

        t.setDelay(700);
        t.markCursor();
        t.show();
    }

    public static void dibujaHoja(Turtle t, int cateto, int hipotenusa) {
        t.turnLeft(90);           // Orienta hacia arriba
        t.forward(cateto);        // Dibuja el primer segmento vertical de la "V"
        t.turnRight(135);         // Gira hacia la hipotenusa de la "V"
        t.forward(hipotenusa);    // Dibuja la primera línea diagonal de la "V"

    }
}
