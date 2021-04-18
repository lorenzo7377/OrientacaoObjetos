package controle;

public class Densidade {
	private double valorOrigem;
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public void converter(double i) {
		System.out.println(i + " g/cm³");
		System.out.println(i * 1000 + "Kg/m³");//0,036127
		if(i / 27.68 < 1)
			System.out.println(i / 0.2768 + " * 10⁻² lb/in³");
		else
			System.out.println(i / 27.68 + " lb/in³");
	}
	
}
