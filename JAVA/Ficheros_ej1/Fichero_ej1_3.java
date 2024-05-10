package Ficheros_ej1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fichero_ej1_3 {

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(
					new FileReader("C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\datos.txt.txt"));
			String text = in.readLine();
			do {
				System.out.println(text);
				text = in.readLine();
			} while (text != null);
		} catch (IOException e) {
			System.out.println("No se ha podido encontrar");
		}
	}
}