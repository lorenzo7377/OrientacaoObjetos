package TP04;

public class Cozinhar {
	private double valorOrigem;
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public void converter(double i) {
		System.out.println(i + " ml");
		System.out.println(i / 5 + " colher(es) de chá");
		System.out.println(i / 15 + " colher(es) de sopa");
	}
}
