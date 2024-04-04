package depurar;

import java.util.Scanner;

//INTRODUCIMOS DOS NUMEROS POR TECLADO. NOS DIRÁ CUAL ES MAYOR Y CUCAL MENOR HASTA QUE METAMOS 2: 0
public class e1 {

	public static void main(String[] args) {
		// DECLARAMOS LAS VARIABLES
		int num1;
		int num2;
		boolean repetir = true;

		Scanner sc = new Scanner(System.in);
		do {
			num1 = sc.nextInt();

			num2 = sc.nextInt();
			repetir = num1 != 0 || num2 != 0;

			if (repetir == false) {
				// HACEMOS LA COMPROBACIÓN
				if (num1 >= num2) {
					// IF ANIDADO
					if (num1 == num2) {
						System.out.println("Los numeros " + num1 + " y " + num2 + " son iguales");
					} else {
						System.out.println("El número " + num1 + " es mayor que el número " + num2);
					}
				} else {
					System.out.println("El número " + num2 + " es mayor que el número " + num1);
				}
			}else {
				System.out.println("Saliendo");
			}
		} while (repetir == true);
	}

}
