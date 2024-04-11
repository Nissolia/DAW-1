package Excepciones_2;

import java.util.Iterator;

public class CarritoCompra {
	// atributo final
	private final int MAX = 10;
	// atributo estático
	private int productoAct = 0;
	/**************** ATRIBUTOS ****************/
	private Producto p[] = new Producto[MAX];

	/**************** CONSTRUCTORES ****************/
	public CarritoCompra() {

	}

	/**************** MÉTODOS ****************/

	/**
	 * Agrega una cierta cantidad de un producto al carrito.
	 * 
	 * @param producto El producto que se desea agregar al carrito.
	 * @param cantidad La cantidad del producto que se desea agregar al carrito.
	 */
	public void agregarProducto(Producto producto, int cantidad) {
	    // ver si el producto existe en el carrito
	    int indice = buscarProductoEnCarrito(producto);
	    if (indice != -1) {
	        // si el producto existe comprobamos la cantidad y se la sumamos
	        p[indice].setCantidad(p[indice].getCantidad() + cantidad);
	    } else {
	        // Si el producto no existe, buscar el primer espacio disponible en el carrito
	        for (int i = 0; i < MAX; i++) {
	            if (p[i] == null) {
	                // Se ha encontrado un espacio disponible, agregar el producto
	                p[i] = producto;
	                p[i].setCantidad(cantidad);
	                break;
	            }
	        }
	    }
	}


	/**
	 * Elimina una cierta cantidad de un producto del carrito. Esta clase lanzará
	 * una excepción llamada “ProductoNoEncontradoException” si se intenta eliminar
	 * un Producto que no existe.
	 * 
	 * @param producto El producto que se desea eliminar del carrito.
	 * @param cantidad La cantidad que se desea eliminar del producto.
	 */
	public void eliminarProducto(Producto producto, int cantidad) {
	    int indice = buscarProductoEnCarrito(producto);
	    if (indice != -1) {
	        int aux = p[indice].getCantidad() - cantidad;
	        if (aux < 0) {
	            System.out.println("No puedes quitar más cantidad de la que hay en stock.");
	        } else {
	            p[indice].setCantidad(aux);
	        }
	    } else {
	        throw new ProductoNoEncontradoException("El producto que deseas eliminar no se encuentra en el carrito.");
	    }
	}


	/**
	 * Muestra el producto que está en la posición del array especificada.
	 * 
	 * @param i La posición del producto en el carrito.
	 * @throws ProductoNoEncontradoException Si la posición especificada no es válida o no hay producto en esa posición.
	 */
	public void mostrarProducto(int i) {
	    if (i < 0 || i >= MAX || p[i] == null) {
	        throw new ProductoNoEncontradoException("No existe el producto en esa posición.");
	    } else {
	        System.out.println(p[i].toString());
	    }
	}


	/**
	 * Calcula el total de la compra sumando el precio de todos los productos en el
	 * carrito. En el caso de estar vacío, lanza una excepción CarritoVacioException.
	 * 
	 * @throws CarritoVacioException Si el carrito está vacío.
	 */
	public void calcularTotal() {
	    double total = 0;

	    // Verificar si el carrito está vacío
	    boolean carritoVacio = true;
	    for (int i = 0; i < MAX; i++) {
	        if (p[i] != null) {
	            total += p[i].getPrecio() * p[i].getCantidad();
	            carritoVacio = false;
	        }
	    }

	    if (carritoVacio) {
	        throw new CarritoVacioException("El carrito está vacío.");
	    } else {
	        System.out.println("El total de la compra es: " + total);
	    }
	}


	/**
	 * Busca un producto en el carrito y devuelve su posición en la lista de
	 * productos. Si el producto no se encuentra, se lanza una excepción
	 * ProductoNoEncontradoException.
	 * 
	 * @param producto El producto que se busca en el carrito.
	 * @return La posición del producto en el carrito si se encuentra, -1 si no se
	 *         encuentra.
	 */
	private int buscarProductoEnCarrito(Producto producto) {
		for (int i = 0; i < MAX; i++) {
			if (p[i] != null && p[i].equals(producto)) {
				return i;
			}else {
				throw new ProductoNoEncontradoException("El producto que buscas no existe.");
			}
		}
		return -1;
	}

}
