package tareasPoli_2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// 5 FIGURAS
		final int MAX_FIGURAS = 5;

		// RESERVAMOS MEMORIA
		Figura listaCompleta[] = new Figura[MAX_FIGURAS];

		int contadorTotal = 0;

		boolean bandera = false;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1)Crear circulo");
			System.out.println("2)Crear cuadrado");
			System.out.println("3)Crear triangulo");
			System.out.println("4)Ver figuras");

			/**
			 * 1) usar getclass y simple name
			 * 2) igual que arriba pero con figura
			 * 3) se hace un equals en cada clase y a partir de ahí se compara al completo
			 * 4) cambiar la altura de una pirámide
			 * 5) funcion pintarPiramide y elegir la piramide que usaremos
			 */
			 
			int elec = sc.nextInt();
			sc.nextLine();

			switch (elec) {
			case 1:
				// CIRCULO
				if (contadorTotal < 5) {
					System.out.println("Dime el (int) radio y el (String) color");
					int radio = sc.nextInt();
					sc.nextLine();
					String color = sc.next();

					listaCompleta[contadorTotal] = new Circulo(color, radio);

					contadorTotal++;
				} else {
					System.out.println("Se ha alcanzado el limite");
					bandera = false;
				}
				break;
			case 2:
				// CUADRADO
				if (contadorTotal < 5) {
					System.out.println("Dime el (int) lado y el (String) color");
					int radio = sc.nextInt();
					sc.nextLine();
					String color = sc.next();

					listaCompleta[contadorTotal] = new Cuadrado(color, radio);

					contadorTotal++;
				} else {
					System.out.println("Se ha alcanzado el limite");
					bandera = false;
				}
				break;
			case 3:
				// TRIANGULO
				if (contadorTotal < 5) {
					System.out.println("Dime la (int) base, la (int) altura y el (String) color");
					int base = sc.nextInt();
					sc.nextLine();
					int altura = sc.nextInt();
					sc.nextLine();
					String color = sc.next();

					listaCompleta[contadorTotal] = new Triangulo(color, base, altura);

					contadorTotal++;
				} else {
					System.out.println("Se ha alcanzado el limite");
					bandera = false;
				}
				break;
			case 4:
				for (int i = 0; i < contadorTotal; i++) {
					System.out.println(listaCompleta[i]);
				}
				break;
			default:
				// SALIMOS DEL BUCLE
				bandera = true;
				break;
			}
		} while (bandera == false);
		
		// TERMINAMOS DE AÑADIR LAS FIGURAS
		System.out.println("Qué circulos tenemos: ");
		for (int i = 0; i < MAX_FIGURAS; i++) {
			
		}
	}

}
