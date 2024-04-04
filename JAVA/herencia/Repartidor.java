package herencia;

public class Repartidor extends Empleado{
/* ATRIBUTOS */
	public int entregas;
	public int zona;
	
	/* COSNTRUCTORES */
	public Repartidor(String nombre, int edad, int salario, int plus) {
		super(nombre, edad, salario, plus);
		
	}
	
	// ENTREGAS * 12
	
	/* GETTERS AND SETTERS */
	int getEntregas() {
		return entregas;
	}

	void setEntregas(int entregas) {
		this.entregas = entregas;
	}

	int getZona() {
		return zona;
	}

	void setZona(int zona) {
		this.zona = zona;
	}
	
	/* MÉTODOS */
	public void salarioPlus() {
		
		// REP: mayor de 30 / 2,3 zonas / + 5 entregas
	// COM: mayor 40 / + 4 ventas
	}
}
