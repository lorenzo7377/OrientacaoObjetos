package controle;

import modelo.Combustivel;
import modelo.Cozinhar;

/** Cria os arrays com as conversões referentes à categoria Outros, as quais serão apresentadas ao usuário, juntos às suas respectivas medidas em forma de string
 * @author Lorenzo Santos
 * @version 1.0 (Apr 2021)
 */

public class Outros extends Grupo{
	private double valor;

	/**Define o valor da variável "valor" para ser usada na conversão das medidas dentro dos arrays
	 * @param v valor que o usuário inseriu e que será convertido para valores equivalentes
	 */
	public Outros(double v){
		valor = v;
		Outros.setValorOrigem(valor);
	}
	
	/** Cria um array de três posições e armazena as medidas de combustível convertidas juntas de suas unidades em cada posição
	 * @return o array "s1", contendo as medidas e unidades de comprimento convertidas pela classe "Combustivel"
	 */
	public String[] ListarCombustivel() {
		String[] s1 = new String[3];
		s1[0] = String.valueOf(Outros.getValorOrigem()) + " Km/L";
		s1[1] = String.valueOf(Combustivel.converter1(valor)) + " mi/L";
		s1[2] = String.valueOf(Combustivel.converter2(valor)) + " L/100km";
		return s1;
	}
	
	/** Cria um array de três posições e armazena as medidas relacionadas a cozinha convertidas juntas de suas unidades em cada posição
	 * @return o array "s2", contendo as medidas e unidades de comprimento convertidas pela classe "Cozinhar"
	 */
	public String[] ListarCozinhar() {
		String[] s2 = new String[3];
		s2[0] = String.valueOf(Outros.getValorOrigem()) + " ml";
		s2[1] = String.valueOf(Cozinhar.converter1(valor)) + " colher(es) de chá";
		s2[2] = String.valueOf(Cozinhar.converter2(valor)) + " colher(es) de sopa";
		return s2;
	}
	
}
