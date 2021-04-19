package controle;

public class Comprimento {
	private double valorOrigem;
	
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	
	public void converter(double i) {
		System.out.println(i + " m");
		System.out.println(i * 100 + " cm");
		System.out.println(i * 1000 + " mm");
		System.out.println(i / 1000 + " km");
		System.out.println((i * 39.37) + " inchs");
		if(i / 1609 < 1)
			System.out.println((i / 0.01609) + " * 10⁻⁵ mi");
		else
			System.out.println((i / 1609) + " mi");
	}
	
}
