package pruebaPokemon;

import java.util.Scanner;

public class pelea2 {
	/* PIDE MES AÑO Y LO DEVUELVE ESCRITO */
	public static void main(String[] args) {
		/* TECLADO */
		Scanner teclado = new Scanner(System.in);
		/* DECLARACIÓN DE VARIABLES */
		int mesEscrito;
		boolean bandera = false;
		/* EMPIEZA EL CÓDIGO */
		do {
			/* AÑADIR LOS DATOS POR TECLADO */
			System.out.println("Ingresa el mes en número: ");
			mesEscrito = teclado.nextInt();
			/* SWITCH DE MES */
			switch (mesEscrito) {
			case 1:
				System.out.println("Has elegido Enero.");
				break;
			case 2:
				System.out.println("Has elegido Febrero.");
				break;

			case 3:
				System.out.println("Has elegido Marzo.");
				break;
			case 4:
				System.out.println("Has elegido Abril.");
				break;
			case 5:
				System.out.println("Has elegido Mayo.");
				break;
			case 6:
				System.out.println("Has elegido Junio.");
				break;
			case 7:
				System.out.println("Has elegido Julio.");
				break;
			case 8:
				System.out.println("Has elegido Agosto.");
				break;
			case 9:
				System.out.println("Has elegido Septiembre.");
				break;
			case 10:
				System.out.println("Has elegido Octubre.");
				break;
			case 11:
				System.out.println("Has elegido Noviembre.");
				break;
			case 12:
				System.out.println("Has elegido Diciembre.");
				break;
			default:
				System.out.println("Has puesto de manera incorrecta la respuesta.");
				bandera = true;
			}
		} while (bandera);
		/* PARA QUE DEJE DE TOMAR COSAS POR TECLADO */
		teclado.close();
		/* FIN DE PROGRAMA */
		System.out.println("Programa finalizado.");
	}

}
