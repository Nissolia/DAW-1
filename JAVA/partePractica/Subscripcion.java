package partePractica;

public class Subscripcion {
	/**
	 * <h1>Clase subscripción</h1>
	 * 
	 * @author NoeliaBanios
	 * @version 1.0
	 * @since 20240222
	 */
	/*************/
	/* ATRIBUTOS */
	/*************/
	private int precio; // precio total de la subscripción euro-cent
	private int periodo; // periodo de subscripcion en meses

	/**
	 * <h3>Cosntructor que crea una subscripción</h3>
	 * 
	 * El constructor para crear una subscripción.
	 * 
	 * @params int precio
	 * @params int periodo
	 */
	public Subscripcion(int p, int n) {
		precio = p;
		periodo = n;
	}

	/**
	 * <h3>Método que calcula el precio</h3>
	 * 
	 * Calcula el precio de la subscripción mensual en euros,
	 * redondeándolo por arriba al céntimo más cercano.
	 * 
	 * @return double
	 */
	public double precioPorMes() {
		double sol;
		if (periodo <= 0 || precio <= 0) {
			sol = 0;
		} else {
			double r = (double) precio / (double) periodo;
			double resto = r % 1;

			if (resto > 0)
				sol = (int) r + 1;
			else
				sol = r;
		}
		return sol;
	}

	/**
	 * <h3>Cancelar subscipción.</h3>
	 * Método que cancela la subscripción
	 * Pone a 0 el atributo: periodo.
	 */
	public void cancel() {
		periodo = 0;
	}
}
