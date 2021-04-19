package modelo;

import controle.Combustivel;
import controle.Cozinhar;
import controle.Grupo;

public class Outros extends Grupo{
	private Cozinhar coz = new Cozinhar();
	private Combustivel comb = new Combustivel ();
	public double getValorOrigem() {
		return valorOrigem;
	}

	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}

	public Outros(double i) {
		valorOrigem = i;
	}
	public void escolha(int i) {
		switch (i) {
			case 1:
				coz.converter(valorOrigem);
				break;
			case 2:
				comb.converter(valorOrigem);
				break;	
		}
	}
}
