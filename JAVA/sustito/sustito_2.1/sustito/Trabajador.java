package sustito;

public class Trabajador extends Empleado {
	/* ATRIBUTOS */
	private String area;

	/* CONSTRUCTOR */
	public Trabajador(String nombre, String ape1, String ape2, String dni, int anio, int mes, int dia, int telefono,
			String email, int idTrabajador, int horasTrabajo, int horasExtra, double sueldoBase, String area) {
		super(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email, idTrabajador, horasTrabajo, horasExtra,
				sueldoBase);
		// TODO Auto-generated constructor stub
		this.area = area;
	}

	/*******************/
	/* GETTER Y SETTER */
	/*******************/
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public void getSueldoCompleto() {
		// TODO Auto-generated method stub
		if ("limpieza" == area.toLowerCase()) {
			setHorasExtra(11);
		}else if(("administracion" == area.toLowerCase())||("administración" == area.toLowerCase())||("enfermería" == area.toLowerCase())||("enfermeria" == area.toLowerCase())) {
			setHorasExtra(15);
		}else {
			System.out.println("No tienes ningún extra.");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
