package EjMatrices;

import java.util.Scanner;

public class ej_d {
	final static int MAX = 10;

	public static void main(String[] args) {
		// Preparamos el escáner
		Scanner s = new Scanner(System.in);
		int num = 0;
		// Creamos la tabla en la que introduciremos los números
		int[] tabla = new int[MAX];
		System.out.println("Introduce los números de forma creciente: (De menor a mayor)");

		// Usamos este bucle para rellenar los 5 primeros números
		for (int i = 0; i < 5; i++) {
			tabla[i] = s.nextInt();
			// Comprobamos si el número ingresado es mayor o igual al anterior
			if (i > 0 && tabla[i] < tabla[i - 1]) {
				System.out.println("Por favor, introduce números en orden creciente.");
				// Retrocede el índice para volver a pedir el número
				i--;
			}
		}

		// Mostramos el estado actual de la tabla
		System.out.println("Orden actual de nuestra tabla:");
		mostrarNumeros(tabla);

		// Le pedimos al usuario que introduzca el número a añadir
		System.out.println("Dame el número que quieras introducir:");
		num = s.nextInt();

		// Encontramos la posición donde debemos insertar el nuevo número
		int pos = 5; // Por defecto, si el número es mayor que todos, se inserta al final
		for (int i = 0; i < 5; i++) {
			if (num < tabla[i]) {
				// Se encuentra la posición correcta para insertar
				pos = i;
				break;
			}
		}

		/*
		 * Desplazamos los elementos hacia la derecha para hacer espacio para el nuevo
		 * número
		 */
		for (int i = 5; i > pos; i--) {
			tabla[i] = tabla[i - 1];
		}

		// Insertamos el nuevo número en la posición que debe estar
		tabla[pos] = num;

		// Mostramos la tabla después de insertar el nuevo número
		System.out.println("Tabla después de insertar el número:");
		mostrarNumeros(tabla);

		// Finalizamos el scaner y el programa
		s.close();
	}

	/*
	 * Función para mostrar los números de la tabla. Se deja de mostrar cuando
	 * encuentra un 0.
	 */
	public static void mostrarNumeros(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == 0) {
				break; // Deja de mostrar cuando encuentra un 0
			}
			System.out.print(tabla[i] + " ");
		}
		System.out.println(); // Para hacer un salto de línea al final
	}
}
