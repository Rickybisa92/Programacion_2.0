import java.util.Arrays;

public class exercici7 {
    public static void main(String[] args) {
        Carta[] baralla = new Carta[48];

        int contador = 0;
        for (int coll = 0; coll < 4; coll++) {
            for (int numero = 0; numero < 12; numero++) {
                baralla[contador] = new Carta(transformaNumAColl(coll), transformaNumero(numero));
                contador++;
            }
        }
        System.out.println(Arrays.toString(baralla));
    }

    static Carta.Coll transformaNumAColl(int num) {
        if (num == 0) return Carta.Coll.OROS;
        if (num == 1) return Carta.Coll.COPAS;
        if (num == 2) return Carta.Coll.ESPASES;
        if  (num == 3) return Carta.Coll.BASTOS;
        throw new RuntimeException("Numero de coll no valid");
    }

    static Carta.Numero transformaNumero(int num) {
        if (num == 0) return Carta.Numero.AS;
        if (num == 1) return Carta.Numero.DOS;
        if (num == 2) return Carta.Numero.TRES;
        if (num == 3) return Carta.Numero.QUATRE;
        if (num == 4) return Carta.Numero.CINC;
        if (num == 5) return Carta.Numero.SIS;
        if (num == 6) return Carta.Numero.SET;
        if (num == 7) return Carta.Numero.VUIT;
        if (num == 8) return Carta.Numero.NOU;
        if (num == 9) return Carta.Numero.SOTA;
        if (num == 10) return Carta.Numero.CAVALL;
        if (num == 11) return Carta.Numero.REI;
        throw new RuntimeException("Numero de carta no valid");
    }
}

class Baralla {
    Carta[] Cartes = new Carta[48];


    // Constructor
    public Baralla() {
        int contador = 0;
        for (int coll = 0; coll < 4; coll++) {
            for (int numero = 0; numero < 12; numero++) {
                Cartes[contador] = new Carta(Carta.Coll.values()[coll], Carta.Numero.values()[numero]);
                contador++;
            }
        }
    }

    // Barreja les cartes de la baralla de forma aleatoria
    public void barreja() {
        for (int i = 0; i < Cartes.length; i++) {
            int random = (int) (Math.random() * Cartes.length);
            // Intercambiar cartas de posición i y random en el array de cartas Cartes
            Carta temp = Cartes[i]; // Guardar la carta de la posición i en una variable temporal
            Cartes[i] = Cartes[random]; // Intercambiar la carta de la posición i por la de la posición random
            Cartes[random] = temp; // Intercambiar la carta de la posición random por la de la posición i

            //Explicame el porque de este codigo y que hace exactamente en el programa
            // Este codigo intercambia las cartas de posición i y random en el array de cartas Cartes
            // de forma aleatoria, es decir, baraja las cartas de la baraja.
        }
    }
}
