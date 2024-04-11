package BaniosNoelia;

import java.util.Scanner;

public class CartaCertificada extends Carta {
	/**********************/
	/* NO TIENE ATRIBUTOS */
	/**********************/
	/* CONSTRUCTORES */
	/**********************/

	CartaCertificada(String destino, String origen) {
		super(destino, origen);
		setDestino(destino);
		setOrigen(origen);
	}

	/***********/
	/* MÉTODOS */
	/***********/
// DESPROTEGER LA CARTA JUNTO A VARIAS PREGUNTAS
	private boolean desproteger() {
		// USAMOS EL ESCANER
		Scanner sc = new Scanner(System.in);
		// ATRIBUTOS
		boolean desproteger = false;
		Integer respuesta = 0;
		boolean indice[];
		int numero;
		int contador = 0;

		// PRUEBITA DE LAS PREGUNTITAS, SALE DEL 0 AL 2
		for (int i = 0; i < 10; i++) {
			numero = (int) (Math.random() * 3); // PONEMOS UN NUMERO AL AZAR
			/*
			 * DE ESTA FORMA COMPROBAMOS QUE NO SE REPITAN LAS PREGUNTAS QUE VAMOS A HACERLE
			 * AL USUARIO
			 */
			indice = new boolean[3]; // LO USAMOS PARA COMPROBAR QUE TODO VA CORRECTO
			indice[0] = false;
			indice[1] = false;
			indice[2] = false;
			// MOSTRAMOS POR PANTALLA EL INDICE QUE EL USUARIO NO HA COMPLETADO
			if (indice[numero] == false) {
				// HACEMOS UN SWITCH PARA
				/*
				 * ESTA PARTE ME ESTA DANDO PROBLEMAS PORQUE NO TERMINA DE ENTRAR EN EL BUCLE
				 * COMO NECESITO QUE LO HAGA
				 */
				switch (numero) {
				case 0:
					System.out.println("¿De qué color es el caballo blanco de Santiago?");
					System.out.println("1)Negro, 2)Blanco, 3)No sabe no contesta");
					respuesta = sc.nextInt();

					if (respuesta.equals(1)) {
						desproteger = true;
						contador++;
						System.out.println("CORRECTO");
					} else {
						System.out.println("Mal. Esta era facilita, eh.");
					}
					break;
				case 1:

					System.out.println("¿En qué estación es la Navidad?");
					System.out.println("1)Invierno, 2)Verano, 3)Otoño");
					respuesta = sc.nextInt();
					if (respuesta.equals(1)) {

						desproteger = true;
						contador++;
						System.out.println("CORRECTO");
					} else {
						System.out.println("Mal. Esta estaba tirá.");
					}
					break;
				case 2:
					System.out.println("¿Qué mata a los vampiros?");
					System.out.println("1)Rebujito, 2)Pan de ajo, 3)Gurifrisqui");
					respuesta = sc.nextInt();
					if (respuesta.equals(1)) {
						desproteger = true;
						contador++;
						System.out.println("CORRECTO");
					} else {
						System.out.println("Mal. Esta estaba tirá.");
					}
					break;
				default:
					System.out.println("Error de sistema . . .");

				}
				break;

				// COMPROBAMOS QUE LA PERSONA NO ELIJA SALIR
			}

			if (contador >= 3) {
				i = 10;
			}
		}

		sc.close();

		// SI ACIERTA LAS 3 DEVUELVE TRUE
		return desproteger;
	}

// LEEMOS EL MENSAJE - EN PROCESO

	@Override
	public String leerMensaje() {
		// COMPROBAMOS SI HAY MENSAJES ANTERIORES
		String mensaje = getMensaje();
		/******************************************************/
		if (getMensaje() == "") {
			System.out.println("Todavía no hay mensajes.");
		} // SEGUIMOS

		String fraseModificada = mensaje;
		boolean desproteger = desproteger();

// COMPROBAMOS QUE EL MENSAJE ESTA DESPROTEGIDO
		if (desproteger == true) {
			System.out.println(getMensaje());
		} else { // CIFRADO
			mensaje = getMensaje();
			for (int i = 0; i < mensaje.length(); i++) {
				// SEGUIMOS CON EL UNTENTO
				// USAMOS EL CHARAT PARA IR UNO POR UNO Y PASARLO DE UN LUGAR A OTRO
				char caracter = mensaje.charAt(i);
				// EMPEZAMOS A PROBAR
				if (caracter == 'a') {
					caracter = 'p';
				} else if (caracter == 'o') {
					caracter = 'm';
				} else if (caracter == 'e') {
					caracter = 'd';
				}

				fraseModificada += caracter;
			}
			System.out.println(fraseModificada);

		}
		return fraseModificada;
	}

	// CALCULAR COSTE, PASA AUTO A VALER 1.5
	@Override
	public void calcularCoste() {
		setCosteEnvio(1.5);
	}

// CARTA CERTIFICADA AL COMPLETO
	@Override
	public String toString() {
		return "CartaCertificada [isSello()=" + isSello() + ", getIdPaquete()=" + getIdPaquete() + ", getDestino()="
				+ getDestino() + ", getOrigen()=" + getOrigen() + ", getCosteEnvio()=" + getCosteEnvio() + "]";
	}

}
