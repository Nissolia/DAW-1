package Interfaces_ej01;

//Definición de la clase Socio
class Socios01 implements Comparable<Socio> {
	int id_socio;
	String nombre;
	double cuenta;

	// Constructor
	public Socios01(int id_socio, String nombre, double cuenta) {
		this.id_socio = id_socio;
		this.nombre = nombre;
		this.cuenta = cuenta;
	}

	// Método para imprimir la información del socio
	public String toString() {
		return "ID Socio: " + id_socio + ", Nombre: " + nombre + ", Cuenta: " + cuenta;
	}

	// Método compareTo para comparar socios por ID de socio
	public int compareTo(Socio otroSocio) {
		return Integer.compare(this.id_socio, otroSocio.id_socio);
	}

	public void CasetaLosHartibles() {

		// Crear array de socios
		Socio[] socios = new Socio[3];
		socios[0] = new Socio(1, "Juan", 50.0);
		socios[1] = new Socio(2, "María", 30.0);
		socios[2] = new Socio(3, "Pedro", 20.0);

		// Mostrar socios sin ordenar
		System.out.println("Socios sin ordenar:");
		for (Socio socio : socios) {
			System.out.println(socio);
		}

		// Ordenar socios por ID de socio (Bubble Sort)
		for (int i = 0; i < socios.length - 1; i++) {
			for (int j = 0; j < socios.length - i - 1; j++) {
				if (socios[j].id_socio > socios[j + 1].id_socio) {
					Socio temp = socios[j];
					socios[j] = socios[j + 1];
					socios[j + 1] = temp;
				}
			}
		}

		// Mostrar socios ordenados por ID de socio
		System.out.println("\nSocios ordenados por ID de socio:");
		for (Socio socio : socios) {
			System.out.println(socio);
		}
	}
}
