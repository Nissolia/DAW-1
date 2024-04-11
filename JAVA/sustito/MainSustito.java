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
		Persona[] lista = new Persona[MAX];
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
					lista[conteoPersona] = new Estudiante(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email,
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
					System.out.print("Di la fecha de nacimiento por: año, mes, dia: ");
					int anio = sc.nextInt();
					int mes = sc.nextInt();
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
					int anioAnt = sc.nextInt();
					int mesAnt = sc.nextInt();
					int diaAnt = sc.nextInt();
					sc.nextLine();
					System.out.print("Di el departamento: ");
					String departamento = sc.nextLine();
					System.out.print("Di la asignatura: ");
					String asignatura = sc.nextLine();
					System.out.print("¿Es tutor de algun curso?  s/n  ");
					String sino = sc.nextLine();
					sino = sino.toLowerCase();
					Boolean tutor = false;
					if (sino.equals("s")) {
						tutor = true;
					}
					// añadimos la información recopilada en el array
					lista[conteoPersona] = new Profesor(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email,
							idTrabajador, horasTrabajo, horasExtra, sueldoBase, new Fecha(anioAnt, mesAnt, diaAnt),
							departamento, asignatura, tutor);
				} catch (Exception e) {
					System.out.println("Has añadido datos de manera incorrecta.");
					conteoPersona--;
				}
				break;
			case 3:
				try {

					// Introducir trabajador
					System.out.println("Vamos a introducir los datos del trabajador:");
					System.out.print("Di el nombre: ");
					String nombre = sc.nextLine();
					System.out.print("Di el primer apellido: ");
					String ape1 = sc.nextLine();
					System.out.print("Di el segundo apellido: ");
					String ape2 = sc.nextLine();
					System.out.print("Di el dni: ");
					String dni = sc.nextLine();
					System.out.print("Di la fecha de nacimiento por: año, mes, dia: ");
					int anio = sc.nextInt();
					int mes = sc.nextInt();
					int dia = sc.nextInt();
					System.out.print("Di el teléfono: ");
					int telefono = sc.nextInt();
					sc.nextLine(); // de int a string hay que limpiar el buffer
					System.out.print("Di el email: ");
					String email = sc.nextLine();
					System.out.print("Di el id del trabajador: ");
					int idTrabajador = sc.nextInt();
					System.out.print("Di las horas de trabajo: ");
					int horasTrabajo = sc.nextInt();
					System.out.print("Di las horas extra: ");
					int horasExtra = sc.nextInt();
					System.out.print("Di el sueldo base: ");
					int sueldoBase = sc.nextInt();
					sc.nextLine();
					System.out.print("Di el area de trabajo.");
					System.out.println(
							"Las areas son: administración, enfermería, limpieza, seguridad y mantenimiento. ");
					String area = sc.nextLine();
					// introducimos los datos en el array
					lista[conteoPersona] = new Trabajador(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email,
							idTrabajador, horasTrabajo, horasExtra, sueldoBase, area);
				} catch (Exception e) {
					System.out.println("Has añadido datos de manera incorrecta.");
					conteoPersona--;
				}
				break;
			case 4:
				// Introducir todo por defecto
				// for aleatorio y luego funciones aleatorias para meter nombres y etc etc
				for (int i = 0; i < 7; i++) {

					int aleatorio = (int) (Math.random() * 3);
					switch (aleatorio) {
					case 0:
						lista[i] = crearEstudiante();
						break;
					case 1:
						lista[i] = crearProfesor();
						break;
					case 2:
						lista[i] = crearEmleado();
						break;

					default:
						break;
					}
				}

				break;
			case 5:
				// Mostrar todo
				for (int i = 0; i < conteoPersona++; i++) {
					System.out.println(lista[i]);
				}
				break;
			case 6:
				// Mostrar trabajadores
				for (int i = 0; i < conteoPersona++; i++) {
					if (lista[i].getClass().getSimpleName().equals("Trabajador")) {
						System.out.println(lista[i]);
					}
					// lista[i] instanceof "Trabajador"; -- ver como funciona
				}
				break;
			case 7:
				// Mostrar profesores
				for (int i = 0; i < conteoPersona++; i++) {
					if (lista[i].getClass().getSimpleName().equals("Profesor")) {
						System.out.println(lista[i]);
					}
				}

				break;
			case 8:
				// Mostrar estudiantes
				for (int i = 0; i < conteoPersona++; i++) {
					if (lista[i].getClass().getSimpleName().equals("Estudiante")) {
						System.out.println(lista[i]);
					}
				}
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

	private static Persona crearEstudiante() {
		// TODO Auto-generated method stub
		int ale1;
		// empezamos a aleatorizar las cosas
		ale1 = (int) (Math.random() * 6);
		int ale2 =(int) (Math.random() * 6);
		int ale3 = (int) (Math.random() * 6);
		// metemos los datos personales en una de tres dimensiones para no tener que hacer 3 arrays diferentes
		String[][][] datosPersonales = {
			    {{"María", "José", "Ana", "Juan", "Isabel", "Antonio"}, 
			     {"García", "Fernández", "López", "Martínez", "González", "Rodríguez"}, 
			     {"Martín", "Pérez", "Sánchez", "Romero", "Suárez", "Díaz"}},
			    {{"Luisa", "Manuel", "Elena", "Carlos", "Sofía", "David"}, 
			     {"Hernández", "Gómez", "Pérez", "Gutiérrez", "Muñoz", "Ruiz"}, 
			     {"Fernández", "Sánchez", "Díaz", "Martínez", "López", "González"}}
			};
	    // Acceder a los datos correspondientes según los índices aleatorios
	    String nombre = datosPersonales[ale1][0][ale2];
	    String ape1 = datosPersonales[ale1][1][ale3];
	    // Se corrige el acceso a la segunda dimensión para ape2
	    String ape2 = datosPersonales[ale1][2][ale3];


		return new Estudiante(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email, idEstudiante, grado, curso,
				notaMedia);

	}

	private static Persona crearProfesor() {
		// TODO Auto-generated method stub
		return new Profesor(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email, idTrabajador, horasTrabajo,
				horasExtra, sueldoBase, new Fecha(anioAnt, mesAnt, diaAnt), departamento, asignatura, tutor);

	}

	private static Persona crearEmleado() {
		// TODO Auto-generated method stub
		return new Trabajador(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email, idTrabajador, horasTrabajo,
				horasExtra, sueldoBase, area);
	}
}// Fuera de la clase
