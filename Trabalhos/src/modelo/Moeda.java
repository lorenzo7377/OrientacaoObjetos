package modelo;

/** Realiza as transformações da medida padrão (reais) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Moeda {
	
	/** Representa o valor que o usuário inseriu em dólares
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em dólar
	 */
	public static double converter1(double i) {
		return i * 0.18;
	}
	
	/** Representa o valor que o usuário inseriu em libras esterlinas
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em libras esterlinas
	 */
	public static double converter2(double i) {
		return i * 0.13;
	}
	
	/** Representa o valor que o usuário inseriu em euros
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em euros
	 */
	public static double converter3(double i) {
		return i * 0.15;
	}
	
}