package modelo;

/** Realiza as transformações da medida padrão(Celsius) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Temperatura {
	
	/** Representa o valor que o usuário inseriu em celsius
	 * @param i valor inteiro inserido pelo usuário
	 * @return o mesmo valor entrado, ou seja, a variável i
	 */
	public static double converter1(double i) {
		return i;
	}
	
	/** Representa o valor que o usuário inseriu em fahrenheits
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em fahrenheit
	 */
	public static double converter2(double i) {
		return (i * 9 / 5)+ 32;
	}
	
	/** Representa o valor que o usuário inseriu em kelvins
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em kelvin
	 */
	public static double converter3(double i) {
		return i + 273;
	}
}
