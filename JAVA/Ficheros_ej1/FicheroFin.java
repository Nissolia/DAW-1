package Ficheros_ej1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FicheroFin {
	/*
	 * programa que pida y guarde en un txt todo lo que se ponga por teclado hasta
	 * que escriba la persona 'fin'
	 */
	public static void main(String[] args) {
		String frase = "";
		String aux = "";
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Se añadirá información hasta que pongas \'fin\'.");

				// Escritura en el archivo de destino
				BufferedWriter out = null;
				try {
					out = new BufferedWriter(new FileWriter(
							"C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\guardar.txt"));
					out.write(frase);

				} catch (IOException e) {
					System.out.println("No se ha podido escribir en el fichero de destino.");
					e.printStackTrace();
				} finally {
					try {
						if (out != null) {
							out.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} catch (Exception e) {
				System.out.println("Escribe bien.");
			}
		} while (aux != "fin");

	}
}
