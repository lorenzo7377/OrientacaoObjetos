package controle;

import modelo.Moeda;
import modelo.Temperatura;
import modelo.Tempo;
import modelo.Velocidade;

/** Cria os arrays com as conversões referentes à categoria Diário, as quais serão apresentadas ao usuário, juntos às suas respectivas medidas em forma de string
 * @author Lorenzo Santos
 * @version 1.0 (Apr 2021)
 */

public class Diario extends Grupo{
	private double valor;
	
	/**Define o valor da variável "valor" para ser usada na conversão das medidas dentro dos arrays
	 * @param v valor que o usuário inseriu e que será convertido para valores equivalentes
	 */
	public Diario(double v){
		valor = v;
		Diario.setValorOrigem(valor);
	}
	
	/** Cria um array de cinco posições e armazena as medidas temporais convertidas juntas de suas unidades em cada posição
	 * @return o array "s1", contendo as medidas e unidades de comprimento convertidas pela classe "Tempo"
	 */
	public String[] ListarTempo() {
		String[] s1 = new String[5];
		s1[0] = String.valueOf(Diario.getValorOrigem()) + " segundos";
		s1[1] = String.valueOf(Tempo.converter1(valor)) + " milisegundos";
		s1[2] = String.valueOf(Tempo.converter2(valor)) + " minutos";
		s1[3] = String.valueOf(Tempo.converter3(valor)) + " horas";
		s1[4] = Tempo.converter4(valor);
		return s1;
	}
	
	/** Cria um array de quatro posições e armazena as medidas de velocidade convertidas juntas de suas unidades em cada posição
	 * @return o array "s2", contendo as medidas e unidades de comprimento convertidas pela classe "Velocidade"
	 */
	public String[] ListarVel() {
		String[] s2 = new String[4];
		s2[0] = String.valueOf(Diario.getValorOrigem()) + " quilômetros por horas";
		s2[1] = String.valueOf(Velocidade.converter1(valor)) + " metros por segundo";
		s2[2] = String.valueOf(Velocidade.converter2(valor)) + " milhas por horas";
		s2[3] = String.valueOf(Velocidade.converter3(valor)) + " pés por segundo";
		return s2;
	}
	
	/** Cria um array de três posições e armazena as medidas de Temperatura convertidas juntas de suas unidades em cada posição
	 * @return o array "s3", contendo as medidas e unidades de comprimento convertidas pela classe "Temperatura"
	 */
	public String[] ListarTemp() {
		String[] s3 = new String[3];
		s3[0] = String.valueOf(Diario.getValorOrigem()) + " °C";
		s3[1] = String.valueOf(Temperatura.converter1(valor)) + " °F";
		s3[2] = String.valueOf(Temperatura.converter2(valor)) + " °K";
		return s3;
	}
	
	/** Cria um array de quatro posições e armazena as medidas monetárias convertidas juntas de suas unidades em cada posição
	 * @return o array "s4", contendo as medidas e unidades de comprimento convertidas pela classe "Moeda"
	 */
	public String[] ListarMoeda() {
		String[] s4 = new String[4];
		s4[0] = String.valueOf(Diario.getValorOrigem()) + " real(is)";
		s4[1] = String.valueOf(Moeda.converter1(valor)) + " dólar(es)";
		s4[2] = String.valueOf(Moeda.converter2(valor)) + " libra(s)";
		s4[3] = String.valueOf(Moeda.converter3(valor)) + " euro(s)";
		return s4;
	}	
}
