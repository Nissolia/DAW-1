package tareas;

public class Cafetera {
	/*************/
	/* ATRIBUTOS */
	/*************/
	private int capacidadMaxima = 0;
	private int capacidadActual = 0;

	/*****************/
	/* CONSTRUCTORES */
	/*****************/

	Cafetera() {
		this.capacidadMaxima = 1000;
		this.capacidadActual = 0;
	}

	Cafetera(int capacidad) {
		this.capacidadMaxima = capacidad;
		this.capacidadActual = capacidad;
	}

	Cafetera(int maxima, int actual) {
		this.capacidadMaxima = maxima;
		this.capacidadActual = actual;
	}

	/***********************/
	/* GETTERS AND SETTERS */
	/***********************/

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	/***********/
	/* METODOS */
	/***********/

	public int llenarCafetera() {
		capacidadActual = capacidadMaxima;

		return capacidadActual;
	}

	/********************/
	public int servirTaza(int servir) {
		// OPCIÓN SI LO QUE SE QUIERE SERVIR ES SUPERIOR A LO QUE TENEMOS
		if (capacidadActual < servir) {
			System.out.println("No hay para servir tantas tazas.");
			capacidadActual = 0;
		} else { // SI LO SERVIDO AUN DEJA ALGO EN LA CAPACIDAD ACTUAL
			capacidadActual = capacidadActual - servir;
			System.out.println("Aún hay en la cafetera para " + capacidadActual + " tazas.");
		}
		return capacidadActual;
	}

	public int vaciarCafetera() {
		capacidadActual = 0;

		System.out.println("Se ha vaciado la cafetera exitosamente.");

		return capacidadActual;
	}

	public int agregarCafe(int agregar) {
		// OPCIÓN DE AÑADIR MAS CAFE A LA CAPACIDAD ACTUAL
		capacidadActual = capacidadActual + agregar;
		if (capacidadActual >= capacidadMaxima) {
			// COMPROBAMOS SI LA PERSONA HA AÑADIDO LO CORRECTO Y SI SOBRA HASTA NUNQUI
			agregar = capacidadActual - capacidadMaxima;
			System.out.println("Has hechado " + agregar + " de más.");
			capacidadActual = capacidadMaxima;
		} else {
			System.out.println("La cafetera ha sido llenada exitosamente . . .");
		}
		return capacidadActual;
	}
}
