package BoletinCollection;

public class Ej2_Perro {
	// atributos estáticos
	private static int id = 0;
	//atributos
	private String raza;
	private String nombre;
	private int edad;
	/*****************/
	/* CONSTRUCTORES */
	public Ej2_Perro(String raza, String nombre, int edad) {
		super();
		id++;
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
	}
	/***********************/
	/* GETTERS AND SETTERS */
	// No es necesario ninguno ya que no vamos a modificarlo desde ninguno de ellos
	/* MÉTODOS */
	public void mostrarPerros() {
		System.out.println("ID: " + id + ", Raza: " + raza + ", Nombre: " + nombre + ", Edad: " + edad);
	}

}
