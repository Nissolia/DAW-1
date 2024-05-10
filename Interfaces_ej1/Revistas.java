package Interfaces_ej1;

public class Revistas extends Biblioteca {

	/*
	 * Los libros y los comics tienen además un atributo prestado. Cuando se
	 * crean,no están prestados.
	 * 
	 * Las revistas tienen un número. En el momento de crear las revistas se pasa el
	 * número por parámetro. Todos deben tener (aparte de los constructores) un
	 * método toString() que devuelve el valor de todos los atributos en una cadena
	 * de caracteres.
	 * 
	 * También tienen un método que devuelve el año de publicación, y
	 * otro el código. Para prevenir posibles cambios en el programa se tiene que
	 * implementar una interfaz Prestable con los métodos prestar(), devolver() y el
	 * atributo prestado. La clase Libro implementa esta interfaz
	 */
	private int numero;

// Constructor
	public Revistas(int codigo, String titulo, String anioPublicacion, int numero) {
		super(codigo, titulo, anioPublicacion);
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Comics [numero=" + numero + ", getCodigo()=" + getCodigo() + ", getTitulo()=" + getTitulo()
				+ ", getAnioPublicacion()=" + getAnioPublicacion() + "]";
	}

}
