package Excepciones_2;

import tareaClases_2.Persona;

public class Producto {
	// atributos
	private String nombre;
	private int cantidad;
	private double precio;

	// constructores
	public Producto() {
	}

	public Producto(String nombre) {
		this.nombre = nombre;
		this.cantidad = 1;
		this.precio = 10;
	}

	public Producto(String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	// getter y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/************/
	/* MÉTODOS */
	/************/

	/**
	 * equals si tienen el mismo nombre y devulve true
	 * 
	 * @param object
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		boolean salir = false;
		// Verificar si obj es una instancia de Persona
		if (obj != null) {
			salir = true;
		} else if (!(obj instanceof Persona)) {
			salir = false;
		} else {
			Persona aux = (Persona) obj;
			if (this.nombre.equals(aux.getNombre())) {
				salir = true;
			}
		}
		return salir;
	}

	@Override
	public String toString() {
		return nombre + ", " + cantidad + " unidades, " + precio + "€";
	}
	

}
