package BaniosNoelia;

public class PaqueteGrande extends Paquete {
	/*************/
	/* ATRIBUTOS */
	/*************/
	private int altura = -1;
	private int anchura = -1;
	private int grosor = -1;
	private double volumen = -1;
	private boolean fragil = false;

	/*****************/
	/* CONSTRUCTORES */
	/*****************/
	PaqueteGrande(String destino, String origen) {
		super(destino, origen);
		setDestino(destino);
		setOrigen(origen);

	}

	PaqueteGrande(String destino, String origen, 
			int altura, int anchura, int grosor) {
		super(destino, origen);
		setDestino(destino);
		setOrigen(origen);
		this.altura = altura;
		this.anchura = anchura;
		this.grosor = grosor;
		
	}

	/*********************/
	/* GETTERS Y SETTERS */
	/*********************/
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public int getGrosor() {
		return grosor;
	}

	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}

	public double getVolumen() {
		return volumen;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	/***********/
	/* MÉTODOS */
	/***********/
	// CALCULAR VOLUMEN
	private double calcularVolumen() {
		double aux = altura * anchura * grosor;
		volumen = aux;
		return volumen;
	}
	// CALCULAR COSTE
	@Override
	public void calcularCoste() {
		calcularVolumen();
		setCosteEnvio(volumen*0.05);
		// COMPROBAMOS SI ES O NO FRÁGIL EL PAQUETE
		if (fragil == true) {
			setCosteEnvio(getCosteEnvio() + 10);
		} 
	}
	// CALCULAR COSTE + STRING
	public void calcularCoste(String texto) {
		calcularVolumen();
		// CALCULAMOS EL VOLUMEN
		if (texto == "DES10") {
			double aux = (volumen * 0.10);
			volumen = volumen  - aux;
			
		}else if (texto == "DES25") {
			double aux = (volumen * 0.25);
			volumen = volumen  - aux;
		}
	}

	@Override
	public String toString() {
		return "PaqueteGrande [altura=" + altura + ", anchura=" + anchura + ", grosor=" + grosor + ", volumen="
				+ volumen + ", fragil=" + fragil + ", getIdPaquete()=" + getIdPaquete() + ", getDestino()="
				+ getDestino() + ", getOrigen()=" + getOrigen() + ", getCosteEnvio()=" + getCosteEnvio() + "]";
	}

	
}
