package modelo;

/** Realiza as transformações da medida padrão (gramas) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Peso {
	
	/** Representa o valor que o usuário inseriu em quilôgramas
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em quilôgramas
	 */
	public static double converter1(double i) {
		return i / 1000;
	}
	
	/** Representa o valor que o usuário inseriu em miligramas
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em miligramas
	 */
	public static double converter2(double i) {
		return i * 1000 ;
	}
	
	/** Representa o valor que o usuário inseriu em toneladas
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em toneladas
	 */
	public static double converter3(double i) {
		return i / 1000000;
	}
	
	/** Representa o valor que o usuário inseriu em libras
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em libras
	 */
	public static double converter4(double i) {
		return (i / 454) ;
	}
}