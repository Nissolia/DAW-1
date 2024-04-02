package sustito;

import java.util.Scanner;

/*
 * Crear un programa que te permita introducir hasta 10 personas distintas.
 * Menu: Introcudir estudiante Pida por teclado los distintos valores que
 * necesita Introducir profesor Pida por teclado los distintos valores que
 * necesita Introducir trabajador Pida por teclado los distintos valores que
 * necesita Introducir todo por defecto Un array que ya lo tenga todo. Mostrar
 * todo Muestra toda la lista Mostrar trabajadores Mostrar la lista Mostrar
 * profesores Mostrar la lista Mostrar estudiantes Mostrar la lista Mostrar
 * quien gana mas de X Pida por teclado una cantidad y muestre aquellos del
 * array que superen ese cantidad. Salir
 */
public class MainSustito {
	public static void main(String[] args) {
		/* CONSTANTES */
		final int MAX = 10;
		/* INICIO VARIABLES */
		int conteoPersona = 0;
		int elecc;
		Boolean salir = false;
		// INICIALIZACIÓN VARIABLE
		Scanner sc = new Scanner(System.in);
		// Hasta 10 personas diferentes
		Persona[] persona = new Persona[MAX];
		do {
			System.out.println("   MENÚ PRINCIPAL");
			System.out.println("-----------------------------------");
			System.out.println("1) Introducir estudiante.");
			System.out.println("2) Introducir profesor.");
			System.out.println("3) Introducir trabajador.");
			System.out.println("4) Introducir todo por defecto.");
			System.out.println("5) Mostrar todo.");
			System.out.println("6) Mostrar trabajadores.");
			System.out.println("7) Mostrar profesores.");
			System.out.println("8) Mostrar estudiantes.");
			System.out.println("9) Mostrar quien gana más de . . .");
			System.out.println("10) Salir.");
			elecc = sc.nextInt();
			sc.nextLine();
			// Eleccion del manú principal
			switch (elecc) {
			case 1:
				try {
					// Introducir estudiante
					System.out.println("Vamos a introducir los datos del estudiante:");
					System.out.print("Di el nombre: ");
					String nombre = sc.nextLine();
					System.out.print("Di el primer apellido: ");
					String ape1 = sc.nextLine();
					System.out.print("Di el segundo apellido: ");
					String ape2 = sc.nextLine();
					System.out.print("Di el dni: ");
					String dni = sc.nextLine();
					System.out.print("Di el año de nacimiento: ");
					int anio = sc.nextInt();
					System.out.print("Di el mes de nacimiento: ");
					int mes = sc.nextInt();
					System.out.print("Di el dia de nacimiento: ");
					int dia = sc.nextInt();
					System.out.print("Di el teléfono: ");
					int telefono = sc.nextInt();
					sc.nextLine(); // de int a string hay que limpiar el buffer
					System.out.print("Di el email: ");
					String email = sc.nextLine();
					System.out.print("Di el id del estudiante: ");
					int idEstudiante = sc.nextInt();
					System.out.print("Di el grado: ");
					String grado = sc.nextLine();
					System.out.print("Di el curso: ");
					int curso = sc.nextInt();
					System.out.print("Di la nota media: ");
					int notaMedia = sc.nextInt();
					sc.nextLine();
					// añadimos la información recopilada en el array
					persona[conteoPersona] = new Estudiante(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email,
							idEstudiante, grado, curso, notaMedia);
				} catch (Exception e) {
					System.out.println("Has añadido datos de manera incorrecta.");
					conteoPersona--;
				}
				

				break;
			case 2:
				// Introducir profesor
				try {
					System.out.println("Vamos a introducir los datos del profesor:");
					System.out.print("Di el nombre: ");
					String nombre = sc.nextLine();
					System.out.print("Di el primer apellido: ");
					String ape1 = sc.nextLine();
					System.out.print("Di el segundo apellido: ");
					String ape2 = sc.nextLine();
					System.out.print("Di el dni: ");
					String dni = sc.nextLine();
					System.out.print("Di el año de nacimiento: ");
					int anio = sc.nextInt();
					System.out.print("Di el mes de nacimiento: ");
					int mes = sc.nextInt();
					System.out.print("Di el dia de nacimiento: ");
					int dia = sc.nextInt();
					System.out.print("Di el teléfono: ");
					int telefono = sc.nextInt();
					sc.nextLine(); // de int a string hay que limpiar el buffer
					System.out.print("Di el email: ");
					String email = sc.nextLine();
					System.out.print("Di el id del profesor: ");
					int idTrabajador = sc.nextInt();
					System.out.print("Di las horas de trabajo: ");
					int horasTrabajo = sc.nextInt();
					System.out.print("Di las horas extra: ");
					int horasExtra = sc.nextInt();
					System.out.print("Di el sueldo base: ");
					int sueldoBase = sc.nextInt();
					System.out.print("Di la fecha de antiguedad por: año, mes, dia");
					// 
					
					
					
					System.out.print("Di el curso: ");
					int curso = sc.nextInt();
					System.out.print("Di la nota media: ");
					int notaMedia = sc.nextInt();
					sc.nextLine();
					// añadimos la información recopilada en el array
					persona[conteoPersona] = new Profesor(nombre, ape1, ape2, dni, anio, mes, dia, telefono,
							 email,  idTrabajador,  horasTrabajo,  horasExtra,  sueldoBase, antiguedad,
							 departamento,  asignatura,  tutor);
				} catch (Exception e) {
					System.out.println("Has añadido datos de manera incorrecta.");
					conteoPersona--;
				}
				break;
			case 3:
				// Introducir trabajador
				break;
			case 4:
				// Introducir todo por defecto
				break;
			case 5:
				// Mostrar todo
				break;
			case 6:
				// Mostrar trabajadores
				break;
			case 7:
				// Mostrar profesores
				break;
			case 8:
				// Mostrar estudiantes
				break;
			case 9:
				// Mostrar quien gana mas de x dinero
				break;
			case 10:
				System.out.println("Gracias por usar este programa.");
				salir = true;
				break;
			}
			conteoPersona++;
		} while (salir == false);
		sc.close();

	}// Fuera del main
}// Fuera de la clase
