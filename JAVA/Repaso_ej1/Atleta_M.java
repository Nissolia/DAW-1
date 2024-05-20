package Repaso_ej1;

import java.util.Scanner;

public class Atleta_M {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int elecc = 1;
		int menu = 0;
		boolean numero = true;
		boolean salida = false;
		/* Fin de las variables */
		do {
			System.out.println("¿Cuántos atletas quieres generar?");
			try {
				elecc = sc.nextInt();
				sc.nextLine(); // Para consumir el salto de línea
				if (elecc >= 3) {
					numero = false;
				} else {
					System.out.println("El número debe ser al menos 3.");
				}
			} catch (Exception e) {
				sc.nextLine(); // Para consumir el salto de línea
				elecc = 1;
				numero = true;
				System.out.println("Inserta un número correcto.");
			}
		} while (numero == true);
		// finalizamos el bucle para ver que todo se introduce correctamente
		Atleta[] at = new Atleta[elecc];// generamos los atletas
		for (int i = 0; i < at.length; i++) {
			at[i] = new Atleta(); // metemos dentro los atletas
		}
		// menú
		do {
			System.out.println("..........................MENÚ");
			System.out.println("1) Mostrar atleta ganador.");
			System.out.println("2) Mostrar listado de atletas.");
			System.out.println("3) Salir del menñu.");
			try {
				menu = sc.nextInt();
				sc.nextLine(); // Para consumir el salto de línea
			} catch (Exception e) {
				sc.nextLine(); // Para consumir el salto de línea
				elecc = 1;
				numero = true;
				System.out.println("Pon un numero válido");
			}
			// tras comprobar que mete correctamente el numero que queremos usamos esto
			switch (menu) {
			case 1: {
				// mostramos ganadores y carrera
				at[0].mostrarGanador(at);
				break;
			}
			case 2: {

				// Mostrar todos los que están en la lista
				at[0].listadoCompleto(at);
				break;
			}
			case 3: {
				salida = true;
				System.out.println("Saliendo del programa...");
				break;
			}
			default:
				System.out.println("Pon un número del menú.");
				break;
			}
		} while (numero = !true || salida != true);

		sc.close();
	}// fin main

}
