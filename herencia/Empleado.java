package herencia;

public class Empleado {

	/* ATRIBUTOS */
	public String nombre;
	public int edad;
	public int salario;
	public int plus = 300;

	/* CONSTRUCTORES */
	public Empleado(String nombre, int edad, int salario, int plus) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.plus = plus;
	}

	/* GETTERS AND SETTERS */
	String getNombre() {
		return nombre;
	}

		// YA CAMBIADO
	void setNombre(String nombre) {
		if ((nombre.charAt(0) != 'p') && (nombre.charAt(0) != 'P')) {
			this.nombre = nombre;
		} else {
			System.out.println("No se puede cambiar el nombre.");
		}

	}

	int getEdad() {
		return edad;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}

	int getSalario() {
		return salario;
	}

	void setSalario(int salario) {
		this.salario = salario;
	}
	/* MÉTODOS */

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", plus=" + plus + "]";
	}

}
