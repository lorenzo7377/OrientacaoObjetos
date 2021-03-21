package TP03;

public class Ciencia extends Grupo{
	private Grupo Concentracao;
	private Grupo Densidade;
	public Ciencia(int i, String string) {
		valorOrigem = i;
		medidaOrigem = string;
	}

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
}
