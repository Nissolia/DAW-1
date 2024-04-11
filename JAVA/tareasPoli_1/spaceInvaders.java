package tareasPoli_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class spaceInvaders {

	public static void main(String[] args) {
		// ABRIMOS EL SCANNER
		Scanner sc = new Scanner(System.in);
		// ATRIBUTOS PARA USAR EN EL ARRAY
		int max = 0;
		boolean salida = false;
		/*
		 * BUCLE EN EL QUE COMPROBAMOS QUE EL USUARIO META EL NUMERO DE RANKING
		 */
		do {
			try { // EN UN TRY USAMOS TODITO
				System.out.println("Pon cuantas mejores puntuaciones, en número.");
				max = sc.nextInt(); // PONEMOS LA CANTIDAD DE ESPACIOS QUE HABRÁ EN EL ARRAY
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Entrada no valida, nos ha salido el error " + e.getMessage());
				sc.nextLine();
			} finally { // ALGO QUE VAYAMOS A COMPROBAR SI O SI AL FINAL SIEMPRE
				if (max < 20 && max > 0) {
					salida = true;
				}
			}
		} while (salida == false);

		/* PARTE DE LA INTRODUCCIÓN DE CARACTERES */
		String[] casillas = new String[max];
		/******************************************************************************/
		String nombre = "";
		int contador = 0;
		/*
		 * DENTRO DEL TRY HAY QUE AÑADIR UN BUCLE EN EL QUE LA PERSONA HAYA METIENDO EL
		 * NOMBRE HASTA TENER EL MAXIMO DEL ARRAY Y EN CADA UNO SE METEN LOS 3 CARACTERES
		 * LOS CUALES NO PUEDEN SER MAS DE ESOS Y NO SE LE PUEDE METER " " + NUMS
		 */
		do {
			System.out.println("Pon tu nombre en 3 carácteres.");
			nombre = sc.nextLine();
			// SI NOMBRE LENGT ES MAYOR PUES AIOS MUY BUENAS
			if (nombre.length() <= 3) {
				char auxnom = ' ';
				boolean control = false; // SE PONE TRUE SI ENCUENTRA ESPACIO
				boolean numero = false;
				/* HACER TRY PARA QUE NO SE SALGA DEL RANGO DEL ARRAY AL PREGUNTAR */
				for (int i = 0; i == 3; i++) {
					try {
						auxnom = nombre.charAt(i);
						numero = isNumeric(auxnom);
						if (auxnom == ' ' || numero == true) {
							System.out.println("Fallo en el cáracter: " + i);
							control = true;
						}
					} catch (StringIndexOutOfBoundsException e) {
						System.out.println("");
					}
				}
				if (control == false) {
					casillas[contador] = nombre; // SI ES CORRECTO ENTRA EN LA LINEA
					contador++;
				}
			} else {
				System.out.println("Es demasiado grande.");
			}

		} while (contador != max);
		// COMPROBAR EL ARRAY QUE ESTE LLENITO

		for (int i = 0; i < max; i++) {
			System.out.println(i + ") " + casillas[i]);
		}
		// CIERRE DE TECLADO
		sc.close();

		/* UNIMOS EL CHAR PARA UN STRING Y MOSTRAR EN PANTALLA */
		String fraseFinal = "";

		/* MIRAR LAS LETRAS DE LAS PALABRAS QUE AÑADE EL USUARIO */
		for (int i = 0; i < 3; i++) {
			for (String palabra : casillas) {
				/* SI LA PALABRA TIENE I+2, AÑADIMOS LA LETRA A LA FRASEFINAL */
				if (palabra.length() > i) {
					fraseFinal += palabra.charAt(i);
				}
			}
			// OPCIONAL: AÑADIMOS UN ESPACIO DETRAS DE CADA GRUPO DE LETRAS
			// fraseFinal += " ";
		}

		System.out.println("Frase final: " + fraseFinal);
	} // FIN DEL MAIN

	/*
	 * FUNCION QUE USAMOS PARA QUE IDENTIFIQUE QUE UN CHAR Y LO IDENTIFIQUE COMO INTEGER
	 */
	private static boolean isNumeric(char str) {
		return Character.isDigit(str);
	}
}