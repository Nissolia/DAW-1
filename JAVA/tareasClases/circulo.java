package tareasClases;

import java.util.Scanner;

public class circulo {

	public static void main(String[] args) {
		/*************/
		/* VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int masJoven = 0;
		String nombre;
		/*******************/
		/* PRIMERA PERSONA */
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		/************************/
		/* LLAMADA DE FUNCIONES */
		System.out.print("Dime el nombre de la primera persona: ");
		nombre = teclado.nextLine();
		p1.setNombre(nombre);
		System.out.print("Dime la edad de la primera persona: ");
		int edad = teclado.nextInt();
		p1.setEdad(edad);
		teclado.nextLine();
		System.out.print("Dime el genero de la primera persona: ");
		System.out.print(" hombre, mujer o helicoptero ");
		String sexo = teclado.next();
		p1.setSexo(sexo);
		/*******************/
		/* SEGUNDA PERSONA */
		nombre = "";
		/************************/
		/* LLAMADA DE FUNCIONES */
		System.out.print("Dime el nombre de la segunda persona: ");
		nombre = teclado.nextLine();
		p2.setNombre(nombre);
		teclado.nextLine();
		System.out.print("Dime la edad de la segunda persona: ");
		edad = teclado.nextInt();

		p2.setEdad(edad);
		teclado.nextLine();
		System.out.print("Dime el genero de la segunda persona: ");
		System.out.print(" hombre, mujer o helicoptero ");
		sexo = teclado.next();
		p2.setSexo(sexo);
		/*******************/
		/* TERCERA PERSONA */
		nombre = "";
		/************************/
		/* LLAMADA DE FUNCIONES */
		System.out.print("Dime el nombre de la tercera persona: ");
		nombre = teclado.nextLine();
		p3.setNombre(nombre);
		teclado.nextLine();
		System.out.print("Dime la edad de la tercera persona: ");
		edad = teclado.nextInt();
		p3.setEdad(edad);
		teclado.nextLine();
		System.out.print("Dime el genero de la tercera persona: ");
		System.out.print(" hombre, mujer o helicoptero ");
		sexo = teclado.next();
		p3.setSexo(sexo);

		System.out.print("-------------------------------------------");
		
		masJoven = (p1.getEdad());
		String joven = "";
		/* METER QUE LA GENTE NO PUEDA METER DATOS */
		if ((p1.getSexo()).equals("mujer")) {
			if ((p1.getEdad()) <= masJoven) {
				joven = "primera";
			}

			masJoven = p1.getEdad();
			if ((p2.getSexo()).equals("mujer")) {
				if ((p1.getEdad()) <= masJoven) {
					joven = "segunda";
				}
			}
			if ((p3.getSexo()).equals("mujer")) {
				if ((p1.getEdad()) <= masJoven) {
					joven = "tercera";
				}
			}
		}
		/* RESUELTO */
		System.out.print("La mujer más joven es la " + joven);

		/* SCANNER CERRADO */
		teclado.close();
	}

}
