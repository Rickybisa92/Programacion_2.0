public class objetos {
    public static void main(String[] args) {
// Crear un objeto de la clase "Persona"
        Estudiante p = new Estudiante("Juan", 9, 8);

        // Crear otro objeto de la clase "Persona"
        Estudiante p1 = new Estudiante("Pedro", 7, 5);
        // Asignar valores a los atributos del objeto
        p1.nombre = "Pedro";
        p1.notaMatematicas = 9;
        p1.notaCastellano = 4;


      //  System.out.println(p.nombre + " tiene un " + p.notaMatematicas + " en matemáticas y un " + p.notaCastellano + " en castellano");
        System.out.println(p);
        Estudiante[] alumnos = new Estudiante[10];
    }
}
// Definir una clase "Persona"
class Estudiante {
    // Atributos de la clase
    String nombre;
    double notaMatematicas;
    double notaCastellano;

    //Constructor tiene la funcion de crear los objetos
    //a partir de los datos que se le pasan
    Estudiante(String nombre, double notaMatematicas, double notaCastellano) {
        this.nombre = nombre;
        this.notaMatematicas = notaMatematicas;
        this.notaCastellano = notaCastellano;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre: '" + nombre + '\'' +
                ", notaMatematicas: " + notaMatematicas +
                ", notaCastellano: " + notaCastellano +
                '}';
    }
}
