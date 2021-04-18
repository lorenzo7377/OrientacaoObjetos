package TP04;

public class Moeda {
	private double valorOrigem;
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
public void converter(double i) {
		System.out.println(i + " reais");
		System.out.println(i * 0.18 + " reais");
		System.out.println(i * 0.13 + " reais");
		System.out.println(i * 0.15 + " reais");
	}
	
}
