package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.Basico;


class TesteBasico {
	
	Basico b = new Basico(0);
	@Test
	void testListarComp() {
		String[] lista = new String[7];
		lista[0] = "0.0 metros";
		lista[1] = "0.0 centímetros";
		lista[2] = "0.0 milímetros";
		lista[3] = "0.0 quilômetros";
		lista[4] = "0.0 pés";
		lista[5] = "0.0 polegadas";
		lista[6] = "0.0 milhas";

		assertArrayEquals(lista , b.ListarComp());
	}
	}
