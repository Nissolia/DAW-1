package herencia;

public class Comercial extends Empleado {
	// VENTAS * 40
	int ventas;

	public Comercial(String nombre, int edad, int salario, int plus) {
		super(nombre, edad, salario, plus);
		// TODO Auto-generated constructor stub
	}
/*
	/***********************/
	/* GETTERS AND SETTER */
	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	/* MÉTODOS */
	@Override
	public String toString() {
		calcularSalario();
		return "Comercial [ventas=" + ventas + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario
				+ ", plus=" + plus + "]";
	}

	private void calcularSalario() {
		salario = ventas * 40;
		
		if(edad>40 && ventas > 4) {
			salario += plus;
		}
	}

}
