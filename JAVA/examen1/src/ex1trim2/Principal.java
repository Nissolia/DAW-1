package ex1trim2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// LLAMADA AL TECLADO

		System.out.println("Elige que quieres hacer: ");
		System.out.println("1: Ver a Fulanito | 2: Poner nombre y numero de faltas | 3: Crear un alumno desde 0");
		int elecc = teclado.nextInt();

		/* HACEMOS UN MENU PARA QUE NO SALGA TODA LA INFORMACIÓN DE GOLPE */
		switch (elecc) {
		case 1: {
			Alumno a1 = new Alumno();
			/* MOSTRAMOS ALUMNO QUE TENEMOS */
			System.out.println(a1.getNombre());
			System.out.println(a1.getNumeroFaltas());
			System.out.println(a1.getNumeroClasesTotales());

			break;
		}
		case 2: {
			// CREAMOS AL ALUMNO 2
			System.out.print("Añade el nombre del alumno: ");
			String Nombre = teclado.nextLine();
			teclado.nextLine();
			System.out.print("Añade las faltas del alumno: ");
			int faltas = teclado.nextInt();
			// HACEMOS LA CLASE CON SU NOMBRE CORRESPONDIENTE
			Alumno a2 = new Alumno(Nombre, faltas);
			// MOSTRAMOS SUS DATOS POR PANTALLA
			System.out.println(a2.getNombre());
			System.out.println(a2.getNumeroFaltas());

			break;
		}
		case 3: {
			// CREAMOS AL ALUMNO 3
			System.out.print("Añade el nombre del alumno: ");
			String Nombre = teclado.nextLine();
			teclado.nextLine();
			System.out.print("Añade las faltas del alumno: ");
			int faltas = teclado.nextInt();
			System.out.print("Añade las clases totales del alumno: ");
			int clasesTotales = teclado.nextInt();
			Alumno a3 = new Alumno(Nombre, faltas, clasesTotales, -1, -1, -1, -1);
			// COMENZAMOS LOS CALCULOS
			a3.rellenarNotas();
			a3.calcularNotaFinal();
			a3.generarPiramide();

			break;
		}
		default:
			System.out.print("No se ni que has elegido.");
		}

		teclado.close(); // LO CIERRO PORQUE ME DA COSITA QUE ESTE EN ROJO AL ENTREGARLO

	}

}