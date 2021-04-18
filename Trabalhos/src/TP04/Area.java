package TP04;

public class Area {
	private double valorOrigem;
	
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public void converter(double i) {
		System.out.println(i + " m²");
		System.out.println(i * 10000 + " cm²");
		if(i / 4047 < 1)
			System.out.println(i / 0.4047 + " * 10⁻⁵ A");
		else
			System.out.println(i / 4047 + " Acre(s)");
	}
}
