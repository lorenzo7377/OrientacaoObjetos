package TP03;

public class Outros extends Grupo{
	private Grupo Combustivel;
	private Grupo Cozinhar;
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
	public Outros(int i, String string) {
		valorOrigem = i;
		medidaOrigem = string;
	}
}
