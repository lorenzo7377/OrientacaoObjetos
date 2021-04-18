package modelo;

import controle.Concentracao;
import controle.Densidade;
import controle.Grupo;

public class Ciencia extends Grupo{
	private Concentracao c = new Concentracao();
	private Densidade d = new Densidade();
	public double getValorOrigem() {
		return valorOrigem;
	}
	public Ciencia(double i) {
		valorOrigem = i;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public void escolha(int i) {
		switch (i) {
			case 1:
				c.converter(valorOrigem);
				break;
			case 2:
				d.converter(valorOrigem);
				break;	
		}
	}
}

