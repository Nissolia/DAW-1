package EjPOO_a;

public class Cuenta {
	// Atributos
	String titular;
	double cantidad = 0;

	// Constructores
	public Cuenta(String titular) {
		this.titular = titular;
	}

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	// Getter y setter
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidadIngresar) {
		this.cantidad = cantidadIngresar;
	}

	// Métodos
	/* Creamos un método para poder ingresar el dinero */
	public void ingresar(double dinero) {
		if (dinero > 0) {
			cantidad += dinero;
		}
	}

	/* Creamos n método para poder retirar el dinero */
	public void retirar(double dinero) {
		// si la cuenta se queda a menos de 0, ponemos 0
		if (dinero > cantidad) {
			cantidad = 0;
		} else {
			cantidad -= dinero;
		}
	}

	// Método To String
	@Override
	public String toString() {
		return "Cuenta del titular: " + titular + ", con una cantidad de " + cantidad + "€.";
	}

}
