package Interfaces_ej01;

public class SociosMain {

	public static void main(String[] args) {
		/*
		 * main creacion de los socios, mostrarlos, metodos para ordenarlo, como le
		 * pasamos el array se ordena por el propio array y luego lo mostramos de nuevo
		 */

		// Generar array de socios
		Socios02[] socios = Socios02.generarSocios(5);

		// Mostrar socios antes de ordenar
		System.out.println("\tSocios antes de ordenar:");
		imprimirSocios(socios);

		// Ordenar socios
		Socios02.OrdenarSocios(socios);

		// Mostrar socios después de ordenar
		System.out.println("\n\tSocios después de ordenar:");
		imprimirSocios(socios);
	}

	// Método para imprimir los datos de los socios
	public static void imprimirSocios(Socios02[] socios) {
		for (Socios02 socio : socios) {
			System.out.println("ID Socio: " + socio.getId_socio() + ", Nombre: " + socio.getNombre() + ", Cuenta: "
					+ socio.getCuenta());
		}

	}

}
