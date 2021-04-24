package modelo;

public class Peso {
	public static double converter1(double i) {
		//gramas
		return i;
	}
	public static double converter2(double i) {
		//quilôgramas
		return i / 1000;
	}
	public static double converter3(double i) {
		//miligramas
		return i * 1000 ;
	}
	
	public static double converter4(double i) {
		//toneladas
		return i / 1000000;
	}
	public static double converter5(double i) {
		//libras
		if(i / 454 < 1)
			return (i / 0.454) ;
		else
			return (i / 454) ;
	
	}
	
}
