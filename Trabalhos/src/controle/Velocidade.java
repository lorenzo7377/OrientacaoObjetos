package controle;

public class Velocidade {
	private double valorOrigem;
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public void converter(double i) {
		System.out.println(i + " Km/h");
		System.out.println(i / 3.6 + " m/s");
		System.out.println(i / 1.609 + " mi/h");
		System.out.println(i / 1.097 + " ft/s");
	}
}
