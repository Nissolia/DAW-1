package ActividadesPoli;

public class Empleado {

	// Atributos
	private String nombre;
	public int edad;
	public int salario;
	public int plus = 300;

	// Constructor
	Empleado(String nombre, int edad, int salario, int plus) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.plus = plus;
	}
	
	Empleado(){}


	// Get and set
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getSalario() {
		return salario;
	}

	public int getPlus() {
		return plus;
	}

	public void setNombre(String nombre) {
		if (nombre.charAt(0) != 'p' && nombre.charAt(0) != 'P') {
			this.nombre = nombre;
		}else {
			System.out.println("No se ha podido");
		}
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", plus=" + plus + "]";
	}
	
	

}
