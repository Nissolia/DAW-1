package Ficheros_ej1;

import java.util.Scanner;

public class FIchero_ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Realiza un programa en el que muestres un menú que te permita 3 opciones: 1.
		 * creación de un fichero de texto (con el nombre que tú quieras) en el que
		 * indiques en cada linea: Tu Nombre. Tus Apellidos. Tu Ciudad de Nacimiento. 2.
		 * Mostrar por pantalla el contenido del último fichero de texto creado. 3.
		 * Mostrar por pantalla el contenido de un fichero de texto. Que se haya creado
		 * para ello le pasarás el nombre de este. 3. Salir del Programa.
		 */
		int elecc = 0;
		String nombretxt = "";
		String cadenatxt[] = new String[3];
		do {

			System.out.println("· · · · · Menú · · · · · · · · · ·\n1) Creación de fichero de texto"
					+ "o\n2) Mostrar por pantalla contenido del ultimo fichero creado"
					+ "\n3) Mostrar por pantalla el contenido de un fichero de texto por nombre"
					+ "\n4) Salir del programa");
			try {
				elecc = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Pon un número...\n");
			}

			sc.nextLine(); // limpieza de buffer
			// menu
			switch (elecc) {
			case 1: {
				System.out.println("Creación de fichero de texto, ponle un nombre al \'txt\'");

				try {
					nombretxt = sc.nextLine() + ".txt";
					System.out.println(nombretxt);
				} catch (Exception e) {
					System.out.println("Vaya liada...");
				}
				System.out.println(
						"Indica en la primera linea tu nombre, en la segunda tus apellidos y en la tercera tu ciudad de nacimiento");

				try {
					cadenatxt[0] = sc.nextLine();
					cadenatxt[1] = sc.nextLine();
					cadenatxt[2] = sc.nextLine();
				} catch (Exception e) {
					System.out.println("No se como pero la has liado con una cadena de texto...");
				}
				break;
			}
			case 2: {
				System.out.println("Mostrar contenido del último fichero creado");
				break;
			}
			case 3: {
				System.out.println("Mostrar por pantalla el contenido de un fichero por nombre");
				break;
			}
			case 4: {
				System.out.println("Saliendo del programa...");
				break;
			}
			default:
				System.out.println("Tienes un menú de números, escribe el que quieras.\n");
				break;
			}
		} while (elecc != 4);
	}// fin main

}// fin clase
