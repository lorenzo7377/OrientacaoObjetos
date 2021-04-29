package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**Gera a interface gráfica da categoria "Básico" e cria os botões de seleção das categorias "Comprimento", "Área", "Peso", "Volume" e "Voltar"
 * @author Lorenzo Santos
 *@version 1.1 (Apr 2021)
 */

public class ViewBasico implements ActionListener{
	private static JButton botao1 = new JButton("Comprimento");
	private static JButton botao2 = new JButton("Área");
	private static JButton botao3 = new JButton("Peso");
	private static JButton botao4 = new JButton("Volume");
	private static JButton botao5 = new JButton("Voltar");
	private static JFrame f=new JFrame("Conversor de medidas");
	private static JLabel titulo = new JLabel("Básico");
	private static JLabel subtext = new JLabel("Escolha uma das categorias abaixo");
	
	/** Cria o layout da aba de categoria e posiciona o texto e os botões clicáveis, além de registrar o clique do usuário em um botão
	 */
	public void apresentar(){
		titulo.setFont(new Font("Times new Roman", Font.BOLD, 30));
		subtext.setFont(new Font("Times new Roman", Font.ITALIC, 14));
		titulo.setBounds(330, 60, 300, 30);
		subtext.setBounds(280, 90, 300, 30);
		botao1.setBounds(150, 170, 150, 60);
		botao2.setBounds(500, 170, 150, 60);
		botao3.setBounds(150, 260, 150, 60);
		botao4.setBounds(500, 260, 150, 60);
		botao5.setBounds(325, 280, 150, 25);
		f.setLayout(null);
		f.add(titulo);
		f.add(subtext);
		f.add(botao1);
		f.add(botao2);
		f.add(botao3);
		f.add(botao4);
		f.add(botao5);
		f.setSize(800, 400);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);	
		
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		botao3.addActionListener(this);
		botao4.addActionListener(this);
		botao5.addActionListener(this);
		
	}
	
	/**Chama as próximas interfaces quando um dos botões é clicado
	 * @param e Variável que indica qual botão foi clicado pelo usuário
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botao1)
			new ViewEntrada().RecebeValor(1,1);
		if(src == botao2)
			new ViewEntrada().RecebeValor(1,2);
		if(src == botao3)
			new ViewEntrada().RecebeValor(1,3);
		if(src == botao4)
			new ViewEntrada().RecebeValor(1,4);
		if(src == botao5)
			new ViewMenu();
	}
}

