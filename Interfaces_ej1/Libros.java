package Interfaces_ej1;

public class Libros extends Biblioteca implements Prestable {

	/*
	 * Los libros y los comics tienen además un atributo prestado. Cuando se
	 * crean,no están prestados.
	 * 
	 * Las revistas tienen un número. En el momento de crear las revistas se pasa el
	 * número por parámetro. Todos deben tener (aparte de los constructores) un
	 * método toString() que devuelve el valor de todos los atributos en una cadena
	 * de caracteres.
	 * 
	 * También tienen un método que devuelve el año de publicación, y otro el
	 * código. Para prevenir posibles cambios en el programa se tiene que
	 * implementar una interfaz Prestable con los métodos prestar(), devolver() y el
	 * atributo prestado. La clase Libro implementa esta interfaz
	 */
	protected static boolean prestado = false;

// Constructor
	public Libros(int codigo, String titulo, String anioPublicacion, boolean prestado) {
		super(codigo, titulo, anioPublicacion);
		Libros.prestado = prestado;
	}
// Getter and setters

	// Métodos
	@Override
	public String toString() {
		return "Libros [prestado=" + prestado + ", getCodigo()=" + getCodigo() + ", getTitulo()=" + getTitulo()
				+ ", getAnioPublicacion()=" + getAnioPublicacion() + "]";
	}

	@Override
	public void prestar() {
		if (prestado == false) {
			System.out.println("Este libro no ha sido prestado.");
		} else {
			System.out.println("Este libro ha sido prestado.");
		}

	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub

	}

}
