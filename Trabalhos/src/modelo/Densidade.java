package modelo;

/** Realiza as transformações da medida padrão (grama por centímetro cúbico) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */


public class Densidade {
	
	/** Representa o valor que o usuário inseriu em quilôgramas por metros cúbicos
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em quilôgramas por metros cúbicos
	 */
	public static double converter1(double i) {
		return i / 1000;
	}
	
	/** Representa o valor que o usuário inseriu em libras por polegada cúbica
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em libras por polegada cúbica
	 */
	public static double converter2(double i) {
		return i / 27.68;
	}
}
