package modelo;

/** Realiza as transformações da medida padrão(metros quadrados) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Area {
	
	/** Representa o valor que o usuário inseriu em centímetros quadrados
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em centímetros quadrados
	 */
	public static double converter1(double i) {
		return i * 10000 ;
	}
	
	/** Representa o valor que o usuário inseriu em acres
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em acres
	 */
	public static double converter2(double i) {
			return i / 4047 ;
}
}
