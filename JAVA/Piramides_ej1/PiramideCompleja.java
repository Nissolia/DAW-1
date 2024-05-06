package Piramides_ej1;

public class PiramideCompleja {

	static void piramideComp(int altura) {

		char[] abc = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		int espacios = altura;

		for (int i = 0; i < altura; i++) {

			int indletrasdescpar = ((i+1) / 2)-1;
			int indletrasdescimpar = (i / 2)-1;

			System.out.print(" ".repeat(espacios));

			for (int j = 0; j < i + 1; j++) {

				if (i == 0) {

					System.out.print(abc[j]);
					System.out.print(" ");
					

				} else if ((i + 1) % 2 == 0) {

					if (j+1 > (i+1) / 2) {
						
						System.out.print(abc[indletrasdescpar]);
						System.out.print(" ");

						indletrasdescpar--;

					} else {

						System.out.print(abc[j]);
						System.out.print(" ");
					}

				} else {

					if (j+1 > (i/ 2)+1) {

						System.out.print(abc[indletrasdescimpar]);
						System.out.print(" ");

						indletrasdescimpar--;

					} else {

						System.out.print(abc[j]);
						System.out.print(" ");
					}

				}

			}

			System.out.print(" ".repeat(espacios));

			espacios--;

			System.out.println();
		}

	}
}
