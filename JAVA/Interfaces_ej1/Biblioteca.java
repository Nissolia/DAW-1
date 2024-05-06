package Interfaces_ej1;

public abstract class Biblioteca {
	/*
	 * Escribe un programa para una biblioteca que contenga libros, revistas y
	 * comics. Las características comunes que se almacenan tanto para las revistas
	 * como para los libros y comics son; el código, el título, y el año de
	 * publicación. Estas tres características se pasan por parámetro en el momento
	 * de crear los objetos.
	 */
// Atributos
	private static int codigo = 0;
	private String titulo;
	private String anioPublicacion;

	// Constructores
	public Biblioteca(int codigo, String titulo, String anioPublicacion) {
		codigo++;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}

	// Getter y setter
	public String getCodigo() {
		return titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

// Métodos
	@Override
	public abstract String toString();

}
