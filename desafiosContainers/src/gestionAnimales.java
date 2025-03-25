import java.util.ArrayList;
import java.util.List;

public class gestionAnimales {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Animal("Perro", "Canino", 5));
        animales.add(new Animal("Gato", "Felino", 3));
        animales.add(new Animal("Pájaro", "Ave", 1));
        animales.add(new Animal("Tiburon", "Acuatico", 7));

        // Mostrar animales
        for (int i = 0; i < animales.size(); i++) {
            animales.get(i).mostrarDatos();
            System.out.println();
        }

        // Sonidos de los animales
        for (int i = 0; i < animales.size(); i++) {
            animales.get(i).hacerSonido();
            System.out.println();
        }


    }
}

class Animal {
    String nombre;
    String especie;
    int edad;

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public String nombre() {
        return nombre;
    }

    public String especie() {
        return especie;
    }

    public int edad() {
        return edad;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setEspecie(String especie) {
        this.especie = especie;
    }

    void setEdad(int edad) {
        this.edad = edad;
    }


    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }

    void hacerSonido() {
        if (especie.equals("Canino")) {
            System.out.println("El canino hace: Guau guau");
        } else if (especie.equals("Felino")) {
            System.out.println("El felino hace: Miau miau");
        } else if (especie.equals("Ave")) {
            System.out.println("El ave hace: Pio pio");
        } else {
            System.out.println("la especie no esta en la base de datos");
        }
    }
}
