package TP03;

public class Concentracao {
	private double valorOrigem;
	private String medidaOrigem;
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
	public Concentracao(int i, String string) {
		valorOrigem = i;
		medidaOrigem = string;
	}
}
