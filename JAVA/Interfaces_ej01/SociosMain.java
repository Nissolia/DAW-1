package Interfaces_ej01;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Main creacion de los socios, mostrarlos, metodos para ordenarlo, como le
 * pasamos el array se ordena por el propio array y luego lo mostramos de nuevo
 */
public class SociosMain {
/* menu:
 * ordenar por defecto
 * ordenar por id
 * ordenar por nombre y despues por id
 * ordenaar por nombre, cuenta y despues por id*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bucle = false;
		// empezando el programa
		System.out.println("\tCaseta: Los hartibles de Juan Belmonte 258");
		System.out.println("¿Cuantos socios quieres generar?\n");
		int numSocios = sc.nextInt();
		sc.nextLine();
		// Generar array de socios
				Socios[] socios = Socios.generarSocios(numSocios);

				// Mostrar socios antes de ordenar
				System.out.println("\tSocios:");
				imprimirSocios(socios);
				do {		
		System.out.println("\n................................... MENÚ PRINCIPAL");
		System.out.println("1) Ordenar por defecto");
		System.out.println("2) Ordenar por id");
		System.out.println("3) Ordenar por nombre e id");
		System.out.println("4) Ordenar por nombre, cuenta e id");
		int elecc = sc.nextInt();
		
		switch (elecc) {
		case 1:
			// Ordenar socios por defecto
			Socios.OrdenarSocios(socios);

			// Mostrar socios después de ordenar
			System.out.println("\n\tSocios después de ordenar:");
			imprimirSocios(socios);
			break;
		case 2:
			
			Arrays.sort(socios, new CompararId());
			for (Socios s : socios) {
				System.out.println(s.toString());
				
			}
			break;
		case 3:
			Arrays.sort(socios, new CompararNombre());
			
			for (Socios s : socios) {
				System.out.println(s.toString());
				
			}
			break;
		case 4:
			Arrays.sort(socios, new CompararNombre());
			
			for (Socios s : socios) {
				System.out.println(s.toString());
				
			}
			break;
		default:
			bucle = false;
			break;
		}
		
			
		} while (bucle== true);
		

		

		
		
		sc.close(); //cerramos el escaner
	}

	// Método para imprimir los datos de los socios
	public static void imprimirSocios(Socios[] socios) {
		for (Socios socio : socios) {
			System.out.println("ID Socio: " + socio.getId_socio() + ", Nombre: " + socio.getNombre() + ", Cuenta: "
					+ socio.getCuenta());
		}

	}

}
