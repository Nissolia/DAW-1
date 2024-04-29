package BoletinCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		/*
		 * Crear un programa que use ArrayList que permita añadir, usando la clase perro
		 * resuelta en el ejercicio de interfaces, objetos tipo Perro. El programa debe
		 * permitir mostrar un menú donde se pueda agregar uno, buscar un uno por el
		 * nombre, modificar los datos, eliminarlo e insertar uno en una posición dada.
		 */
		Scanner sc = new Scanner(System.in);
		// insertamos arraylist
		ArrayList<Ej2_Perro> perros = new ArrayList<>(); 
		int elecc = 0;
		
		// empezamos a codificar
		System.out.println("__________________ MENÚ");
		System.out.println("1) Agregar un perro");
		System.out.println("2) Buscar por el nombre");
		System.out.println("3) Modificar los datos");
		System.out.println("4) Elimitar un perro");
		System.out.println("5) Cambiar uno por otro");
		switch (elecc) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;

		default:
			break;
		}

		Ej2_Perro perro1 = new Ej2_Perro(null, null, 0);
		sc.close();
	}

}
