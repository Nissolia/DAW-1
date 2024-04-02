package sustito;

import java.util.Scanner;

public class MainSustito {

	public static void main(String[] args) {
		int elecc;
		Boolean salir = false;
		Scanner sc = new Scanner(System.in);
		/*
		 * Crear un programa que te permita introducir hasta 10 personas distintas.
		 * Menu: Introcudir estudiante Pida por teclado los distintos valores que
		 * necesita Introducir profesor Pida por teclado los distintos valores que
		 * necesita Introducir trabajador Pida por teclado los distintos valores que
		 * necesita Introducir todo por defecto Un array que ya lo tenga todo. Mostrar
		 * todo Muestra toda la lista Mostrar trabajadores Mostrar la lista Mostrar
		 * profesores Mostrar la lista Mostrar estudiantes Mostrar la lista Mostrar
		 * quien gana mas de X Pida por teclado una cantidad y muestre aquellos del
		 * array que superen ese cantidad. Salir
		 */
		Persona[] persona = new Persona[10];
		do {

		// Hasta 10 personas diferentes
		System.out.println("___________________ MENÚ PRINCIPAL");
		System.out.println("1) Introducir estudiante.");
		System.out.println("2) Introducir profesor.");
		System.out.println("3) Introducir trabajador.");
		System.out.println("4) Introducir todo por defecto.");
		// Un array con todo
		System.out.println("5) Mostrar todo.");
		System.out.println("6) Mostrar trabajadores.");
		System.out.println("7) Mostrar profesores.");
		System.out.println("8) Mostrar estudiantes.");
		System.out.println("9) Mostrar quien gana más de . . .");
		System.out.println("10) Salir.");
		elecc = sc.nextInt();
		sc.close(); // cerramos el escaner por precaución

		switch (elecc) {
		case 1:
			// Introducir estudiante
			break;
		case 2:
			// Introducir profesor
			break;
		case 3:
			// Introducir trabajador
			break;
		case 4:
			// Introducir todo por defecto
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			
			break;
		case 10:
			System.out.println("Gracias por usar este programa.");
			salir = true;
			break;
		default:
			
			break;
		}
		} while (salir == false);
	}

}// Fuera de la clase
