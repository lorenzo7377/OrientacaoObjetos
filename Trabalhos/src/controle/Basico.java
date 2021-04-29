package controle;

import modelo.Area;
import modelo.Comprimento;
import modelo.Peso;
import modelo.Volume;

/** Cria os arrays com as conversões referentes à categoria Básico, as quais serão apresentadas ao usuário, juntos às suas respectivas medidas em forma de string
 * @author Lorenzo Santos
 * @version 1.0 (Apr 2021)
 */

public class Basico extends Grupo{
	private double valor;
	
	/**Define o valor da variável "valor" para ser usada na conversão das medidas dentro dos arrays
	 * @param v valor que o usuário inseriu e que será convertido para valores equivalentes
	 */
	public Basico(double v){
		valor = v;
		Basico.setValorOrigem(valor);
	}
	
	/** Cria um array de sete posições e armazena as medidas de comprimento convertidas juntas de suas unidades em cada posição
	 * @return o array "s1", contendo as medidas e unidades de comprimento convertidas pela classe "Comprimento"
	 */
	public String[] ListarComp() {
		String[] s1 = new String[7];
		s1[0] = String.valueOf(Basico.getValorOrigem()) + " metros";
		s1[1] = String.valueOf(Comprimento.converter1(valor)) + " centímetros";
		s1[2] = String.valueOf(Comprimento.converter2(valor)) + " milímetros";
		s1[3] = String.valueOf(Comprimento.converter3(valor)) + " quilômetros";
		s1[4] = String.valueOf(Comprimento.converter4(valor)) + " pés";
		s1[5] = String.valueOf(Comprimento.converter5(valor)) + " polegadas";
		s1[6] = String.valueOf(Comprimento.converter6(valor)) + " milhas";
		return s1;
	}
	
	/** Cria um array de três posições e armazena as medidas de área convertidas juntas de suas unidades em cada posição
	 * @return o array "s2", contendo as medidas e unidades de comprimento convertidas pela classe "Area"
	 */
	public String[] ListarArea() {
		String[] s2 = new String[3];
		s2[0] = String.valueOf(Basico.getValorOrigem()) + " metros quadrados";
		s2[1] = String.valueOf(Area.converter1(valor)) + " centímetros quadrados";
		s2[2] = String.valueOf(Area.converter2(valor)) + " acres";
		return s2;
	}
	
	/** Cria um array de três posições e armazena as medidas de peso convertidas juntas de suas unidades em cada posição
	 * @return o array "s3", contendo as medidas e unidades de comprimento convertidas pela classe "Peso"
	 */
	public String[] ListarPeso() {
		String[] s3 = new String[5];
		s3[0] = String.valueOf(Basico.getValorOrigem()) + " gramas";
		s3[1] = String.valueOf(Peso.converter1(valor)) + " quilôgramas";
		s3[2] = String.valueOf(Peso.converter2(valor)) + " miligramas";
		s3[3] = String.valueOf(Peso.converter3(valor)) + " toneladas";
		s3[4] = String.valueOf(Peso.converter4(valor)) + " libras";
		return s3;
	}
	
	/** Cria um array de quatro posições e armazena as medidas de volume convertidas juntas de suas unidades em cada posição
	 * @return o array "s4", contendo as medidas e unidades de comprimento convertidas pela classe "Volume"
	 */
	public String[] ListarVolume() {
		String[] s4 = new String[4];
		s4[0] = String.valueOf(Basico.getValorOrigem()) + " metros cúbicos";
		s4[1] = String.valueOf(Volume.converter1(valor)) + " centímetros cúbicos";
		s4[2] = String.valueOf(Volume.converter2(valor)) + " litros";
		s4[3] = String.valueOf(Volume.converter3(valor)) + " mililitros";
		return s4;
	}	
}


