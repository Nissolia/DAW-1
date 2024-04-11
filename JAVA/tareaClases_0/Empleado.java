package tareaClases_0;

public class Empleado {

	/*************/
	/* ATRIBUTOS */
	/*************/
	private String Nombre;
	private String Apellido;
	private double salario;

	/*****************/
	/* CONSTRUCTORES */
	/*****************/
	public Empleado(double salario) {
		this.Nombre = "Pepito";
		this.Apellido = "García";
		this.salario = salario;
	}

	public Empleado(String nombre, String apellido) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.salario = 15.000;
	}

	public Empleado(String nombre, String apellido, double salario) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.salario = salario;
	}

	/*********************/
	/* GETTERS Y SETTERS */
	/*********************/

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/***********/
	/* MÉTODOS */
	/***********/

	// DEVUELVE EL NOMBRE Y EL APELLIDO CONCATENADO
	public String getNombreCompleto(String nombre, String apellido) {
		String completo = "";
		completo = nombre + " " + apellido;

		return completo;
	}

	// SE CALCULA SOBRE LA RENTA QUE EL EMPLEADO HA DE PAGAR
	public double calcularImpuestos() {
		double impuesto = 0.19;

		impuesto = salario * impuesto;
		impuesto = salario - impuesto;

		return impuesto;
	}

	// CONSULTAMOS EL NETO DEL EMPLEADO
	public double consultarSalarioNeto() {
		double neto;

		double impuestos = calcularImpuestos();

		salario = salario * 0.12;
		neto = impuestos - salario ; // RESTAMOS LOS IMPUESTOS AÑADIDOS

		return neto;
	}

	// SE LE AÑADE LA CANTIDAD SI ES SUPERIOR A 500
	public void cobrarSobre(int cantidad) {
		if (cantidad > 499) {
			salario += cantidad;
			System.out.println("El sueldo del empleado ha pasado a ser: " + salario);
		} else {
			System.out.println("No se ha aumentado el sueldo del empleado.");
		}
	}

	// APLICAMOS EL INCREMENTO ANUAL QUE
	public boolean aplicarIncrementoAnual(double descuento) { // PARA HACER LAS PRUEBAS SE HA AÑADIDO EL DESCUENTO
		// BOOLEANO DE TRUE Y FALSE PARA VER SI INCREMENTAMOS
		boolean incrementar = false;
		// AÑADIMOS EL DESCUENTO PARA EL INCREMENTO ANUAL
		double sueldoNeto = consultarSalarioNeto();
		// HACEMOS EL CALCULO QUE NECESITAMOS
		if (descuento > 0.00 && descuento < 101) {
			incrementar = true;
			// CALCULO PARA LA INCREMENTACIÓN DEL SUELDO
			double sueldoIncrementado = sueldoNeto * descuento;
			System.out.println("Sueldo incrementado: " + sueldoIncrementado);
		}else {
			System.out.println("Tu sueldo no ha sido incrementado.");
		}

		return incrementar;
	}

	// OBTENER LA CATEGORÍA DEL SALARIO
	public String obtenerCategoriaSalario() {
		String categoria = "";
		// USAMOS ESTE MÉTODO PARA CONSULTAR EL NETO Y HACER LOS CALCULOS
		double sueldoNeto = consultarSalarioNeto();
		// CREAMOS LAS CATEGORÍAS
		if (sueldoNeto <= 1500) {
			categoria = "bajo";
		}else if(sueldoNeto >= 5000) {
			categoria = "alto";
		}else {
			categoria = "medio";
		}

		return categoria;
	}

}
