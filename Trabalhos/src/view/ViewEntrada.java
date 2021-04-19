package view;

import java.awt.event.*;
import javax.swing.*;

public class ViewEntrada implements ActionListener{
	private static JFrame frame = new JFrame("Valor de medida");
	private static JLabel texto = new JLabel("Digite o valor numérico da medida a ser transformada");
	private static JButton botao = new JButton("OK");
	private static JButton botao2 = new JButton("Voltar");
	private static JTextField caixa = new JTextField(20);
	private static JPanel painel = new JPanel();
	
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
	
	public void RecebeValor(int i, int d) {
		
		
		frame.setSize(400, 170);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(painel);
		colocar(painel);

		frame.setVisible(true);
		botao.addActionListener(this);
		botao2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botao)
		System.out.println("1");
		if(src == botao2)
			new ViewMenu();
		}
}
