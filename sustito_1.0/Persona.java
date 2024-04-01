package sustito;

public abstract class Persona {
	
	private String nombre;
	private String ape1;
	private String ape2;
	private String dni;
	private Fecha fechanacimiento;
	private int telefono;
	private String email;
	/*****************/
	/* CONSTRUCTORES */
	/*****************/
	public static final int anioActual = 2024; 
	/********************/
	/* GETTER Y SETTERS */
	/********************/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Fecha getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Fecha fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/***********/
	/* MÉTODOS */
	/***********/
	/*
	 * Devolverá true si es mayor de edad, false en caso contrario. Investigue como
	 * nuestro programa puede saber en que año estamos sin pedirlo por teclado.
	 */
	public Boolean mayorEdad() {
		Boolean bandera = false;
		int edad = fechanacimiento.getAnio() - anioActual;
		bandera = (edad >= 18) ? true : false;
		return bandera;
	}

	/*
	 * Comprobará si el DNI es valido y si es valido lo guardará sino pondrá el por
	 * defecto 000 000 00X
	 */
	public void introducirDNI(String DNI) {

	}

	/*
	 * Comprobará si el DNI es valido y si es valido lo guardará sino pondrá el por
	 * defecto 00000000X
	 */
	public void introducirDNI(String DNI, char letra) {

	}

	@Override
	public String toString() {
		return "Persona: " + nombre + " " + ape1 + " " + ape2 + ", " + dni + ", Fecha: " + fechanacimiento + ", "
				+ telefono + ", " + email;
	}

}
