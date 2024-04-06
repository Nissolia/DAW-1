package tareas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTest {

	@Test // COMPLETADO
	void nombreCompleto() {
		Empleado e = new Empleado("Pepe", "Pérez");

		assertEquals("Pepe Pérez", e.getNombreCompleto("Pepe", "Pérez"));
	}

	@Test // COMPLETADO
	void calculoImpuesto() {
		Empleado e = new Empleado(20000);

		assertEquals(16200.0, e.calcularImpuestos());
	}

	@Test // COMPLETADO
	void salarioNeto() {
		Empleado e = new Empleado(20000);

		assertEquals(13800.0, e.consultarSalarioNeto());
	}

	@Test // COMPLETADO
	void cantidadSobre1() {
		Empleado e = new Empleado(20000);

		e.cobrarSobre(20);
		System.out.println(e.getSalario()); // NO SUBE EL SUELDO
	}

	@Test // COMPLETADO
	void cantidadSobre2() {
		Empleado e = new Empleado(20000);

		e.cobrarSobre(500);
		System.out.println(e.getSalario()); // SI SUBE EL SUELDO
	}

	/**************************/
	/* PRUEBAS QUE CAJA NEGRA */
	/**************************/
	@Test // COMPLETADO, SUELDO NO INCREMENTADO
	void aplicarIncrementoAnual1() {
		Empleado e = new Empleado(3000);

		assertFalse(e.aplicarIncrementoAnual(101));

	}

	@Test // COMPLETADO, SUELDO NO INCREMENTADO
	void aplicarIncrementoAnual2() {
		Empleado e = new Empleado(3000);

		assertFalse(e.aplicarIncrementoAnual(0));

	}

	@Test // COMPLETADO, SUELDO INCREMENTADO
	void aplicarIncrementoAnual3() {
		Empleado e = new Empleado(3000);

		assertTrue(e.aplicarIncrementoAnual(80));
	}
	/**************************/
	/* PRUEBAS QUE CAJA NEGRA */
	/**************************/

	@Test // COMPLETADO SALARIO BAJO
	void categoriaSalarioBajo() {
		Empleado e = new Empleado(1500);

		assertEquals("bajo", e.obtenerCategoriaSalario());
	}

	@Test // COMPLETADO SALARIO MEDIO
	void categoriaSalarioMedio() {
		Empleado e = new Empleado(3000);

		assertEquals("medio", e.obtenerCategoriaSalario());
	}

	@Test // COMPLETADO SALARIO ALTO
	void categoriaSalarioAlto() {
		Empleado e = new Empleado(50000);

		assertEquals("alto", e.obtenerCategoriaSalario());
	}
}
