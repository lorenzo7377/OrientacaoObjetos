package TP03;

public class Diario extends Grupo{
	private Grupo Tempo;
	private Grupo Temperatura;
	private Grupo Velocidade;
	private Grupo Moeda;
	
	public double getValorOrigem() {
		return valorOrigem;
	}

	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}

	public String getMedidaOrigem() {
		return medidaOrigem;
	}

	public void setMedidaOrigem(String medidaOrigem) {
		this.medidaOrigem = medidaOrigem;
	}
	public Diario (int i, String string) {
		valorOrigem = i;
		medidaOrigem = string;
	}
}
