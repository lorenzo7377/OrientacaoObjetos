package TP04;

public class Tempo {
	private double valorOrigem;
	public double getValorOrigem() {
		return valorOrigem;
	}
	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}
	public void converter(double i) {
		int h, m, s;
		System.out.println(i + " s");
		System.out.println(i * 1000 + " ms");
		System.out.println(i / 60 + " min");
		System.out.println(i / 3600 + " h");
		h =(int) i / 3600;
		m = (int) (i % 3600) / 60;
		s = (int) (i % 3600) % 60;
		if(m == 0)
			s = 0;
		System.out.println(h + ":" + m + ":" + s);
	}
	
}
