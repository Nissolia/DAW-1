package tareaClases_2;

public class Persona {
	// atributo estatico
	private static int totalPersonas = 0;
	// atributos
	private int id;
	private String nombre;
	private String dni;

	/* constructores */
	public Persona() {
		totalPersonas++;
		this.id = totalPersonas;
	}

	public Persona(String nombre, String dni) {
		totalPersonas++;
		// para que se auto incremente
		this.id = totalPersonas;
		this.nombre = nombre;
		if (validarDNI(dni) == true) {
			this.dni = dni;
		} else {
			throw new DNINoValidoException("El DNI no es válido.");
		}
	}

	/* getter y setter */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (validarDNI(dni) == true) {
			this.dni = dni;
		} else {
			throw new DNINoValidoException("El DNI no es válido.");
		}
	}

	// MÉTODOS

	/***************/
	/* VALIDAR DNI */
	/***************/
	private boolean validarDNI(String dni) {

		boolean salida = false;
		String letras = "TRWAGMYFPDXNJZSQVHLCKE";

		// Verificar que la longitud del DNI sea 9 (8 dígitos + 1 letra)
		if (dni.length() != 9) {
			dni = "00000000X"; // Asignar valor por defecto si la longitud no es correcta
			throw new DNINoValidoException("El número de carácteres es inválido.");
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
				throw new DNINoValidoException("Este DNI no existe.");
			}
		}
		return salida;
	}

	/**
	 * Equals where dni was the same
	 * 
	 * @param object
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		boolean salir = false;
		// Verificar si obj es una instancia de Persona
		if (obj != null) {
			salir = true;
		} else if (!(obj instanceof Persona)) {
			salir = false;
		} else {
			Persona aux = (Persona) obj;
			if (this.dni.equals(aux.getDni())) {
				salir = true;
			}
		}
		return salir;
	}

	/**
	 * Static method buscamos la misma persona
	 * 
	 * @param persona array
	 * @param persona
	 * @return boolean
	 */

	public static boolean busqueda(Persona lista[], Persona p) {
		boolean encontrado = false;
		if (lista.length > 0 && p != null) {
			for (int i = 0; i < lista.length; i++) {
				p.equals(lista[i]);
			}
		}

		return encontrado;
	}

}
