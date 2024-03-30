package tareasBoletin;

import java.util.Scanner;

public class bol1_pooej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primero de todo dime tu nombre para hacerte una cuenta: ");
		String nombre = sc.nextLine();
		// CREAMOS LA CUENTA CON EL NOMBRE DEL TITULAR
		System.out.println("¿Quieres añadir dinero a tu cuenta?");
		System.out.println("s/n  ");
		int dinero = sc.nextInt();
		// COMPROBAMOS QUE LA PERSONA QUIERE METER DINERO O NO
		// A MEDIO HACER
		// CREAMOS LA CUENTA CON LA INFORMACION
		Bol1_pooej1_Cuenta c1 = new Bol1_pooej1_Cuenta(nombre, dinero);
		
		
		System.out.println("¿Que quieres hacer?");
		System.out.println("1) Ingresar dinero 2) Sacar dinero");
		int filas = sc.nextInt();
		
	c1.ingresar(300);
	c1.retirar(200);
	}
	

}
