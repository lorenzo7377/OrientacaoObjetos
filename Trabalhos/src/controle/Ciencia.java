package controle;

import modelo.Concentracao;
import modelo.Densidade;

public class Ciencia extends Grupo{
	private double valor;
	
	public Ciencia(double valor2){
		valor = valor2;
	}
	
	public String[] ListarConcentracao() {
		String[] s1 = new String[3];
		s1[0] = String.valueOf(Concentracao.converter1(valor)) + " g/L";
		s1[1] = String.valueOf(Concentracao.converter2(valor)) + "%";
		s1[2] = String.valueOf(Concentracao.converter3(valor)) + " g/mL";
		return s1;
	}
		
	public String[] ListarDensidade() {
		String[] s2 = new String[3];
		s2[0] = String.valueOf(Densidade.converter1(valor)) + " g/cm³";
		s2[1] = String.valueOf(Densidade.converter2(valor)) + " kg/m³";
		s2[2] = String.valueOf(Densidade.converter3(valor)) + " lb/in³";
		return s2;
	}
		
}

