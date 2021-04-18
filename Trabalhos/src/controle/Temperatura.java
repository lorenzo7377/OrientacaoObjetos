package controle;

public class Temperatura {
	private double valorOrigem;
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
public void converter(double i) {
	System.out.println(i + " °C");
	System.out.println(((i * 9 / 5)+ 32) + " °F");
	System.out.println((i + 273) + " °K");
	}
}
