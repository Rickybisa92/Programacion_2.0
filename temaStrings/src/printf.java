public class printf {
    public static void main(String[] args) {
        String nombre = "Ricky";
        String profesion = "Estudiante";
        int edad = 32;
        double altura = 1.7583;
        System.out.printf("Nombre: %s, Profesion: %s, Edad: %d, Altura: %.3f",
                nombre,
                profesion,
                edad,
                altura);
    }
}
