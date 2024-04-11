package tareasPoli_1;

import java.util.Scanner;

public class mainEmpleados2 {
	/*
	 * CREA LISTA DE EMPLEADOS, RELLENA CON DATOS CUALQUIERAS MUESTRE LA LISTA Y QUE
	 * EL USUARIO ELIJA DOS DE ELLOS Y NOS DIGA SI SON IGUALES
	 */
	public static void main(String[] args) {
		/* TECLADO */ Scanner sc = new Scanner(System.in);
        int MAX = 4;
        int elecc1;
        int elecc2;
		// ARRAYS USADOS
		Empleado1 empleados[] = new Empleado1[MAX]; // CREACIÓN DEL ARRAY
		empleados[0] = new Empleado1("Maria", 36, 1600, 20);
		empleados[1] = new Empleado1("Pepe", 20, 1500, 5);
		empleados[2] = new Empleado1("Maria", 40, 1600, 0);
		empleados[3] = new Empleado1("Dolores", 36, 1800, 10);
		// BUCLE PARA COMPROBARLO
		do {
			//MOSTRAR POR PANTALLA	
			System.out.println("1) "+empleados[0]+"\n2) "+empleados[1]);
			System.out.println("3) "+empleados[2]+"\n4) "+empleados[3]);
			System.out.println("------------------------------------------------------------");
			System.out.println("Elige dos de ellos y di si son iguales: ");
			elecc1 = (sc.nextInt())-1;
			elecc2 = (sc.nextInt())-1;
			// COMPROBAMOS
			
		} while (elecc1 != 0 && elecc2 != 0);
	
		
		
		/* CERRANDO TECLADO */ sc.close();
	}

}
