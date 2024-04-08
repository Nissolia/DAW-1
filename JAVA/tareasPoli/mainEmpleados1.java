package tareasPoli;

import java.util.Scanner;

public class mainEmpleados1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int edad;
		int salario;
		int plus;
		// TECLADO
		Scanner sc = new Scanner(System.in);
		/* PRIMER EMPLEADO */
		System.out.println("\tPRIMER EMPLEADO\nPon el nombre del empleado: ");
		nombre = sc.nextLine();
		System.out.println("Pon la edad del empleado: ");
		edad = sc.nextInt();
		System.out.println("Pon el salario del empleado: ");
		salario = sc.nextInt();
		System.out.println("Pon el plus del empleado: ");
		plus = sc.nextInt();
		sc.nextLine();
		// EMPLEADO 1 CON TO LOS DATOS
		Empleado1 e1 = new Empleado1(nombre, edad, salario, plus);
		/* SEGUNDO EMPLEADO */
		System.out.println("\tSEGUNDO EMPLEADO\nPon el nombre del empleado: ");
		nombre = sc.nextLine();
		System.out.println("Pon la edad del empleado: ");
		edad = sc.nextInt();
		System.out.println("Pon el salario del empleado: ");
		salario = sc.nextInt();
		System.out.println("Pon el plus del empleado: ");
		plus = sc.nextInt();
		// EMPLEADO 1 CON TO LOS DATOS
		Empleado1 e2 = new Empleado1(nombre, edad, salario, plus);
		/*
		 * COMPARACIÓN DE AMBOS OBJETOS
		 */
		String nombre1 = e1.getNombre();
		String nombre2 = e2.getNombre();
		if ((nombre1.equals(nombre2)) && ((e1.getSalario()) == (e2.getSalario()))) {
			System.out.println("Los empleados son iguales.");
		} else {
			System.out.println("No son iguales.");
		}

		sc.close();
	}

}
