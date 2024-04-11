package tareasPoli_1;

public class Empleado1 {

	// Atributos
	private String nombre;
	public int edad;
	public int salario;
	public int plus = 300;

	// Constructor
	Empleado1(String nombre, int edad, int salario, int plus) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.plus = plus;
	}
	
	Empleado1(){}


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
	/**
	 * @params objeto 
	 * 
	 * @return true si son iguales
	 * @return false si son diferentes
	 */
	@Override
	public boolean equals(Object obj) {
		boolean salida = false;
		Empleado1 otroE = ((Empleado1) obj);
		if (this.nombre.equals(otroE.getNombre()) && this.salario == otroE.getSalario()) {
			salida = true;
		} 
		
		return salida;
	}
	

}
