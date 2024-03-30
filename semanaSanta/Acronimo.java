package semanaSanta;

import java.util.Scanner;
/**
 * Link del ejercicio:
 * <i>https://aceptaelreto.com/problem/statement.php?id=694&cat=157</i> Text in
 * spanish only.
 * 
 * @author Noelia Baños
 * @version 1.3
 * @since 1.0
 */
public class Acronimo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			// El número de casos de prueba
			System.out.print("Ingrese el número de casos de prueba: ");
			int numCasosPrueba = scanner.nextInt();
			scanner.nextLine(); // Limpieza de buffer

			// Procesamos cada caso de prueba y mostramos el resultado
			for (int i = 0; i < numCasosPrueba; i++) {
				// Mostramos la frase
				System.out.print("Ingrese la frase del caso " + (i + 1) + ": ");
				String frase = scanner.nextLine();

				/*
				 * Usamos .split para dividir el String por el carácter que ponemos entre los
				 * paréntesis, de esta forma no tenemos que hacerlo de una forma tediosa
				 */
				String[] palabras = frase.split(" ");

				// Creamos el string para enseñar el acrónimo
				String acronimo = "";
				for (String palabra : palabras) {
					/*
					 * Confirmamos si la primera letra de la palabra está en mayúscula por eso
					 * usamos isUpperCase para ver si el char que estamos mirando es una mayúscula y
					 * si lo es se añade para mostrarlo como acrónimo
					 */
					if (palabra.length() > 0 && Character.isUpperCase(palabra.charAt(0))) {
						// Agregar la primera letra de la palabra al acrónimo (en mayúsculas)
						acronimo += (palabra.charAt(0));
					}
				}
				// Mostramos el acrónimo
				System.out.println("El acrónimo del caso " + (i + 1) + " es: " + acronimo.toString());
			}
			// Ponemos un try catch por is la persona añade de manera incorrecta los datos
		} catch (Exception e) {
			System.out.println("Error: Ha ocurrido un problema al procesar la entrada.");
		} finally {
			scanner.close();
		}
		System.out.println("Gracias por usar nuestra terminal.");
	}
}
