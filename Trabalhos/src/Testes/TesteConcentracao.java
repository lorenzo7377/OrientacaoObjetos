package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import modelo.Concentracao;

class TesteConcentracao {;

	@Test
	void testConverter1() {
		assertEquals(0.1,Concentracao.converter1(1));
	}

	@Test
	void testConverter2() {
		assertEquals(0.001,Concentracao.converter2(1));
	}


}
