package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Comprimento;

class TesteComprimento {

	@Test
	void testConverter1() {
		assertEquals(1000,Comprimento.converter1(1000));
	}

	@Test
	void testConverter2() {
		assertEquals(100000,Comprimento.converter2(1000));
	}

	@Test
	void testConverter3() {
		assertEquals(1000000,Comprimento.converter3(1000));
	}

	@Test
	void testConverter4() {
		assertEquals(1,Comprimento.converter4(1000));
	}

	@Test
	void testConverter5() {
		assertEquals(3281,Comprimento.converter5(1000));
	}

	@Test
	void testConverter6() {
		assertEquals(39370,Comprimento.converter6(1000));
	}

	@Test
	void testConverter7() {
		assertEquals(0.6215040397762586,Comprimento.converter7(1000));
	}

}
