package persona;

public class Profesor {
	// ATRIBUTOS
	private int id;
	private String departamento;

	// CONSTRUCTORES
	public Profesor(String nombre, String ape1, String ape2, int edad, int id, String departamento) {
		super();
		this.id = id;
		this.departamento = departamento;
	}

	// GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public String getDepartamento() {
		return departamento;
	}
}
