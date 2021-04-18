package controle;

public class Volume {
	private double valorOrigem;
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public void converter(double i) {
		System.out.println(i + " m³");
		System.out.println(i * 1000000 + " cm³");
		System.out.println(i + " L");
		System.out.println(i * 1000 + " mL");
	}
}
