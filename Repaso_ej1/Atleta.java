package Repaso_ej1;

public class Atleta {
	/*
	 * Desarrolla un programa para gestionar la competición de atletismo de la FESAC
	 * OLIMPIADAS. La Clase Atleta (separada de la Main y esas cosas) tendrá los
	 * atributos: dorsal (random 5 dígitos), nombre, país, tiempo (hh:MM:ss). Además
	 * tendrá los métodos Constructor() listadoCompleto() donde se detallen todos
	 * los detalles de todos los corredores; mostrarGanador() donde mostrará los
	 * datos sólo del ganador; Carrera() que simula una carrera de los diferentes
	 * participantes. #13243 |######################### #23255 |##################
	 * #43435 |############################## (30)
	 */
		
	// Atributos
	int dorsal;
	String nombre;
	String pais;
	String tiempo = "hh:mm:ss";

	//Constructores
	public Atleta(int dorsal, String nombre, String pais, String tiempo) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.pais = pais;
		this.tiempo = tiempo;
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

	public void listadoCompleto() {

	}

	public void mostrarGanador() {

	}

	/*
	 * 45 segundos a 1 minuto y 15 segundos en correr 300 metros
	 * 4 a 6.7 metros por segundo
	 */
	public void carrera(Atleta at1, Atleta at2,Atleta at3) {// metemos los objetos por parametros
		int rand = 0;
		
	}
}
