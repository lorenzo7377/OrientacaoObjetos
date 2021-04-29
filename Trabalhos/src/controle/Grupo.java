package controle;

/** Generaliza as formas de alterar e enviar a variável "valorOrigem" 
 * @author Lorenzo Santos
 * @version 1.2 (Apr 2021)
 */

public abstract class Grupo {
	protected static double valorOrigem;
	
	/**Envia o valor a da variável protegida para a classe que chamou
	 * @return o valor da variável "valorOrigem"
	 */
	public static double getValorOrigem() {
		return valorOrigem;
	}
	
	/**Troca o valor a da variável protegida pelo parâmetro recebido
	 * @param valorRecebido O valor enviado a essa classe
	 */
	public static void setValorOrigem(double valorRecebido) {
		Grupo.valorOrigem = valorRecebido;
	}

}
