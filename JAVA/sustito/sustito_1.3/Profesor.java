package sustito;

public class Profesor extends Empleado {

	private Fecha antiguedad;
	private String departamento;
	private String asignatura;
	private Boolean tutor;

	/*****************/
	/* CONSTRUCTORES */
	/*****************/
	public Profesor(String nombre, String ape1, String ape2, String dni, int anio, int mes, int dia, int telefono,
			String email, int idTrabajador, int horasTrabajo, int horasExtra, double sueldoBase, Fecha antiguedad,
			String departamento, String asignatura, Boolean tutor) {
		super(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email, idTrabajador, horasTrabajo, horasExtra,
				sueldoBase);
		// TODO Auto-generated constructor stub
		this.antiguedad = antiguedad;
		this.departamento = departamento;
		this.asignatura = asignatura;
		this.tutor = tutor;
	}
	/*********************/
	/* GETTER AND SETTER */
	/*********************/

	public Fecha getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Fecha antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public Boolean getTutor() {
		return tutor;
	}

	public void setTutor(Boolean tutor) {
		this.tutor = tutor;
	}
	/* MÉTODOS */
	@Override
	public void getSueldoCompleto() {
		// TODO Auto-generated method stub
		super.getSueldoCompleto();
	}

}
