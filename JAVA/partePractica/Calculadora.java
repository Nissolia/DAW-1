package partePractica;

public class Calculadora {
	/**
	 * <h1>Clase calculadora</h1>
	 * 
	 * @author NoeliaBanios
	 * @version 1.0
	 * @since 20240222
	 */
	private double raizSegundo1;
	private double raizSegundo2;

	/* GETTER Y SETTERS */
	public double getRaizSegundo1() {
		return raizSegundo1;
	}

	public void setRaizSegundo1(double raizSegundo1) {
		this.raizSegundo1 = raizSegundo1;
	}

	public double getRaizSegundo2() {
		return raizSegundo2;
	}

	public void setRaizSegundo2(double raizSegundo2) {
		this.raizSegundo2 = raizSegundo2;
	}

	/*****************/
	/* MÉTODOS */
	/*****************/
	/**
	 * 
	 * @param double a
	 * @param double b
	 * @return double
	 */
	public double sumar(double a, double b) {

		double sol = 0;

		if (a > 0 && b > 0) {
			sol = a + b;
		}
		return sol;
	}

	/**
	 * 
	 * @param double a
	 * @param double b
	 * @return double
	 */
	public double multiplicar(double a, double b) {
		return a * b;
	}

	/**
	 * Solo hace la división si b es mayor que a.
	 * 
	 * @param double a
	 * @param double b
	 * @return double
	 */
	public double dividir(double a, double b) {
		double solucion = 0;

		if (b != 0) {
			solucion = a / b;
		}
		return solucion;
	}

	/**
	 * No hace la raíz cuadrada si b es igual a 0, 2 o menor que 0.
	 * 
	 * CAJA NEGRA
	 * 
	 * @param double a
	 * @param double b
	 * @return double
	 */
	public double raiz(double a, int b) {
		double solucion = 0;

		if (b == 0) {
			System.out.println("Eso no existe.");
		} else if (b == 2) {
			if (a < 0) {
				System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo");
			} else {
				solucion = Math.sqrt(a);
			}
		} else {
			solucion = Math.pow(a, (((double) 1) / b));
		}
		return solucion;
	}

	/**
	 * Lo hemos puesto en un void para poder tratar las dos variables CAJA NEGRA
	 * 
	 * @param int a
	 * @param int b
	 * @param int c 
	 */
	public void calcularRaicesSegundoGrado(int a, int b, int c) {

		double discriminante = Math.pow(b, 2) - (4 * a * c);

		if (discriminante < 0) {
			setRaizSegundo1(0);
			setRaizSegundo2(0);

			System.out.println("El polinomio no tiene solución real.");

		} else if (discriminante == 0) {
			setRaizSegundo2(0);
			double aux1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
			setRaizSegundo1(aux1);

		} else {
			double aux2 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
			setRaizSegundo1(aux2);
			double aux3 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
			setRaizSegundo2(aux3);
		}
	}
}
