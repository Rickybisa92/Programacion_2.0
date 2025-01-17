
// 4- Fes una classe anomenada «Nombre» amb les següents característiques:
// • El constructor accepta un valor «int»
//• El constructor accepta un «String» representant la forma «romana» del número
//• Té un mètode anomenat «hex» que retorna un string amb la forma hexadecimal del número
//• Té un mètode anomenat «bin» que retorna un string amb la forma binària del número.

public class exercici4 {
    public static void main(String[] args) {

    }
}

class Nombre {
    int numero;
    String nombre;

    public Nombre(int numero) {
        this.numero = numero;
    }

    public Nombre (String nombre) {
        this.nombre = nombre;
    }

    public void hex(String nombre) {
        System.out.println(Integer.toHexString(numero));
    }

    public void bin(String nombre) {
        System.out.println(Integer.toBinaryString(numero));
    }
}