package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ViewCiencias implements ActionListener{
	private static JButton botao1 = new JButton("Concentração");
	private static JButton botao2 = new JButton("Densidade");
	private static JButton botao3 = new JButton("Voltar");
	private static JFrame f = new JFrame("Conversor de medidas");
	private static JLabel titulo = new JLabel("Ciências");
	private static JLabel subtext = new JLabel("Escolha uma das categorias abaixo");
	
	public void apresentar(){
		int x = 150;
		int y = 60;
		titulo.setFont(new Font("Times new Roman", Font.BOLD, 30));
		subtext.setFont(new Font("Times new Roman", Font.ITALIC, 14));
		titulo.setBounds(330, 60, 300, 30);
		subtext.setBounds(280, 90, 300, 30);
		botao1.setBounds(150, 170, x, y);
		botao2.setBounds(500, 170, x, y);
		f.setLayout(null);
		f.add(titulo);
		f.add(subtext);
		f.add(botao1);
		f.add(botao2);
		botao3.setBounds(325, 280, x, 25);
		f.add(botao3);
		f.setSize(800, 400);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);	
		
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		botao3.addActionListener(this);
		
	}
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			
			if(src == botao1)
				new ViewEntrada().RecebeValor(3,1);
			if(src == botao2)
				new ViewEntrada().RecebeValor(3,2);
			if(src == botao3)
				new ViewMenu();
			}


}
