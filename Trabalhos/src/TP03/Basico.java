package TP03;

public class Basico extends Grupo{
	private Grupo Volume;
	private Grupo Area;
	private Grupo COmprimento;
	private Grupo Peso;
	public Basico(int i, String string) {
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
