package modelo;

/** Realiza as transformações da medida padrão(metro cúbico) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Volume {

	/** Representa o valor que o usuário inseriu em centímetros cúbicos
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em centímetros cúbicos
	 */
	public static double converter1(double i) {
		//centímetros cúbicos
		return i * 1000000;
	}
	
	/** Representa o valor que o usuário inseriu em litros
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em litros
	 */
	public static double converter2(double i) {
		return i * 1000;
	}
	
	/** Representa o valor que o usuário inseriu em mililitros
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em mililitros
	 */
	public static double converter3(double i) {
		return i * 1000000 ;
	}
}
