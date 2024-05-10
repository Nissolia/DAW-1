package Ficheros_ej1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fichero_ej1_1 {

	public static void main(String[] args) {
// tengo que corregirlo para ver como sale
		/*
		 * Ejercicio 2: Escribe un programa en Java que cuente el número de líneas que
		 * contiene un fichero de texto llamado "texto.txt" y lo muestre por pantalla.
		 */
		int contador = 0;
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(
					"C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\datos.txt.txt"));

			String c = in.readLine();
			do {
				System.out.println(c);
				c = in.readLine();
				contador++;
			} while (c != null);
		} catch (Exception e) {
			System.out.println("No se ha leido el fichero. ¿Existe? Miralo");
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
		System.out.println("Hay " + contador + " lineas");

	}

}
