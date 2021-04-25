package modelo;

public class Tempo {
	public static double converter1(double i) {
		//segundos
		return i;
	}
	public static double converter2(double i) {
		//milisegundos
		return i * 1000;
	}
	public static double converter3(double i) {
		//minutos
		return i / 60 ;
	}
	public static double converter4(double i) {
		//horas
		return i / 3600 ;
	}
	public static String converter5(double i) {
		//hh:mm:ss
		int h, m, s;
		h =(int) i / 3600;
		m = (int) (i % 3600) / 60;
		s = (int) (i % 3600) % 60;
		if(m == 0)
			s = 0;
		return h + ":" + m + ":" + s;
	}
	
}
