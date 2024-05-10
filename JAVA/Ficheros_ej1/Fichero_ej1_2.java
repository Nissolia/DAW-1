package Ficheros_ej1;

import java.io.*;

public class Fichero_ej1_2 {
	/*
	 * Escribe un programa en Java que lea el contenido de un fichero de texto
	 * llamado "datos.txt" y lo muestre por pantalla.
	 */
	public static void main(String[] args) {

		FileReader buffer = null;
		int contador = 0;

		try {
			buffer = new FileReader("C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\datos.txt.txt");
			System.out.println(buffer); // vemos si sale el buffer
			char frase = (char) buffer.read();
			
			while (frase != -1) {
				// imprimimos por consola
				System.out.println(frase);
				contador++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	/*
	 * int read() → coge caracteres y te devuelve el ascii (-1 hasta terminar el
	 * fichero). BufferedReader → tiene métodos para leerlo todo por completo, frase
	 * a frase. void close() → Lo cierra y hay que tener cuidado. string readLine()
	 * → Devuelve un null cuando termina.
	 */
}
