package Repaso_ej1;

import java.util.Iterator;

public class Atleta {
	/*
	 * Desarrolla un programa para gestionar la competición de atletismo de la FESAC
	 * OLIMPIADAS. La Clase Atleta (separada de la Main y esas cosas) tendrá los
	 * atributos: dorsal (random 5 dígitos), nombre, país, tiempo (hh:MM:ss). Además
	 * tendrá los métodos Constructor()
	 */

	// Atributos
	final int CARRERA = 30;
	int dorsal;
	String nombre;
	String pais;
	String tiempo = "hh:mm:ss";
	int podio = 0;

	// Constructores
	public Atleta(int dorsal, String nombre, String pais, String tiempo) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.pais = pais;
		this.tiempo = tiempo;
	}

	public Atleta() {
		// Listas de nombres, países y tiempos ficticios
		String[] nombres = { "Pepa", "Ana", "Luis", "Maria", "Pedro", "Lucia" };
		String[] paises = { "España", "México", "Argentina", "Colombia", "Chile", "Perú" };
		String[] tiempos = { "10:23", "11:47", "09:15", "12:30", "08:59", "10:05" };

		// Seleccionar elementos aleatorios de las listas usando Math.random()
		nombre = nombres[(int) (Math.random() * nombres.length)];
		pais = paises[(int) (Math.random() * paises.length)];
		tiempo = tiempos[(int) (Math.random() * tiempos.length)];

		// Generar un dorsal aleatorio entre 1 y 1000 usando Math.random()
		dorsal = (int) (Math.random() * 1000) + 1;
	}

	// Getter y setters
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	/***********************/
	/******* MÉTODOS *******/
	/***********************/

	/**
	 * Muestra un listado completo de los atletas proporcionados en el array.
	 *
	 * @param at un array de objetos {@code Atleta} que se mostrarán en el listado.
	 * 
	 *           <p>
	 *           Este método imprime en la consola una lista de todos los atletas
	 *           contenidos en el array proporcionado. Cada atleta se imprime
	 *           utilizando el método {@code toString()} de la clase {@code Atleta}.
	 *           </p>
	 */
	public void listadoCompleto(Atleta at[]) {
		System.out.println("Disponemos de los siguientes atletas:");
		for (int j = 0; j < at.length; j++) {
			System.out.println(at[j]);
		}
	}

	/**
	 * Muestra el ganador de una carrera entre los atletas proporcionados en el
	 * array.
	 *
	 * @param at un array de objetos {@code Atleta} que participaron en la carrera.
	 * 
	 *           <p>
	 *           Este método llama al método {@code carrera(Atleta[])} para
	 *           determinar el ganador de la carrera y luego imprime el atleta
	 *           ganador en la consola. El ganador se determina según el índice
	 *           devuelto por el método {@code carrera(Atleta[])}. Si el índice del
	 *           ganador es válido, se imprime la información del atleta
	 *           correspondiente; de lo contrario, se muestra un mensaje de error
	 *           indicando que el índice del ganador no es válido.
	 *           </p>
	 */
	public void mostrarGanador(Atleta at[]) {
		// Llama al método carrera que toma un array de Atleta y devuelve el índice del
		// ganador
		int i = carrera(at);

		// Imprime el ganador basado en el índice devuelto por el método carrera
		if (i >= 0 && i < at.length) {
			System.out.println("Ha ganado el siguiente corredor: \n" + at[i]);
		} else {
			System.out.println("Error: índice de ganador no válido");
		}
	}

	/**
	 * Realiza una carrera entre los atletas proporcionados en el array y determina
	 * el ganador.
	 *
	 * @param at un array de objetos {@code Atleta} que participarán en la carrera.
	 * @return el índice del atleta ganador en el array proporcionado.
	 * 
	 *         <p>
	 *         El método simula una carrera donde cada atleta avanza una distancia
	 *         aleatoria en cada iteración del bucle. La carrera continúa hasta que
	 *         al menos un atleta alcanza o supera la distancia definida por la
	 *         constante {@code CARRERA}.
	 *         </p>
	 * 
	 *         <p>
	 *         Durante la carrera, se actualizan y muestran las distancias
	 *         recorridas por cada atleta. El ganador se determina como el primer
	 *         atleta que alcanza o supera la distancia de {@code CARRERA}. Se
	 *         imprimen las distancias recorridas por cada atleta en la consola
	 *         utilizando el método {@code getDorsal()} de cada objeto
	 *         {@code Atleta}.
	 *         </p>
	 */
	public int carrera(Atleta at[]) {// metemos los objetos por parametros
		int[] r = new int[at.length]; // Crear un array para las distancias de cada atleta
		int ganador = 0;
		final int CARRERA = 30; // Define la distancia para ganar la carrera

		do {
			// Actualizar la distancia de cada atleta
			for (int i = 0; i < r.length; i++) {
				r[i] += Math.random() * 5;
			}

			// Verificar si alguno ha ganado la carrera
			for (int i = 0; i < r.length; i++) {
				if (r[i] >= CARRERA) {
					ganador = i;
					break;
				}
			}
		} while (r[ganador] < CARRERA);

		// Mostrar resultados de la carrera
		for (int i = 0; i < at.length; i++) {
			System.out.print(at[i].getDorsal() + " | ");
			for (int j = 0; j < r[i]; j++) {
				System.out.print("#");
			}
			System.out.println(); // Salto de línea después de cada atleta
		}

		System.out.println("\n");

		// Retornar el índice del ganador
		return ganador;
	}

	/**
	 * Devuelve una representación en formato de cadena del objeto {@code Atleta}.
	 *
	 * @return una cadena que contiene el dorsal, nombre, país y tiempo del atleta.
	 * 
	 *         <p>
	 *         Este método sobrescribe el método {@code toString()} de la clase
	 *         {@code Object} para proporcionar una representación legible del
	 *         objeto {@code Atleta}. La cadena devuelta incluye el dorsal, nombre,
	 *         país y tiempo del atleta, formateados de manera clara y concisa.
	 *         </p>
	 */
	@Override
	public String toString() {
		return "Dorsal: " + dorsal + ", nombre: " + nombre + ", pais: " + pais + ", tiempo: " + tiempo;
	}
}
