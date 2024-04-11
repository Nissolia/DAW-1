package tareaClases_1;

public class Misifu {
	/*************/
	/* ATRIBUTOS */
	/*************/
	private int vidas = 7;
	private boolean vivo = true;
	private String nombre;

	/*****************/
	/* CONSTRUCTORES */
	/*****************/
	Misifu() {
	}

	Misifu(String nombre) {
		vidas = 7;
		this.nombre = nombre;
	}

	Misifu(String nombre, int vidas) {
		this.nombre = nombre;
		this.vidas = vidas;
	}

	/***************/
	/* GET AND SET */
	/***************/
	// PARA METER DATOS
	public String getNombre() {
		return nombre;
	}

	public int getVidas() {
		return vidas;
	}

	// PARA VER DATOS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	/***********/
	/* MÉTODOS */
	/***********/
	public Boolean estarVivo() {
		if (vidas > 0) {
			System.out.print("El gato esta vivo");
			return true;
		} else {
			System.out.print("El gato esta muerto");
			return false;
		}
	}

	public String maullido() {
		String miau = "";
		if (this.estarVivo() == true) {
			miau = "Miau. . . Miau. . .";
		} 
		return miau;
	}

}