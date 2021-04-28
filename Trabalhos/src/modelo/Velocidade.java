package modelo;

/** Realiza as transformações da medida padrão(quilômetros por horas) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Velocidade {
	
	/** Representa o valor que o usuário inseriu em quilômetros por horas
	 * @param i valor inteiro inserido pelo usuário
	 * @return o mesmo valor entrado, ou seja, a variável i
	 */
	public static double converter1(double i) {
		return i;
	}
	
	/** Representa o valor que o usuário inseriu em metros por segundo
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em metros por segundo
	 */
	public static double converter2(double i) {
		return i / 3.6;
	}
	
	/** Representa o valor que o usuário inseriu em milhas por horas
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em milhas por horas
	 */
	public static double converter3(double i) {
		return i / 1.609 ;
	}
	
	/** Representa o valor que o usuário inseriu em pés por segundos
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em pés por segundos
	 */
	public static double converter4(double i) {
		return i / 1.097;
	}
}
