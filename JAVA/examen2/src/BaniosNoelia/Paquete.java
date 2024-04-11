package BaniosNoelia;
/**
 *
 *
 */
public class Paquete {
	/*************/
	/* ATRIBUTOS */
	/*************/
	private int idPaquete = (int) (Math.random() * 5000000);
	private String destino = "Correuus";
	private String origen = "Correuus";
	private double costeEnvio = 0;

	/*****************/
	/* CONSTRUCTORES */
	/*****************/

	public Paquete(String destino, String origen) {
		this.destino = destino;
		this.origen = origen;
	}

	/*********************/
	/* GETTERS Y SETTERS */
	/*********************/
	public int getIdPaquete() {
		return idPaquete;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public double getCosteEnvio() {
		return costeEnvio;
	}

	public void setCosteEnvio(double costeEnvio) {
		this.costeEnvio = costeEnvio;
	}

	/***********/
	/* MÉTODOS */
	/***********/
// ENVIAR CARTA
	public String enviar() {
		String mensaje = "";
		if (costeEnvio > 0) {
			mensaje = "Todo correcto, procederemos al envio.";
		} else {
			mensaje = "Error, no podemos enviar su paquete.";
		}

		return mensaje;
	}

	// CALCULAR COSTE DEL PAQUETE
	public void calcularCoste() {
		System.out.println("No se tienen datos suficientes para calcular el coste del paquete.");
	}

}
