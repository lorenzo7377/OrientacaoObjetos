package modelo;

/** Realiza as transformações da medida padrão(segundos) para as medidas esperadas
 * @author Lorenzo Santos
 * @version 2.0 (Apr 2021)
 */

public class Tempo {
	
	/** Representa o valor que o usuário inseriu em segundos
	 * @param i valor inteiro inserido pelo usuário
	 * @return o mesmo valor entrado, ou seja, a variável i
	 */
	public static double converter1(double i) {
		return i;
	}
	
	/** Representa o valor que o usuário inseriu em milisegundos
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em milisegundos
	 */
	public static double converter2(double i) {
		return i * 1000;
	}
	
	/** Representa o valor que o usuário inseriu em minutos
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em minutos
	 */
	public static double converter3(double i) {
		return i / 60 ;
	}
	
	/** Representa o valor que o usuário inseriu em horas
	 * @param i valor inteiro inserido pelo usuário
	 * @return o parâmetro inserido transformado em horas
	 */
	public static double converter4(double i) {
		return i / 3600 ;
	}
	
	/** Representa o valor que o usuário inseriu no modelo hh:mm:ss
	 * @param i valor inteiro inserido pelo usuário
	 * @return uma string que contem o parâmetro inserido no modelo hh:mm:ss
	 */
	public static String converter5(double i) {
		int h, m, s;
		h =(int) i / 3600;
		m = (int) (i % 3600) / 60;
		s = (int) (i % 3600) % 60;
		if(m == 0)
			s = 0;
		return h + ":" + m + ":" + s;
	}
}
