package modelo;

/** Realiza as transformações da medida padrão(quilômetros por litros) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Combustivel {
	
	/** Representa o valor que o usuário inseriu em metros por litros
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em metros por litros
	 */
	public static double converter1(double i) {
		return i * 0.6213;
	}
	
	/** Representa o valor que o usuário inseriu em litros a cada cem quilômetros
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em litros a cada cem quilômetros
	 */
	public static double converter2(double i) {
		return i * 100;
	}

}
