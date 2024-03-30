package tareasClases;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		int elecc;
		int num1;
		int num2;
		double sol = 0;
		Scanner sc = new Scanner(System.in);
		// EMPEZAMOS CON EL SYSO
		System.out.println("Empezamos con nuestra calculadora: ");
		System.out.println("1) Division\n2) Multiplicación");
		elecc = sc.nextInt();
		System.out.println("Añade los dos numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		// USAMOS EL SWITCH
		switch (elecc) {
		case 1:

			try {
				sol = division(num1, num2);
			} catch (ArithmeticException e) {
				System.out.println("No puedes dividir por cero, locuelo");
			}
			break;
		case 2:
			sol = num1 * num2;
			break;

		default:
			System.out.println("Te has equivocado");
			break;
		}
		System.out.println("La solucion es: " + sol);
		sc.close();
	}

	/**
	 * Método que se encarga de dividir dos números. Solo se divide si num2 es más
	 * que cero si no lanza una excepcion.
	 * 
	 * @param num1
	 * @param num2
	 * @return num1/num2
	 * @throw ArithmeticException Se lanza cuando b = 0 o menor
	 */
	static double division(int num1, int num2) {
		if (num1 == 0) {
			throw new ArithmeticException();
		}
		return num1 / num2;
	}
}
