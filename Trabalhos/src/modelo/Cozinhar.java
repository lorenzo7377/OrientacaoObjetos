package modelo;

/** Realiza as transformações da medida padrão (mililitros) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Cozinhar {
	
	/** Representa o valor que o usuário inseriu em colheres de chá
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em colheres de chá
	 */
	public static double converter1(double i) {
		return i / 5;
	}
	
	/** Representa o valor que o usuário inseriu em colheres de sopa
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em colheres de sopa
	 */
	public static double converter2(double i) {
		return i / 15;
	}
}
