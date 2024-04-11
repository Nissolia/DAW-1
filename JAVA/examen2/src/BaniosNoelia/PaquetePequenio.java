package BaniosNoelia;

public class PaquetePequenio extends Paquete {
	/*************/
	/* ATRIBUTOS */
	/*************/
	private int peso = 0;
	private int pesoMax = 10;

	/*****************/
	/* CONSTRUCTORES */
	/*****************/
	PaquetePequenio(String destino, String origen) {
		super(destino, origen);
		setDestino(destino);
		setOrigen(origen);

	}

	PaquetePequenio(String destino, String origen, int peso) {
		super(destino, origen);
		setDestino(destino);
		setOrigen(origen);
		this.peso = peso;
	}

	/*********************/
	/* GETTERS Y SETTERS */
	/*********************/
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}

	/***********/
	/* MÉTODOS */
	/***********/
	// CALCULAMOS EL COSTE DE ENVIO
	@Override
	public void calcularCoste() {
		if (peso > pesoMax) {
			System.out.println("Has superado el peso máximo establecido.");
			
		}else {
			setCosteEnvio(peso * 0.5);
		}
	}

	@Override
	public String toString() {
		return "PaquetePequenio [peso=" + peso + ", pesoMax=" + pesoMax + ", getIdPaquete()=" + getIdPaquete()
				+ ", getDestino()=" + getDestino() + ", getOrigen()=" + getOrigen() + ", getCosteEnvio()="
				+ getCosteEnvio() + "]";
	}
	
		
}
