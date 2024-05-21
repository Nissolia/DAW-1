package UltramarinosSL;

public class Articulo {
	// atributos que no varian
	final int IVA = 21;

	/* ATRIBUTOS */
	private static int id = 100; // ya que comienza en 100
	String nombre;
	double precioVenta;
	double precioCompra;
	int stock; // cantidad disponible en la tienda
	/* CONSTRUCTORES */

	/*
	 * se hacen varias comprobaciones para confirmar que se meten los atributos
	 * correctamente
	 */

	public Articulo(String nombre, double precioVenta, double precioCompra, int stock) {

		id++;
		this.nombre = nombre;
		if (precioVenta > 0 && precioCompra > 0 && precioVenta > precioCompra) {
			this.precioVenta = precioVenta;
			this.precioCompra = precioCompra;
		} else {
			throw new ImposibleCrearArticuloException();
		}
		if (stock >= 0) {
			this.stock = stock;
		} else {
			throw new ImposibleCrearArticuloException();
		}
	}

	/* GETTER Y SETTERS */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		actualizarPrecio();
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/* se actualiza cuando se cambia */
	private void actualizarPrecio() {
		precioVenta = (precioCompra / 2) * (IVA / 100.0) + (precioCompra * 3 / 2);
	}

	/**
	 * @params double precio, int cantidad
	 * @return boolean exito
	 */
	public boolean ventasClientes(double precio, int cantidad) {
		boolean exito = true;// por si sale bien
		try {
			do {
				precioVenta = precio;
				stock = cantidad;
			} while (precioVenta > 0 && cantidad > 0);

			// actualización por si se lia
			if (precioVenta < precioCompra) { // si el precio está desactualizado
				actualizarPrecio();
			}
		} catch (Exception e) {
			exito = false;
			throw new ImposibleCrearArticuloException();
		}
		return exito;
	}

	/**
	 * @params double precio, int cantidad
	 * @return boolean exito
	 */
	public boolean comprasProveedores(double precio, int cantidad) {
		boolean exito = true;// por si sale bien
		try {
			do {
				precioCompra = precio;
				stock = cantidad;
			} while (precioCompra > 0 && cantidad > 0);

			// actualización por si se lia
			if (precioVenta < precioCompra) { // si el precio está desactualizado
				actualizarPrecio();
			}
		} catch (Exception e) {
			exito = false;
			throw new ImposibleCrearArticuloException();
		}

		return exito;
	}

	/**/
	public static Articulo generarArticuloAleatorio() {
		String[] nombres = { "Manzana", "Plátano", "Naranja", "Pera", "Uva", "Pimiento", "Cebolla", "Tomate",
				"Patata" };
		String nombre = nombres[(int) (Math.random() * nombres.length)];
		double precioCompra = Math.random() * 100; // precio entre 0 y 100
		double precioVenta = precioCompra + (precioCompra * (21.0 / 100)); // precio de venta con IVA
		int stock = (int) (Math.random() * 100); // stock entre 0 y 100
		return new Articulo(nombre, precioVenta, precioCompra, stock);
	}

	/* toString modificado para usarlo */
	@Override
	public String toString() {
		return "ID: " + id + ", nombre: " + nombre + ", precios: " + precioVenta + ", " + precioCompra + ", stock: "
				+ stock;
	}

}
