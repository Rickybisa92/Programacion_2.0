public class exercici6 {
    public static void main(String[] args) {

    }
}

class Carta {
    enum Coll {
        OROS, COPAS, ESPADAS, BASTOS
    }

    enum Numero {
        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
    }

    Coll coll; // Coll es una variable de instancia
    Numero numero; // Numero es una variable de instancia


    // Constructor
    public Carta(Coll coll, Numero numero) {
        this.coll = coll;
        this.numero = numero;
    }

    public Coll getColl() {
        return coll;
    }

    public Numero getNumero() {
        return numero;
    }
}
