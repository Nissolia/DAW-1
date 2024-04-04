package ex1trim2;

import java.util.Scanner;

// CORREGIDO EN CLASE

public class Alumno2 {

	/*************/
	/* ATRIBUTOS */
	/*************/
	private String Nombre;
	private int numeroFaltas;
	private int numeroClasesTotales;
	private Boolean evaluacion;
	private int[] notas = { -1, -1, -1, -1 };

	/*****************/
	/* CONSTRUCTORES */
	/*****************/

	Alumno2() {
		this.Nombre = "Fulanito";
		this.numeroFaltas = 0;
		this.numeroClasesTotales = 100;
		this.evaluacion = true;
	}

	Alumno2(String Nombre, int numeroFaltas) {
		this.Nombre = Nombre;
		this.numeroFaltas = numeroFaltas;
		this.numeroClasesTotales = 100;
		this.evaluacion = false;
	}

	Alumno2(String Nombre, int numeroFaltas, int numeroClasesTotales, int notas[]) {
		this.Nombre = Nombre;
		this.numeroFaltas = numeroFaltas;
		this.numeroClasesTotales = numeroClasesTotales;
		this.notas = notas;

	}

	/**********************/
	/* GETTER AND SETTERS */
	/**********************/

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getNumeroFaltas() {
		return numeroFaltas;
	}

	public void setNumeroFaltas(int numeroFaltas) {
		this.numeroFaltas = numeroFaltas;
	}

	public int getNumeroClasesTotales() {
		return numeroClasesTotales;
	}

	public void setNumeroClasesTotales(int numeroClasesTotales) {
		this.numeroClasesTotales = numeroClasesTotales;
	}

	/*****************/
	/* OTROS MÉTODOS */
	/****************/

	/* CALCULO DE FALTAS */
	public void calculoDeFaltas() {
		/*
		 * HACEMOS LA PRUEBA PARA QUE DEPENDIENDO DE LAS CLASES QUE TIENE EN TOTAL SE
		 * CALCULE EL 30% DE ASISTENCIA
		 */
		double porcentaje = numeroClasesTotales * 0.3;
		/*
		 * MOSTRAMOS EN PANTALLA SI HA FALTADO MÁS DE UN 30% Y TAMBIÉN SI TIENE O NO
		 * DERECHO A EVALUACIÓN
		 */
		if (numeroFaltas > porcentaje) {
			System.out.println("Has faltado más del 30%, locuelo.");
			evaluacion = false;
		} else {
			System.out.println("Tienes derecho a evaluacion.");
			evaluacion = true;
		}
	}

	/* RELLENAR NOTAS */
	public void rellenarNotas() {
		Scanner teclado = new Scanner(System.in);

		/*
		 * OPCIÓN PARA LA PRIMERA VEZ QUE LLAMA A ESTE MÉTODO DE ESTA FORMA LA PERSONA
		 * PUEDE AÑADIR A TODAS LAS NOTAS LA INFORMACIÓN QUE DESEE
		 */
		if (notas[0] == -1) {
			for (int i = 0; i < 4; i++) {
				// MODIFICAR ESTA PARTE
			}
		}

		if (nota1 == -1) {
			// NOTAS QUE NO HAN SIDO MODIFICADAS
			System.out.print("Dime la primera nota: ");
			nota1 = teclado.nextInt();
			if (nota1 < 0 || nota1 > 10) {
				System.out.print("Debes introducir correctamente las notas. . .");
				nota1 = -1;
			} else {
				// COMPROBAMOS DE LA MISMA FORMA LA SIGUIENTE NOTA
				System.out.print("Dime la segunda nota: ");
				nota2 = teclado.nextInt();
				if (nota2 < 0 || nota2 > 10) {
					System.out.print("Debes introducir correctamente las notas. . .");
					nota2 = -1;
				} else {
					// COMPROBAMOS DE LA MISMA FORMA LA SIGUIENTE NOTA
					System.out.print("Dime la segunda nota: ");
					nota3 = teclado.nextInt();
					if (nota3 < 0 || nota3 > 10) {
						System.out.print("Debes introducir correctamente las notas. . .");
						nota3 = -1;
					} else {
						// COMPROBAMOS DE LA MISMA FORMA LA SIGUIENTE NOTA
						System.out.print("Dime la segunda nota: ");
						nota4 = teclado.nextInt();
						if (nota4 < 0 || nota4 > 10) {
							System.out.print("Debes introducir correctamente las notas. . .");
							nota4 = -1;
						} else {
							// OPCIÓN QUE METE CORRECTAMENTE LA SEGUNDA NOTA

						}
					}
				}
			}

		} else {
			// NOTAS QUE HAN SIDO MODIFICADAS
			System.out.print("¿Que nota deseas modificar?");
			System.out.print(" 1: " + nota1 + " 2: " + nota2 + " 3: " + nota3 + " 4: " + nota4);
			int elecc = teclado.nextInt();
			// SE USA UN SWITCH PARA ELEGIR LA NOTA QUE VA A MODIFICARSE
			switch (elecc) {
			case 1: {
				System.out.print("¿Que nota vas a ponerle? ");
				nota1 = teclado.nextInt();
				break;
			}
			case 2: {
				System.out.print("¿Que nota vas a ponerle? ");
				nota2 = teclado.nextInt();
				break;
			}
			case 3: {
				System.out.print("¿Que nota vas a ponerle? ");
				nota3 = teclado.nextInt();
				break;
			}
			case 4: {
				System.out.print("¿Que nota vas a ponerle? ");
				nota4 = teclado.nextInt();
				break;
			}
			default:
				System.out.print("Elejiste no cambiar ninguna nota . . .");
			}
		}
		teclado.close();
	}

	/* CALCULAR NOTA FINAL */
	public double calcularNotaFinal() {
		double notaFinal = 0;
		// COMPROBAMOS QUE LA PERSONA HA ASISTIDO LO SUFICIENTE COMO PARA PODER SER
		// EVALUADO
		calculoDeFaltas();
		if (evaluacion == true) {
			System.out.println("Evaluando . . .");
			// INICIALIZAMOS EL CONTADOR DE NOTAS DEL ALUMNO PARA HACER EL CALCULO
			int contNotas = 0;
			// COMPROBACIÓN DE LAS NOTAS QUE TIENE EL ALUMNO Y SUMAMOS AL CONTEO DE NOTAS
			if (nota1 > 0) {
				notaFinal = notaFinal + nota1;
				contNotas++;
				if (nota2 > 0) {
					notaFinal = notaFinal + nota2;
					contNotas++;
					if (nota3 > 0) {
						notaFinal = notaFinal + nota3;
						contNotas++;
						if (nota4 > 0) {
							notaFinal = notaFinal + nota4;
							contNotas++;
						}
					}
				}
			}
			notaFinal = notaFinal / contNotas;
			System.out.println("Tienes como nota final: " + notaFinal);

		} else { // OPCIÓN SI LA PERSONA TIENE MUCHAS FALTAS
			System.out.println("Tienes muchas faltas, no podemos evaluarte.");
		}

		return notaFinal;
	}

	/* GENERAR REPORTE */
	public void generarReporte() {
		System.out.println("!! Generando reporte de alumno " + Nombre + " !!");
		System.out.println("Total de clases: " + numeroClasesTotales);
		System.out.println("Total de faltas: " + numeroClasesTotales);
		System.out.print("Derecho a evaluación: ");
		// COMPROBAMOS QUE LA PERSONA TIENE O NO DERECHO A EVALUACION
		if (evaluacion == true) {
			System.out.println("sí.");
			int notaFinal = (int) calcularNotaFinal();
			System.out.println("Nota final del alumno: " + notaFinal);
		} else {
			System.out.println("no.");
		}
	}

	/* GENERAR LA ANSIADA PIRÁMIDE */
	public void generarPiramide() {
		// AÑADIMOS LA NOTA FINAL PARA PODER USARLA
		int notaFinal = (int) calcularNotaFinal();
		// COMPROBAMOS SI LA PERSONA TIENE DERECHO A EVALUACION
		if (evaluacion == true) {
			if (notaFinal < 5) {
				// BUCLE QUE USAREMOS PARA VER LA PIRÁMIDE INVERTIDA
				for (int i = 1; i <= notaFinal; i++) {
					for (int k = 1; k <= 1 * i - 1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}

			} else { // SI LA NOTA FINAL ES SUPERIOR A 5

				for (int i = notaFinal; i >= 0; i--) {
					for (int k = 0; k <= notaFinal; k++) {
						System.out.print("*");
					}
					System.out.println("");
					// SOLUCION PONER EN EL BUCLE ANIDADO AL SALIR UN -- Y LISTO
					notaFinal--;
				}
			}

		} else { // OPCIÓN EN EL QUE LA PERSONA NO PUEDE VER LA PIRÁMIDE
			System.out.println("Por no asistir te pierdes una maravillosa pirámide . . .");

		}
	}

}