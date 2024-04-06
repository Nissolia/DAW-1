package persona;

public class Persona {
	// ATRIBUTOS
	private String nombre;
	private String ape1;
	String ape2;
	int edad;

	// CONSTRUCTORES
	public Persona(String nombre, String ape1, String ape2, int edad) {
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.edad = edad;
	}

	public Persona() {

	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public int getEdad() {
		return edad;
	}
}
