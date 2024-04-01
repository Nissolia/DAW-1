package sustito;

public abstract class Empleado extends Persona {
	/* ATRIBUTOS */
	private int idTrabajador;
	private int horasTrabajo;
	private int horasExtra;
	private double sueldoBase;

	/* CONSTRUCTORES */
	public Empleado(String nombre, String ape1, String ape2, String dni, int anio, int mes, int dia, int telefono,
			String email, int idTrabajador, int horasTrabajo, int horasExtra, double sueldoBase) {
		super(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email);
		this.idTrabajador = idTrabajador;
		this.horasTrabajo = horasTrabajo;
		this.horasExtra = horasExtra;
		this.sueldoBase = sueldoBase;
	}
	/*******************/
	/* GETTER Y SETTER */
	/*******************/
	public int getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public int getHorasTrabajo() {
		return horasTrabajo;
	}

	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	/***********/
	/* MÉTODOS */
	/***********/
	public void getSueldoCompleto() {
	}

}
