import java.util.*;

public class gestionInventarioLibreria {
    public static void main(String[] args) {
        List<String> inventario = new ArrayList<>();
        inventario.add("El señor de los anillos");
        inventario.add("El pequeño príncipe");
        inventario.add("1984");


        inventario.remove(1);
        inventario.add("Don Quijote de la Mancha");

        // Mostrar inventario
        for (int i = 0; i < inventario.size(); i++) {
            String s = inventario.get(i);
            System.out.println(i + " - " + s);
        }

        System.out.println("--------------------------------------");

        Map<String, Double> precio = new HashMap<>();

        precio.put("El señor de los anillos", 15.50); // put sirve para añadir un elemento al HashMap
        precio.put("1984", 12.75);
        precio.put("Don Quijote de la Mancha", 18.00);

        // Mostrar una tabla con dos columnas: "titulo" y "precio"
        System.out.printf("%-30s %10s%n", "Título", "Precio (€)"); // Encabezado
        System.out.println("--------------------------------------------");

        Set<String> titulos = precio.keySet();
        for (String titulo : titulos) {
            Double p = precio.get(titulo);
            System.out.printf("%-30s %10.2f%n", titulo, p);
        }

        System.out.println("--------------------------------------");

        // Mostrar el precio de un libro
        System.out.println("El precio de 1984 es: " + precio.get("1984"));

        System.out.println("--------------------------------------");

        //Modifica el precio de un libro
        precio.put("Don Quijote de la Mancha", 16.00); //put sirve para modificar un elemento en el HashMap

        //Agrega un nuevo libro al inventario (ArrayList) y al precio (HashMap)
        inventario.add("La Odisea");
        precio.put("La Odisea", 20.00);

        //Muestra solamente los títulos de los libros
        System.out.println("Títulos de los libros:");
        for (String titulo : titulos) {
            System.out.println(titulo);
        }

        System.out.println("--------------------------------------");

        //Gestionar comandas con una cola
        Queue<String> comandas = new LinkedList<>();
        comandas.offer("1984"); // offer sirve para añadir un elemento a la cola
        comandas.offer("Don Quijote de la Mancha");
        comandas.offer("Cien años de soledad");

        System.out.println("Titulos de los libros en la cola:");
        for (String comanda : comandas) {
            System.out.println(comanda);
        }

        System.out.println("--------------------------------------");

        //El primero libro en entrar es: 1984 y el primero en salir sera: 1984

        //Mostrar la comanda que se va a servir
        System.out.println("El libro que se ha quitado a sido: " + comandas.poll());

        System.out.println("--------------------------------------");

        //Que libro queda ahora en la cola
        System.out.println("El libro que queda en la cola es: ");
        for (String comanda : comandas) {
            System.out.println(comanda);
        }

        //Crear un stack para devoluciones
        Stack<String> devoluciones = new Stack<>();

        //Añadir un libro a la pila de devoluciones
        devoluciones.push("El pequeño príncipe"); // push sirve para añadir un elemento a la pila
        devoluciones.push("La Odisea");

        //El ultimo libro en entrar es: La Odisea y el primero en salir sera: El pequeño príncipe


        System.out.println("--------------------------------------");

        System.out.println("Se quita el libro: " + devoluciones.pop()); // pop sirve para quitar un elemento de la pila

        System.out.println("--------------------------------------");
        System.out.println("Libro que queda en la pila de devoluciones:");
        for (String devolucion : devoluciones) {
            System.out.println(devolucion);
        }

    }
}
