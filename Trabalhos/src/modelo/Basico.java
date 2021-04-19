package modelo;

import controle.Area;
import controle.Comprimento;
import controle.Grupo;
import controle.Peso;
import controle.Volume;

public class Basico extends Grupo{
	private Comprimento c = new Comprimento();
	private Area a = new Area();
	private Volume v = new Volume();
	private Peso p = new Peso();
	public Basico(double i) {
		valorOrigem = i;
	}

	public void escolha(int i) {
		switch (i) {
			case 1:
				c.converter(valorOrigem);
				break;
			case 2:
				a.converter(valorOrigem);
				break;
			case 3:
				v.converter(valorOrigem);
				break;
			case 4:
				p.converter(valorOrigem);
				break;
		}
	}
	
}


