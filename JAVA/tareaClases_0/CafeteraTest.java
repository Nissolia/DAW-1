package tareaClases_0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CafeteraTest {

	@Test
	void llenarCafetera1() {
		Cafetera c = new Cafetera(100); // ACTUAL
		int llena = c.llenarCafetera();

		assertEquals(100, llena);

	}

	@Test
	void servirTaza1() {
		Cafetera c = new Cafetera(100, 50); // MAX, ACTUAL
		
		int actual = c.servirTaza(10);
		assertEquals(40 ,actual);
	}
	
	@Test
	void servirTaza2() {
		Cafetera c = new Cafetera(100, 20); // MAX, ACTUAL
		
		int actual = c.servirTaza(40);
		assertEquals(-20 ,actual);
	}
	
	@Test
	void vaciarCafetera1() {
		Cafetera c = new Cafetera(10); // MAX, ACTUAL
		
		int vaciado = c.vaciarCafetera();
		assertEquals(0, vaciado);
	}
	
	@Test
	void agregarCafe1() {
		Cafetera c = new Cafetera(50,0); // MAX, ACTUAL
		
		int llenado = c.agregarCafe(20);
		assertEquals(20, llenado);
	}
	
	@Test
	void agregarCafe2() {
		Cafetera c = new Cafetera(50,0); // MAX, ACTUAL
		
		int llenado = c.agregarCafe(60);
		assertEquals(llenado, 60);
	}

}
