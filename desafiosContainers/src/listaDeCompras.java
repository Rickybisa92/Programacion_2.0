import java.util.ArrayList;
import java.util.List;

public class listaDeCompras {
    public static void main(String[] args) {
        List<Productos> productos = new ArrayList<>();
        productos.add(new Productos("Manzanas", 5));
        productos.add(new Productos("Peras", 3));
        productos.add(new Productos("Plátanos", 2));

        // Crear lista de la compra
        ListaCompra listaCompra = new ListaCompra(productos);

        System.out.println("Productos en la lista de la compra:");
        listaCompra.mostrarProductos();
        listaCompra.calcularCantidad();
        System.out.println();

        // Agregar productos a la lista
        listaCompra.agregarProducto(new Productos("Naranjas", 4));

// Eliminar productos de la lista
        listaCompra.eliminarProducto("Peras");


        // Mostrar productos de la lista
        System.out.println("Productos en la segunda lista de la compra:");
        listaCompra.mostrarProductos();
        System.out.println();
        listaCompra.calcularCantidad();


    }
}

class Productos {
    String nombre;
    int cantidad;

    public Productos(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }


    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

class ListaCompra {
    List<Productos> productos;

    public ListaCompra(List<Productos> productos) {
        this.productos = productos;
    }


    void agregarProducto(Productos producto) {
        productos.add(producto);
        System.out.println("Producto añadido: " + producto.getNombre() + " Cantidad: " + producto.getCantidad());
        System.out.println();
    }

    void eliminarProducto(String nombreProducto) {
        boolean eliminado = false;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equals(nombreProducto)) {
                productos.remove(i);
                eliminado = true;
                System.out.println("Producto eliminado: " + nombreProducto);
                System.out.println();
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Producto no encontrado");
        }
    }

        void calcularCantidad() {
            int total = 0;
            for (int i = 0; i < productos.size(); i++) {
                total += productos.get(i).getCantidad();
            }
            System.out.println("Cantidad total de productos: " + total);
        }

        void mostrarProductos(){
            for (int i = 0; i < productos.size(); i++) {
                System.out.println("Producto: " + productos.get(i).getNombre() + " Cantidad: " + productos.get(i).getCantidad());
            }
        }
    }
