package Repaso_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Archivos_metodos {

	final static String rutaArchivos = "C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos";

	public static void main(String[] args) {
		int eleccion = 0;
		Scanner sc = new Scanner(System.in);

		do {
			mostrarMenu();
			eleccion = sc.nextInt();
			sc.nextLine(); // Limpiar el buffer

			switch (eleccion) {
			case 1:
				leerArchivo();
				break;
			case 2:
				sobreescribirArchivo();
				break;
			case 3:
				escribirAlFinal();
				break;
			case -1:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción incorrecta. Por favor, elige una opción válida.");
				break;
			}

		} while (eleccion != -1);

		sc.close();
	}

	/**
	 * Muestra el menú de opciones disponibles para el usuario. El menú incluye las
	 * siguientes opciones:
	 * <ul>
	 * <li>1) Leer archivos.</li>
	 * <li>2) Sobreescribir un archivo existente.</li>
	 * <li>3) Escribir al final del archivo.</li>
	 * <li>-1) Salir.</li>
	 * </ul>
	 * El usuario debe elegir una de estas opciones ingresando el número
	 * correspondiente.
	 */
	private static void mostrarMenu() {
		System.out.println("................................. MENÚ" + "\n 1) Leer archivos."
				+ "\n 2) Sobreescribir un archivo existente." + "\n 3) Escribir al final del archivo." + "\n-1) Salir");
		System.out.print("Elige una opción: ");
	}

	/**
	 * Lee el contenido de un archivo seleccionado por el usuario. Muestra una lista
	 * de archivos disponibles y solicita al usuario que elija el archivo a leer.
	 * Luego lee y muestra el contenido del archivo línea por línea hasta alcanzar
	 * el final. Si se produce algún error durante la lectura del archivo, se
	 * imprime un mensaje de error.
	 */
	private static void leerArchivo() {
		System.out.println("Los archivos disponibles son:");
		mostrarListaArchivos();

		Scanner sc = new Scanner(System.in);
		System.out.print("¿Qué archivo quieres leer? ");
		String nombreArchivo = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivos + "\\" + nombreArchivo))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			System.out.println("Fin de lectura del archivo: " + nombreArchivo);
		} catch (Exception e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
		sc.close();
	}

	/**
	 * Sobrescribe el contenido de un archivo existente seleccionado por el usuario.
	 * Muestra una lista de archivos disponibles y solicita al usuario que elija el
	 * archivo a sobrescribir. Luego solicita al usuario que introduzca el texto que
	 * desea sobrescribir en el archivo. Sobrescribe el contenido del archivo con el
	 * texto proporcionado por el usuario. Si se produce algún error durante la
	 * operación de sobrescritura, se imprime un mensaje de error.
	 */
	private static void sobreescribirArchivo() {
		System.out.println("Los archivos disponibles son:");
		mostrarListaArchivos();

		Scanner sc = new Scanner(System.in);
		System.out.print("¿Qué archivo quieres sobreescribir? ");
		String nombreArchivo = sc.nextLine();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivos + "\\" + nombreArchivo))) {
			System.out.print("Introduce el texto a sobreescribir: ");
			String texto = sc.nextLine();
			bw.write(texto);
			System.out.println("Archivo sobrescrito exitosamente.");
		} catch (Exception e) {
			System.out.println("Error al sobrescribir el archivo: " + e.getMessage());
		}
		sc.close();
	}

	/**
	 * Escribe texto al final de un archivo existente seleccionado por el usuario.
	 * Muestra una lista de archivos disponibles y solicita al usuario que elija el
	 * archivo donde desea escribir. Luego, solicita al usuario que introduzca el
	 * texto que desea agregar al final del archivo. Agrega el texto proporcionado
	 * por el usuario al final del archivo seleccionado. Si se produce algún error
	 * durante la operación de escritura, se imprime un mensaje de error.
	 */

	private static void escribirAlFinal() {
		System.out.println("Los archivos disponibles son:");
		mostrarListaArchivos();

		Scanner sc = new Scanner(System.in);
		System.out.print("¿En qué archivo quieres escribir al final? ");
		String nombreArchivo = sc.nextLine();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivos + "\\" + nombreArchivo, true))) {
			System.out.print("Introduce el texto a añadir al final: ");
			String texto = sc.nextLine();
			bw.write(texto);
			System.out.println("Texto añadido al final del archivo exitosamente.");
		} catch (Exception e) {
			System.out.println("Error al escribir al final del archivo: " + e.getMessage());
		}
		sc.close();
	}

	/**
	 * Muestra una lista de archivos disponibles en la carpeta especificada por la
	 * ruta de archivos. Recupera una lista de nombres de archivo dentro de la
	 * carpeta especificada y los imprime en la consola. Si la carpeta especificada
	 * no existe o no contiene archivos, no se imprime nada.
	 */
	private static void mostrarListaArchivos() {
		File carpeta = new File(rutaArchivos);
		String[] archivos = carpeta.list();
		for (String archivo : archivos) {
			System.out.println(archivo);
		}
	}
}
