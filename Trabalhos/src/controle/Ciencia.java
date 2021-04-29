package controle;

import modelo.Concentracao;
import modelo.Densidade;

/** Cria os arrays com as conversões referentes à categoria Ciência, as quais serão apresentadas ao usuário, juntos às suas respectivas medidas em forma de string
 * @author Lorenzo Santos
 * @version 1.0 (Apr 2021)
 */

public class Ciencia extends Grupo{
	private double valor;
	
	/**Define o valor da variável "valor" para ser usada na conversão das medidas dentro dos arrays
	 * @param v valor que o usuário inseriu e que será convertido para valores equivalentes
	 */
	public Ciencia(double v){
		valor = v;
		Ciencia.setValorOrigem(valor);
	}
	
	/** Cria um array de três posições e armazena as medidas de peso convertidas juntas de suas unidades em cada posição
	 * @return o array "s1", contendo as medidas e unidades de comprimento convertidas pela classe "Concentracao"
	 */
	public String[] ListarConcentracao() {
		String[] s1 = new String[3];
		s1[0] = String.valueOf(Ciencia.getValorOrigem()) + " g/L";
		s1[1] = String.valueOf(Concentracao.converter1(valor)) + "%";
		s1[2] = String.valueOf(Concentracao.converter2(valor)) + " g/mL";
		return s1;
	}
	
	/** Cria um array de três posições e armazena as medidas de peso convertidas juntas de suas unidades em cada posição
	 * @return o array "s2", contendo as medidas e unidades de comprimento convertidas pela classe "Densidade"
	 */
	public String[] ListarDensidade() {
		String[] s2 = new String[3];
		s2[0] = String.valueOf(Ciencia.getValorOrigem()) + " g/cm³";
		s2[1] = String.valueOf(Densidade.converter1(valor)) + " kg/m³";
		s2[2] = String.valueOf(Densidade.converter2(valor)) + " lb/in³";
		return s2;
	}
}

