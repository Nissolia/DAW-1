package tareaClases_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MisifuTest {

	@Test
	void testestarVivo1() {
		Misifu garfield = new Misifu();
		// SI NO PASA EL TEST SALE EL STRING
		assertTrue(garfield.estarVivo() == true, "El gato esta vivo");
	}
	@Test
	void testestarVivo2() {
		Misifu coco = new Misifu();
		
		coco.setVidas(0);
		 assertFalse(coco.estarVivo(), "El gato esta muerto");
		// assertTrue(coco.estarVivo() == false, "El gato esta vivo");
	}
	
	@Test
	void testestarMaullar1() {
		Misifu coco = new Misifu("Coco");
		
		assertEquals("Miau. . . Miau. . .", coco.maullido());
	}
	@Test
	void testestarMaullar2() {
		Misifu coco = new Misifu("Coco");
		coco.setVidas(0);
		assertEquals("", coco.maullido());
	}

}
