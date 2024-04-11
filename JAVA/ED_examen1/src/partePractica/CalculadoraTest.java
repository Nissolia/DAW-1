package partePractica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	/*
	 * PRUEBA DE CAJA BLANCA COMPLETADA CON ÉXITO
	 */
	@Test
	void testSumar() {
		Calculadora c = new Calculadora();

		assertEquals(5, c.sumar(2, 3));
	}

	/*
	 * PRUEBA DE CAJA BLANCA COMPLETADA CON ÉXITO
	 */
	@Test
	void testMultiplicar() {
		Calculadora c = new Calculadora();

		assertEquals(6, c.multiplicar(2, 3));
	}

	/*
	 * PRUEBA DE CAJA BLANCA COMPLETADA CON ÉXITO
	 */
	@Test
	void testDividir() {
		Calculadora c = new Calculadora();

		assertEquals(0.5, c.dividir(4, 8));
	}

	/*
	 * PRUEBA DE CAJA NEGRA RAICES SIMPLES COMPLETADA CON ÉXITO
	 */
	@Test
	void testRaiz1() {
		Calculadora c = new Calculadora();

		assertEquals(0, c.raiz(4, 0));
	}

	@Test
	void testRaiz2() {
		Calculadora c = new Calculadora();

		assertEquals(0, c.raiz(0, 2));
	}

	@Test
	void testRaiz3() {
		Calculadora c = new Calculadora();

		assertEquals(1.1161231740339044, c.raiz(3, 10));
	}

	@Test
	void testRaiz4() {
		Calculadora c = new Calculadora();

		assertEquals(2.449489742783178, c.raiz(6, 2));
	}

	/*
	 * PRUEBA CAJA NEGRA
	 * RAICES DE SEGUNDO GRADO
	 */
	@Test
	void testRaizSegundoGrado1() {
		Calculadora c = new Calculadora();

		c.calcularRaicesSegundoGrado(0, 0, 0);
		assertEquals(0, c.getRaizSegundo1());
		assertEquals(0, c.getRaizSegundo2());
	}

	@Test
	void testRaizSegundoGrado2() {
		Calculadora c = new Calculadora();

		c.calcularRaicesSegundoGrado(-2, -12, -1);
		assertEquals(-23.6619037896906, c.getRaizSegundo1());
		assertEquals(-0.3380962103093985, c.getRaizSegundo2());
	}

	@Test
	void testRaizSegundoGrado3() {
		Calculadora c = new Calculadora();

		c.calcularRaicesSegundoGrado(3, 2, 6);
		assertEquals(0, c.getRaizSegundo1());
		assertEquals(0, c.getRaizSegundo2());
	}

}
