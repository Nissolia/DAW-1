package Piramides_ej1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		while (true) {
			System.out.println("Seleccione el tipo de pirámide:");
			System.out.println("1. Pirámide Media");
			System.out.println("2. Pirámide Compleja");
			System.out.println("3. Salir");
			System.out.print("Ingrese su elección: ");

			int elecc = 0;

			try {

				elecc = teclado.nextInt();

			} catch (Exception e) {

				System.out.println("Error: por favor, ingrese un número válido.");

				teclado.nextLine();
			}

			switch (elecc) {

			case 1:
				// Pirámide Media
				int alturaMedia;
				System.out.print("Ingrese la altura de la pirámide media (entre 1 y 27): ");

				try {

					alturaMedia = teclado.nextInt();

					if (alturaMedia < 1 || alturaMedia > 27) {

						System.out.println("La altura de la pirámide media debe estar entre 1 y 27.");
						
					}else {
						
						PiramideMedia.piramideMedia(alturaMedia);
					}

				} catch (Exception e) {

					System.out.println("Error: por favor, ingrese un número válido.");

					teclado.nextLine();
				}
				break;

			case 2:
				// Pirámide Compleja
				int alturaCompleja;

				System.out.print("Ingrese la altura de la pirámide compleja (entre 1 y 54): ");

				try {

					alturaCompleja = teclado.nextInt();

					if (alturaCompleja < 1 || alturaCompleja > 54) {

						System.out.println("La altura de la pirámide compleja debe estar entre 1 y 54.");
						
					}else {
						
						PiramideCompleja.piramideComp(alturaCompleja);
					}


				} catch (Exception e) {

					System.out.println("Error: por favor, ingrese un número válido.");

					teclado.nextLine();
				}
				break;

			case 3:

				System.out.println("Adiós!");

				return;

			default:

				System.out.println("Elección inválida. Por favor, intente de nuevo.");

				break;
			}
		}
	}
}
