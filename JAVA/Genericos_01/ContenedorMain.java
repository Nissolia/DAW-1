package Genericos_01;

import java.util.Scanner;

public class ContenedorMain {

	public static void main(String[] args) {
		/* atributos */
		Contenedor<Integer> contenedor = new Contenedor<>();
		Scanner sc = new Scanner(System.in);
		int elecc;
		/* código */
		do {
			// menu
			System.out.println("\n\tMenu:");
			System.out.println("1. Insertar al final");
			System.out.println("2. Extraer del final");
			System.out.println("3. Ordenar");
			System.out.println("4. Insertar al principio");
			System.out.println("5. Extraer del principio");
			System.out.println("6. Mostrar contenedor");
			System.out.println("7. Salir");
			System.out.print("\nElija una opción: ");
			elecc = sc.nextInt();

			switch (elecc) {
			case 1:// insertar al final
				System.out.print("Ingrese un número para insertar al final: ");
				int numFinal = sc.nextInt();
				contenedor.insertarAlfinal(numFinal);
				break;
			case 2:// extraer del final
				try {
					Integer extraidoFinal = contenedor.extraerDelFinal();
					System.out.println("Elemento extraído del final: " + extraidoFinal);
				} catch (IllegalStateException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:// ordenar
				contenedor.ordenar();
				System.out.println("Contenedor ordenado.");
				break;
			case 4:// insertar al inicio
				System.out.print("Ingrese un número para insertar al principio: ");
				int numInicio = sc.nextInt();
				contenedor.insertarAlPrincipio(numInicio);
				break;
			case 5:// extraer del inicio
				try {
					Integer extraidoInicio = contenedor.extraerDelPrincipio();
					System.out.println("Elemento extraído del principio: " + extraidoInicio);
				} catch (IllegalStateException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 6:// mostrar contenedor
				System.out.println("Contenedor: " + contenedor);
				break;
			case 7:// salir
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (elecc != 7);

		sc.close();
	}
}
