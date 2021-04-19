package controle;

public class Combustivel {
	private double valorOrigem;
	
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public void converter(double i) {
		System.out.println(i + " Km/l");
		System.out.println(i * 0.6213 + " mi/l");
		System.out.println(i * 100 + " L/100Km");
	}
}
