package view;

import java.awt.event.*;
import javax.swing.*;

/** Cria a interface gráfica para entradas, além de criar os botões "OK", "Voltar" e a caixa de texto que receberá o input do usuário
 * @author Lorenzo Santos
 * @version 1.0 (Apr 2021)
 */

public class ViewEntrada implements ActionListener{
	private static JFrame frame = new JFrame("Valor de medida");
	private static JLabel texto = new JLabel("Digite o valor numérico da medida a ser transformada");
	private static JButton botao = new JButton("OK");
	private static JButton botao2 = new JButton("Voltar");
	private static JTextField caixa = new JTextField(20);
	private static JPanel painel = new JPanel();
	int marcador1, marcador2;
	private double valor;
	
	/**Cria o layout da aba onde o usuário deve escrever o valor a ser convertido, além de posicionar o texto a ser lido
	 * @param i variável que representa a categoria (classes do pacote Controle)
	 * @param d variável que representa qual grupo de conversões de ser chamado (classes do pacote Modelo)
	 */
	public void RecebeValor(int i, int d) {		
		frame.setSize(400, 170);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(painel);
		colocar(painel);
		marcador1 = i;
		marcador2 = d;
		frame.setVisible(true);
		botao.addActionListener(this);
		botao2.addActionListener(this);
	}
	
	/**Posiciona os botões de prosseguir e voltar ao menu, assim como a área de texto
	 * @param panel Variável que representa o painel criado pelo método RecebeValor
	 */
	private static void colocar(JPanel panel) {

		painel.setLayout(null);

		texto.setBounds(10, 10, 400, 25);
		painel.add(texto);
		
		caixa.setBounds(120, 40, 160, 25);
		painel.add(caixa);

		botao.setBounds(10, 90, 100, 25);
		painel.add(botao);
		
		botao2.setBounds(290, 90, 100, 25);
		painel.add(botao2);
	}
	
	/**Chama as próximas interfaces quando um dos botões é clicado
	 * @param e Variável que indica qual botão foi clicado pelo usuário
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botao) {
			valor = Double.parseDouble(caixa.getText());
			new ViewSaidas().mostrar(valor, marcador1, marcador2);
		}
		if(src == botao2)
			new ViewMenu();
		}
}
