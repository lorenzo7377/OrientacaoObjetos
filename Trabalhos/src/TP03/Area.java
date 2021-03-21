package TP03;

public class Area {
	private double valorOrigem;
	private String medidaOrigem;
	public Area(int i, String string) {
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
