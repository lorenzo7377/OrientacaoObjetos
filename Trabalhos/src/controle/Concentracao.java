package controle;

public class Concentracao {
	private double valorOrigem;
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public void converter(double i) {
		System.out.println(i + " g/l");
		System.out.println(i / 10 + "%");
		System.out.println(i / 1000 + " mg/l");
	}
}
