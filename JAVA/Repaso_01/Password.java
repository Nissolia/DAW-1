package Repaso_01;

public class Password {
	// atributos
	Integer longitud;
	String contrasenia;

	// constructor
	public Password() {
		longitud = 8;
	}

	public Password(Integer longitud) {
		this.longitud = longitud;
		contrasenia = generarPassword();
	}

	// getter y setters
	public Integer getLongitud() {
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	// métodos
	private String generarPassword() {
		String minusculas = "abcdefghijklmnopqrstuvwxyz";
		String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String simbolos = "_-*+";
		String numeros = "0123456789";
		int cont =0;
		
		
		
		return null;
	}
}
