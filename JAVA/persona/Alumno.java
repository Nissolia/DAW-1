package persona;

public class Alumno extends Persona {

	// CONSTRUCTORES DENTRO DEBES DE PONER SUPER();
	/*************/
	/* ATRIBUTOS */
	/*************/
	private int codigo;
	int curso;

	// CONSTRUCTORES
	public Alumno(String nombre, String ape1, String ape2, int edad, int codigo, int curso) {
		super(nombre, ape1, ape2, edad);
		this.codigo = codigo;
		this.curso = curso;

	}

	// GETTERS AND SETTERS
	public int getCodigo() {
		return codigo;
	}

	public int getCurso() {
		return curso;
	}
}
