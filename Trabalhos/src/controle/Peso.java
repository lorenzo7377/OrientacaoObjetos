package controle;

public class Peso {
	private double valorOrigem;
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public void converter(double i) {
		System.out.println(i + " g");
		System.out.println(i / 1000 + " Kg");
		System.out.println(i * 1000 + " mg");
		if(i / 1000000 < 1)
			System.out.println(i + " * 10⁻⁶ ton");
		else
			System.out.println(i / 1000000 + " ton");
		if(i / 454 < 1)
			System.out.println(i / 0.454 + " * 10⁻³ lb");
		else
			System.out.println(i / 454 + " lb");
		
	}
}
