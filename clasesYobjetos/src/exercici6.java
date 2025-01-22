public class exercici6 {
    public static void main(String[] args) {

        Carta asEspases = new Carta(Carta.Coll.ESPASES, Carta.Numero.AS);
        System.out.println("Coll: " + asEspases.getColl());
        System.out.println("Numero: " + asEspases.getNumero());
        Carta sotaOros = new Carta(Carta.Coll.OROS, Carta.Numero.SOTA);
        System.out.println("Coll: " + sotaOros.getColl());
        System.out.println("Numero: " + sotaOros.getNumero());


    }
}

class Carta {
    enum Coll {
        OROS, COPAS, ESPASES, BASTOS
    }

    enum Numero {
        AS, DOS, TRES, QUATRE, CINC, SIS, SET, VUIT, NOU, SOTA, CAVALL, REI
    }

    Coll coll; // Coll es una variable de instancia
    Numero numero; // Numero es una variable de instancia


    // Constructor
    public Carta(Coll coll, Numero numero) {
        this.coll = coll;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "coll=" + coll +
                ", numero=" + numero +
                '}';
    }

    public Coll getColl() {
        return coll;
    }

    public Numero getNumero() {
        return numero;
    }
}
