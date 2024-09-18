package dao;

import interfaces.Sesion9;
import models.Product;
import models.Student;

import java.util.ArrayList;
import java.util.List;

public class ProductDao implements Sesion9 {
    // Simulación de una base de datos en memoria usando una lista
    private List<Product> products = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        // Verifica si el objeto es de tipo Product
        if (object instanceof Product) {
            Product product = (Product) object;
            // Agrega el producto a la lista de productos
            try {
                products.add(product);
                return true;
            } catch (Exception e) {
                System.out.println("Error al agregar el producto: " + e.getMessage());
                return false;
            }
        } else {
            System.out.println("El objeto proporcionado no es un producto.");
            return false;
        }
    }

    @Override
    public void findByname(String name, Student[] students) {
        // Busca el producto por nombre en la lista de productos
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
                return;  // Termina cuando encuentra el primer producto coincidente
            }
        }
        // Si no encuentra el producto
        System.out.println("Producto con nombre '" + name + "' no encontrado.");
    }

    // Método adicional para obtener todos los productos (puede ser útil en el menú)
    public List<Product> getAllProducts() {
        return products;
    }
}
