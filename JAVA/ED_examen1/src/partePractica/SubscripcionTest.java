package partePractica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscripcionTest {

	@Test
	void testPrecioPorMes() {
		Subscripcion sub = new Subscripcion(12, 10);

		assertEquals(2.0, sub.precioPorMes());

	}

	@Test
	void testCancel() {
		Subscripcion sub = new Subscripcion(12, 10);

		sub.cancel();
		System.out.println(sub.toString());

	}

}
