package TP04;

public class Diario extends Grupo{
	private Grupo Tempo;
	private Grupo Temperatura;
	private Grupo Velocidade;
	private Grupo Moeda;
	private Tempo tempo = new Tempo();
	private Temperatura temp = new Temperatura();
	private Velocidade vel = new Velocidade();
	private Moeda moeda = new Moeda();
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public Diario (int i) {
		valorOrigem = i;
	}
	public void escolha(int i) {
		switch (i) {
			case 1:
				tempo.converter(valorOrigem);
				break;
			case 2:
				temp.converter(valorOrigem);
				break;
			case 3:
				vel.converter(valorOrigem);
				break;
			case 4:
				moeda.converter(valorOrigem);
				break;
		}
	}
}
