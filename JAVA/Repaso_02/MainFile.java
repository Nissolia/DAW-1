package Repaso_02;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;

public class MainFile {

	public static void main(String[] args) {
		// variables que usaremos
		int elecc = 0; // la incializamos en -1 por si nos da error
		Scanner sc = new Scanner(System.in);
		ArrayList<String> archivosTxt = new ArrayList<>();
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
				sc.nextLine(); // Limpiar el buffer del Scanner
				elecc = 0; // Resetear elecc para evitar repetir la última opción válida
			}
			
			switch (elecc) {
			case 1:
				leerArchivo(archivosTxt);
				break;
			case 2:
				sobreescribirArchivo();
				break;
			case 3:
				escribirFinal();
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

	// Métodos que usaremos
	public static ArrayList<String> leerArchivo(ArrayList<String> archivosTxt) {
		System.out.println("Leyendo archivo...");
		archivosTxt = guardarArchivos(archivosTxt);
		
		return archivosTxt;
	}

	/*
	 * Metemos en el método de guardar archivos
	 */
	private static ArrayList<String> guardarArchivos(ArrayList<String> archivosTxt) {
		FileReader in;
		try {
			in = new FileReader("C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\indice.csv");
			int c = in.read();
			do {
				c = in.read();
				System.out.println((char) c);
			} while (c != -1);
		} catch (Exception e) {
			System.out.println("No se ha podido abrir el flujo de datos.");
		}

		return archivosTxt;

	};

	public static void sobreescribirArchivo() {
		System.out.println("Sobreescribiendo archivo...");
	}

	public static void escribirFinal() {
		System.out.println("Escribiendo al final del archivo...");
	}

}
