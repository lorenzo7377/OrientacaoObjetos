package modelo;

/** Realiza as transformações da medida padrão (metros) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Comprimento {

	/** Representa o valor que o usuário inseriu em centímetros
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em centímetros
	 */
	public static double converter1(double i) {
		return i * 100;
	}
	
	/** Representa o valor que o usuário inseriu em milímetros
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em milímetros
	 */
	public static double converter2(double i) {
		return i * 1000 ;
	}
	
	/** Representa o valor que o usuário inseriu em quilômetros
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em quilômetros
	 */
	public static double converter3(double i) {
		return i / 1000 ;
	}
	
	/** Representa o valor que o usuário inseriu em pés
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em pés
	 */
	public static double converter4(double i) {
		return (i * 3.281) ;
	}
	
	/** Representa o valor que o usuário inseriu em polegadas
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em polegadas
	 */
	public static double converter5(double i) {
		return (i * 39.37) ;
	}
	
	/** Representa o valor que o usuário inseriu em milhas
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em milhas
	 */
	public static double converter6(double i) {
		return (i / 1609) ;
	}
}
