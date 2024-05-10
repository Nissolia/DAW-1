package Ficheros_ej1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero_ej3 {
	/*
	 * Escribe un programa en Java que copie el contenido de un fichero de texto
	 * llamado "origen.txt" a otro fichero llamado "des�no.txt".
	 */
	public static void main(String[] args) {
		 String frase = "";

	        BufferedReader buffer = null;
	        // lectura de archivo de origen
	        try {
	            buffer = new BufferedReader(new FileReader("C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\origen.txt"));

	            String c;
	            while ((c = buffer.readLine()) != null) {
	                frase += c + "\n"; // agregar nueva línea al final de cada línea para separarlo
	            }
	        } catch (IOException e) {
	            System.out.println("No se ha leído el fichero. ¿Existe? Miralo");
	            e.printStackTrace();
	        } finally {
	            try {
	                if (buffer != null) {
	                    buffer.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } // Fin de la lectura

	        System.out.println("Archivo de origen:");
	        System.out.println(frase);
		
	        // Escritura en el archivo de destino
	        BufferedWriter out = null;
	        try {
	            out = new BufferedWriter(new FileWriter("C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\destino.txt"));
	            out.write(frase);
	            System.out.println("Datos escritos en el archivo de destino correctamente.");
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

	}
}
