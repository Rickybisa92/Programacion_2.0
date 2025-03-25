import java.util.ArrayList;
import java.util.List;

public class tiendaOnline {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Camiseta", 15.99, 10);
        Producto producto2 = new Producto("Pantalón", 25.99, 5);
        Producto producto3 = new Producto("Zapatos", 45.99, 3);

        // Crear carrito de compras
        Carrito carrito = new Carrito(new ArrayList<>());


        // Agregar productos al carrito
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        // Calcular total de productos en el carrito
        carrito.calcularTotalProducto(producto1);
        carrito.calcularTotalProducto(producto2);
        carrito.calcularTotalProducto(producto3);

        // Mostrar productos en el carrito
        carrito.mostrarProductos();

        // Vaciar carrito
        carrito.vaciarCarrito();
    }
}

class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

class Carrito {
    List<Producto> productos; // Lista de productos que tiene el carrito de compras

    public Carrito(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double calcularTotalProducto(Producto producto) {
        double total = 0;
        for (int i = 0; i < productos.size() ; i++) {
            total += productos.get(i).getPrecio();
        }
        return total;
    }


    public void vaciarCarrito() {
        productos.clear(); // Elimina todos los productos del carrito
    }

    public void mostrarProductos() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Producto: " + productos.get(i).getNombre());
        }
    }
}
