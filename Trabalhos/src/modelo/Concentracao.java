package modelo;

/** Realiza as transformações da medida padrão(grama por litro) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Concentracao {
	/** Representa o valor que o usuário inseriu em porcentagem
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em porcentagem
	 */
	public static double converter1(double i) {
		return i / 10;
	}
	
	/** Representa o valor que o usuário inseriu em gramas por mililitro
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em gramas por mililitro
	 */
	public static double converter2(double i) {
		return i / 1000;
	}

}
