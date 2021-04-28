package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import modelo.Concentracao;

class TesteConcentracao {;
	
	@Test
	void testConverter1() {
		assertEquals(1,Concentracao.converter1(1));
	}

	@Test
	void testConverter2() {
		assertEquals(0.1,Concentracao.converter2(1));
	}

	@Test
	void testConverter3() {
		assertEquals(0.01,Concentracao.converter3(1));
	}


}
