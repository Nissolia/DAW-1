package Repaso_02;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;

public class MainFile {

	/*
	 * Métemos la ruta que usaremos, para no tener que estar escribiendola
	 * constantemente y así solo tener que añadir "\\" + la variable deseada y de
	 * esta forma no llenamos el código de estas llamadas reduciendo asi la densidad
	 * del código
	 */
	final static String rutaArchivos = "C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos";

	/*************************************
	 * MAIN
	 *************************************/

	public static void main(String[] args) {

		// variables que usaremos

		int elecc = 0; // la incializamos en -1 por si nos da error
		Scanner sc = new Scanner(System.in);
		String nombreTxt = ""; // cuando busquemos el txt correspondiente lo buscaremos con este string
		// Código
		do {
			System.out.println("................................. MENÚ" + "\n 1)Leer archivos."
					+ "\n 2)Sobreescribir un archivo existente." + "\n 3)Escribir al final del archivo."
					+ "\n-1)Salir");

			// Try-catch para no dejar la posibilidad de que la persona meta un string
			try {
				elecc = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Las opciones están en números por algo...\n");
				sc.nextLine(); // limpiamos el buffer del Scanner
				elecc = 0; // reseteamos elecc para que no nos de problema y no se vuelva un bucle infinito
			}

			switch (elecc) {
			case 1:
				System.out.println("Los archivos que tenemos son los siguientes:");
				// usamos el metodo creado para enseñar que ficheros tenemos en la carpeta
				mostrarListaArchivos();
				sc.nextLine(); // limpiamos buffer por precaucion
				System.out.println("\n¿Qué archivo quieres leer?");
				nombreTxt = sc.nextLine();
				// leer archivo
				try {
					FileReader lectura = new FileReader(rutaArchivos + "\\" + nombreTxt);
					// esto salia recomendado asi que lo dejamos
					@SuppressWarnings("resource")
					BufferedReader br = new BufferedReader(lectura);
					String mensajeLeido = ""; // creamos este para
					int contador = 0; // para mostrar si el fichero esta vacío o lleno
					/*
					 * usamos en while para poder pasar por el fichero completo el cual se va a
					 * mostrar, añadimos un contador para controlar las filas que existen
					 */
					while ((mensajeLeido = br.readLine()) != null) {
						contador++;
						System.out.println(mensajeLeido);
					}
					/*
					 * el contador lo usaremos para decir que no hay texto en el fichero y también
					 * para que nos muestre un texto final en el que nos dice que hemos terminado de
					 * leer el fichero
					 */
					if (contador == 0) {
						System.out.println("No hay texto que mostrar en el fichero: " + nombreTxt);
					} else {
						System.out.println("Fin de lectura del fichero: " + nombreTxt);
					}
					System.out.println("\n");// creamos algo de espacio por pura estética

				} catch (Exception e) {
					// creamos este exception por si no pone un archivo que exista
					System.out.println("Has añadido una ruta inválida.");
				}

				break;
			case 2:// sobreescribir archivo

				break;
			case 3:// escribir al final

				break;
			case -1:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Has añadido una opción incorrecta.... \nRedirigiendo al menú...\n");
				break;
			}

		} while (elecc != -1); // Este bucle hará que se ejecute mientras sea diferente a -1
		sc.close();
	} // fin del main

	/*
	 * MÉTODO: mostrarListaArchivos();
	 * 
	 * Creamos este método para poder llamar a la lista cada vez que el usuario
	 * quiera ver que archivos tenemos en la ruta que hemos añadido al inicio del
	 * código
	 */

	private static void mostrarListaArchivos() {
		// listado de archivos disponibles en la carpeta
		File archivo = new File(rutaArchivos);
		String[] nombresArchivos = archivo.list();
		/*
		 * usamos un array para poder ver el listado que nos encontramos en la carpeta
		 */

		for (int i = 0; i < nombresArchivos.length; i++) {
			/*
			 * confirmamos la lectura de la lista de archivos y los mostramos por pantalla
			 */
			System.out.println(nombresArchivos[i]);
		}

	}
}
