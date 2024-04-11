package BaniosNoelia;

import java.util.Scanner;

public class mainCorreuus {

	public static void main(String[] args) {
		// USAMOS EL SCANNER
		Scanner sc = new Scanner(System.in);
		// EMPEZAMOS CÓDIGO
		System.out.println((int) (Math.random() * 3));
		// DECLARAMOS LOS HEREDEROS AL TRONO DE CORREUS

		/*****************************/
		/* COMPROBACIÓN DE HEREDEROS */
		/*****************************/

		/**********************************/
		System.out.println();
		System.out.println("--- PAQUETE ---");
		Paquete pa = new Paquete("Lebrija", "Cadiz");

		pa.enviar();
		pa.calcularCoste();
		/**********************************/
		System.out.println();
		System.out.println("--- PAQUETE GRANDE ---");
		PaqueteGrande pG = new PaqueteGrande("Lebrija", "Cadiz", 20,30,40);

		pG.calcularCoste();
		pG.toString();
		/**********************************/
		System.out.println();
		System.out.println("--- PAQUETE PEQUEÑO ---");
		PaquetePequenio pP = new PaquetePequenio("Lebrija", "Cadiz",10);

		pP.calcularCoste();
		pP.toString();
		pP.getCosteEnvio();
		/**********************************/
		System.out.println();
		System.out.println("--- CARTA ---");

		Carta c = new Carta("Papa", "Plona");
		c.calcularCoste();
		c.calcularCoste(20);
		c.toString();

		/**********************************/
		System.out.println();
		System.out.println("--- CARTA CERTIFICADA ---");

		CartaCertificada cc = new CartaCertificada("Papa", "Plona");
		cc.leerMensaje();
		cc.calcularCoste();
		System.out.println(cc.toString());

		sc.close(); // LO PONGO PORQUE ECLIPSE ME OBLIGA, NO SOY YO, ES EL
	}
}
