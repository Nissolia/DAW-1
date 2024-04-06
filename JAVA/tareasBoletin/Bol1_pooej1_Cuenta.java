package tareasBoletin;

public class Bol1_pooej1_Cuenta {
	/*************/
	/* ATRIBUTOS */
	/*************/
	private String titular;
	private double cantidad;

	/*****************/
	/* CONSTRUCTORES */
	
	Bol1_pooej1_Cuenta(String titular) {
		this.titular = titular;
		cantidad = 0;
	}

	Bol1_pooej1_Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	/* GETTER AND SETTERS */
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	/**********/
	/* MÉTODOS */
	/**********/
	public void ingresar(double dinero) {
		if (dinero > 0) {
			// AÑADIMOS EL DINERO QUE SE LE VA A INGRESAR
			cantidad += dinero;
			System.out.println("Ahora tienes: " + cantidad);

		} else {
			System.out.println("No se puede añadir una cantidad negativa a la cuenta.");
		}
	}

// RETIRAR EL DINERO DE LA CUENTA
	public void retirar(double dinero) {
		if (dinero > cantidad) {
			System.out.println("No puedes retirar más dinero del que tienes.");
		} else {
			cantidad -= dinero;
			System.out.println("Ahora tiens: " + cantidad);
		}
	}
}
