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
			String email) {
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
	public void introducirDNI(String dni) {
		boolean salida = false;
		String letras = "TRWAGMYFPDXNJZSQVHLCKE";

		// Verificar que la longitud del DNI sea 9 (8 dígitos + 1 letra)
		if (dni.length() != 9) {
			dni = "00000000X"; // Asignar valor por defecto si la longitud no es correcta
		} else {
			// Obtener la parte numérica del DNI como entero
			int parteNumerica = Integer.parseInt(dni.substring(0, 8));

			// Obtener la parte de la letra del DNI
			char parteLetra = dni.charAt(8);

			// Calcular el módulo de la parte numérica
			int mod = parteNumerica % 23;

			// Verificar si la letra proporcionada coincide con la letra esperada
			if (letras.charAt(mod) == parteLetra) {
				salida = true;
				this.dni = dni; // Asignar el DNI si es válido
			} else {
				dni = "00000000X"; // Asignar valor por defecto si la letra no coincide
			}
		}
	}

	/* Introduciendo los números y la letra a parte */
	public void introducirDni(String dni, char letra) {
		boolean salida = false;
		String letras = "TRWAGMYFPDXNJZSQVHLCKE";
		// devuelve una parte de la cadena
		int parteNumerica = Integer.parseInt(dni.substring(0, 8));

		char parteLetra = dni.charAt(8);

		int mod = parteNumerica % 23;

		if (letras.charAt(mod) == parteLetra) {
			salida = true;
			this.dni = dni;
		} else {
			dni = "00000000X";
		}
	}
	// versionarlo

	@Override
	public abstract String toString();

}
