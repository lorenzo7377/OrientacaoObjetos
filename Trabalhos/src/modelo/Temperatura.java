package modelo;

public class Temperatura {
	public static double converter1(double i) {
		//Celsius
		return i;
	}
	public static double converter2(double i) {
		//Fahrenheit
		return (i * 9 / 5)+ 32;
	}
	public static double converter3(double i) {
		//Kelvin
		return i + 273;
	}
}
