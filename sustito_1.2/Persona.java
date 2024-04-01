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
	public Persona(String nombre, String ape1, String ape2, String dni, int anio, int mes, int dia, int telefono,
			String email){
		super();
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.dni = dni;
		this.fechanacimiento = new Fecha(anio, mes, dia);
		this.telefono = telefono;
		this.email = email;
	}

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
		return (((fechanacimiento.getAnio() - fechanacimiento.getACTUAL()) >= 18) ? true : false);
	}

	/*
	 * Comprobará si el DNI es valido y si es valido lo guardará sino pondrá el por
	 * defecto 0000 0000X
	 */
	public void introducirDNI(String DNI) {
		boolean digito = true;
		if (dni.length() != 9) {
			dni = "00000000X";
		} else {
			// Verificar si cada carácter de la cadena dni es un dígito
			for ((int i = 0; i < dni.length()-1); i++) {
				if (!Character.isDigit(dni.charAt(i))) {
					digito = false;
				}
			}
			if (digito == true) {
				System.out.println(dni); // Imprimir DNI y letra
			}
		}
	}

	/*
	 * Comprobará si el DNI es valido y si es valido lo guardará sino pondrá el por
	 * defecto 0000 0000X
	 */
	public void introducirDNI(String dni, char letra) {
		boolean digito = true;

		if (dni.length() != 8) {
			dni = "00000000";
			letra = 'X';
		} else {
			// Verificar si cada carácter de la cadena dni es un dígito
			for (int i = 0; i < dni.length(); i++) {
				if (!Character.isDigit(dni.charAt(i))) {
					digito = false;
				}
			}
			if (digito == true) {
				letra = Character.toUpperCase(letra);
				System.out.println(dni + letra); // Imprimir DNI y letra
			}
		}
	}

	@Override
	public String toString() {
		return "Persona: " + nombre + " " + ape1 + " " + ape2 + ", " + dni + ", Fecha: " + fechanacimiento + ", "
				+ telefono + ", " + email;
	}

}
