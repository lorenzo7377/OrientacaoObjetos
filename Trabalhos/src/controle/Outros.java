package controle;

import modelo.Combustivel;
import modelo.Cozinhar;


public class Outros extends Grupo{
	private double valor;

	public Outros(double valor2){
		valor = valor2;
	}
	
	public String[] ListarCombustivel() {
		String[] s1 = new String[3];
		s1[0] = String.valueOf(Combustivel.converter1(valor)) + " Km/L";
		s1[1] = String.valueOf(Combustivel.converter2(valor)) + " mi/L";
		s1[2] = String.valueOf(Combustivel.converter3(valor)) + " L/100km";
		return s1;
	}
		
	public String[] ListarCozinhar() {
		String[] s2 = new String[3];
		s2[0] = String.valueOf(Cozinhar.converter1(valor)) + " ml";
		s2[1] = String.valueOf(Cozinhar.converter2(valor)) + " colher(es) de chá";
		s2[2] = String.valueOf(Cozinhar.converter3(valor)) + " colher(es) de sopa";
		return s2;
	}
	
}
