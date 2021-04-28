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
	
	@Test
	void testListarArea() {
		String[] lista2 = new String[3];
		lista2[0] = "0.0 metros quadrados";
		lista2[1] = "0.0 centímetros quadrados";
		lista2[2] = "0.0 acres";
		
		assertArrayEquals(lista2 , b.ListarArea());
	}
	
	@Test
	void testListarPeso() {
		String[] lista3 = new String[5];
		lista3[0] = "0.0 gramas";
		lista3[1] = "0.0 quilôgramas";
		lista3[2] = "0.0 miligramas";
		lista3[3] = "0.0 toneladas";
		lista3[4] = "0.0 libras";
		
		assertArrayEquals(lista3 , b.ListarPeso());
	}
	
	@Test
	void testListarVolume() {
		String[] lista4 = new String[4];
		lista4[0] = "0.0 metros cúbicos";
		lista4[1] = "0.0 centímetros cúbicos";
		lista4[2] = "0.0 litros";
		lista4[3] = "0.0 mililitros";
		
		assertArrayEquals(lista4 , b.ListarVolume());
	}
}