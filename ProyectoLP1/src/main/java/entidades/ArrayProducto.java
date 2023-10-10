package entidades;

import java.util.ArrayList;
import java.util.List;

public class ArrayProducto {
    private ArrayList<Producto> productos;

    public ArrayProducto() {
        productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public int tamaño() {
        return productos.size();
    }

    public Producto obtener(int i) {
        if (i >= 0 && i < productos.size()) {
            return productos.get(i);
        } else {
            return null;
        }
    }
    
    public Producto buscarProducto(int idProducto) {
        for (Producto producto : productos) {
            if (producto.getIdproducto() == idProducto) {
                return producto;
            }
        }
        return null;  // Si no se encuentra el producto, retorna null
    }
    
    public void eliminarProducto(int idProducto) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.getIdproducto() == idProducto) {
                productos.remove(i);
                break; // Romper el bucle una vez que se elimina el producto
            }
        }
    }
}
