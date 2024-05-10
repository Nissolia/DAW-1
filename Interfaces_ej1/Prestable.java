package Interfaces_ej1;

public interface Prestable {
	/*
	 * También tienen un método que devuelve el año de publicación, y otro el
	 * código. Para prevenir posibles cambios en el programa se tiene que
	 * implementar una interfaz Prestable con los métodos prestar(), devolver() y el
	 * atributo prestado. La clase Libro implementa esta interfaz
	 */
	boolean prestado = false;

	void prestar();

	void devolver();

}
