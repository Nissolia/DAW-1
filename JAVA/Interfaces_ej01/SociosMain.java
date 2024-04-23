package Interfaces_ej01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Main creacion de los socios, mostrarlos, metodos para ordenarlo, como le
 * pasamos el array se ordena por el propio array y luego lo mostramos de nuevo
 */
public class SociosMain {
	/*
	 * menu: ordenar por defecto ordenar por id ordenar por nombre y despues por id
	 * ordenaar por nombre, cuenta y despues por id
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// empezando el programa
		System.out.println("\tCaseta: Los hartibles de Juan Belmonte 258");
		System.out.println("¿Cuantos socios quieres generar?\n");
		int numSocios = 0;
		// que vaya bien
		try {
			numSocios = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Dato no válido, vuelve a intentarlo.");
		}
		// Generar array de socios
		Socios[] socios = Socios.generarSocios(numSocios);

		// Mostrar socios antes de ordenar
		System.out.println("\tSocios:");
		imprimirSocios(socios);
		int elecc = 0;
		do {
			System.out.println("\n................................... MENÚ PRINCIPAL");
			System.out.println("1) Ordenar por defecto");
			System.out.println("2) Ordenar por id");
			System.out.println("3) Ordenar por nombre e id");
			System.out.println("4) Ordenar por nombre, cuenta e id");
			System.out.println("5) Salir");
			// comprobamos que todo va bien
			try {
				elecc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Dato no válido, vuelve a intentarlo.");
			}
			// menu
			switch (elecc) {
			case 1:
				// Ordenar socios por defecto
				Socios.OrdenarSocios(socios);

				// Mostrar socios después de ordenar
				System.out.println("\n\tSocios ordenados por defecto:");
				imprimirSocios(socios);
				break;
			case 2:
				System.out.println("\n\tSocios ordenados por id:");
				Arrays.sort(socios, new CompararId());
				for (Socios s : socios) {
					System.out.println(s.toString());

				}
				break;
			case 3:
				System.out.println("\n\tSocios ordenados por nombre e id:");
				Arrays.sort(socios, new CompararNombreId());

				for (Socios s : socios) {
					System.out.println(s.toString());

				}
				break;
			case 4:
				System.out.println("\n\tSocios ordenados por nombre, cuenta e id:");
				Arrays.sort(socios, new CompararNombreCuentaId());

				for (Socios s : socios) {
					System.out.println(s.toString());

				}
				break;
			default:

				break;
			}

		} while (elecc != 5);

		sc.close(); // cerramos el escaner
	}

	// Método para imprimir los datos de los socios
	public static void imprimirSocios(Socios[] socios) {
		for (Socios socio : socios) {
			System.out.println("ID Socio: " + socio.getId_socio() + ", Nombre: " + socio.getNombre() + ", Cuenta: "
					+ socio.getCuenta());
		}

	}

}
