package Interfaces_ej01;

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
		// empezando el programa
		System.out.println("\tCaseta: Los hartibles de Juan Belmonte 258");
		System.out.println("¿Cuantos socios quieres generar?");

		Scanner sc = new Scanner(System.in);
		int elecc = sc.nextInt();

		// Generar array de socios
		Socios02[] socios = Socios02.generarSocios(elecc);

		// Mostrar socios antes de ordenar
		System.out.println("\tSocios antes de ordenar:");
		imprimirSocios(socios);

		// Ordenar socios
		Socios02.OrdenarSocios(socios);

		// Mostrar socios después de ordenar
		System.out.println("\n\tSocios después de ordenar:");
		imprimirSocios(socios);
		
		sc.close(); //cerramos el escaner
	}

	// Método para imprimir los datos de los socios
	public static void imprimirSocios(Socios02[] socios) {
		for (Socios02 socio : socios) {
			System.out.println("ID Socio: " + socio.getId_socio() + ", Nombre: " + socio.getNombre() + ", Cuenta: "
					+ socio.getCuenta());
		}

	}

}
