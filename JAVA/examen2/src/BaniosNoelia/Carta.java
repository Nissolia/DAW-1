package BaniosNoelia;

public class Carta extends Paquete {
	/*************/
	/* ATRIBUTOS */
	/*************/
	private boolean sello = false;
	private String mensaje = "";

	/*****************/
	/* CONSTRUCTORES */
	/*****************/
	Carta(String destino, String origen) {
		super(destino, origen);
		setDestino(destino);
		setOrigen(origen);
	}

	/*********************/
	/* GETTERS Y SETTERS */
	/*********************/
	public boolean isSello() {
		return sello;
	}

	public void setSello(boolean sello) {
		this.sello = sello;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/***********/
	/* MÉTODOS */
	/***********/
	// ENSEÑAMOS EL MENSAJE
	public String leerMensaje() {
		return mensaje;
	}

	// CALCULARCOSTE
	@Override
	public void calcularCoste() {
		if (sello == true) {
			// SE PONE A 0.05 SI TIENE SELLO
			setCosteEnvio(0.05);
		}
	}

	// CALCULAR COSTE CON UN INT
	public boolean calcularCoste(int numero) {
		boolean coste = false;
		// COMPROBAMOS EL COSTE CON LA LARGURA DEL STRING
		if (numero >= mensaje.length()) {
			// MENSAJE POR PANTALLA PARA MOSTRARLE AL USUARIO LO QUE HAREMOS
			System.out.println("El envio pasa a ser 0, enhorabuena.");
			setCosteEnvio(0);
			coste = true;
		}
		return coste;
	}

// TO STRING SIN EL MENSAJE
	@Override
	public String toString() {
		return "Carta [sello=" + sello + ", getIdPaquete()=" + getIdPaquete() + ", getDestino()=" + getDestino()
				+ ", getOrigen()=" + getOrigen() + ", getCosteEnvio()=" + getCosteEnvio() + "]";
	}

}
