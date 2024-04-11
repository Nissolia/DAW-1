package tareaClases_0;

import java.util.Scanner;

/**************************/
/* HECHO POR @NOELIA BAÑOS*/
/**************************/

public class alineacionesCopa1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// VARIABLES
		int posiciones = 5;
		int array1[] = new int[posiciones];
		int array2[] = new int[posiciones];

		// RELLENADO DE DATOS DEL PRIMER ARRAY
		for (int i = 0; i < posiciones; i++) {
			array1[i] = (int) (Math.random() * 20);
		}
		meterDatos(array1,array2, posiciones);
		

		// SIGUIENTE
		System.out.println("\n------------------------");
		int elecc, num;
// BUCLE EN EL QUE PREGUNTAMOS LA POSICIÓN DEL NUMERO QUE SE VA A CAMBIAR
		do {
			System.out.println("¿En que posición quieres introducir el número?");
			elecc = teclado.nextInt();
			System.out.println("¿Qué número quieres introducir?");
			num = teclado.nextInt();

			array1[elecc - 1] = num;
			meterDatos(array1,array2, posiciones);

		} while (num == 0);
		 teclado.close();
	}
	
	// FUNCION QUE USAMOS DOS VECES Y POR ESO LA PONEMOS FUERA
	public static void meterDatos(int array1[],int array2[], int posiciones){
		// PASO DE DATOS AL OTRO ARRAY
				for (int i = 0; i < posiciones; i++) {
					array2[i] = array1[4 - i];
				}

				// MOSTRAR POR PANTALLA EL PRIMERO
				System.out.println("Primer array");
				for (int i = 0; i < posiciones; i++) {
					System.out.print(array1[i] + " | ");
				}

				// MOSTRAR POR PANTALLA EL SEGUNDO
				System.out.println("\nSegundo array");
				for (int i = 0; i < posiciones; i++) {
					System.out.print(array2[i] + " | ");
				}
	}
}
