package Repaso_ej1;

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
		String[] nombres = { "Juan", "Ana", "Luis", "Maria", "Pedro", "Lucia" };
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

	// Métodos
	/*
	 * listadoCompleto() donde se detallen todos los detalles de todos los
	 * corredores;
	 */
	public void listadoCompleto() {

	}

	/*
	 * mostrarGanador() donde mostrará los datos sólo del ganador;
	 */
	public void mostrarGanador() {

	}

	/*
	 * metodo: carrera // en este metodo generamos la carrera aleatoria en la que
	 * veremos que atleta gana
	 */

	public int carrera(Atleta at1, Atleta at2, Atleta at3) {// metemos los objetos por parametros
		int r1 = 0, r2 = 0, r3 = 0;
		int ganador = 0;

		do {
			// comprobamos la carrera de las personas que están en ella
			r1 += Math.random() * 5;
			r2 += Math.random() * 5;
			r3 += Math.random() * 5;
		} while (r1 <= CARRERA || r2 <= CARRERA || r3 <= CARRERA);
		// confirmamos que uno de ellos ha conseguido ganar la carrera y se muestra por
		
		// pantalla
		System.out.print(at1.getDorsal() + " | ");
		for (int i = 0; i < r1; i++) {
			System.out.print("#");
		}
		System.out.print("\n" + at2.getDorsal() + " | ");
		for (int i = 0; i < r2; i++) {
			System.out.print("#");
		}
		System.out.print("\n" + at3.getDorsal() + " | ");
		for (int i = 0; i < r3; i++) {
			System.out.print("#");
		}
		
return ganador;
	}
	
	  @Override
	    public String toString() {
	        return "Atleta " +
	                ", dorsal: " + dorsal +
	                ", nombre: " + nombre +
	                ", pais: " + pais +
	                ", tiempo: " + tiempo +
	                '}';
	    }
	}


