package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewMenu implements ActionListener {
	private static JButton botao1 = new JButton("Básico");
	private static JButton botao2 = new JButton("Diário");
	private static JButton botao3 = new JButton("Ciências");
	private static JButton botao4 = new JButton("Outros");
	private static JFrame f = new JFrame("Conversor de medidas");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JLabel subtext = new JLabel("Escolha uma das categorias abaixo");
	
	public ViewMenu() {
		int x = 150;
		int y = 60;
		titulo.setFont(new Font("Times new Roman", Font.BOLD, 30));
		subtext.setFont(new Font("Times new Roman", Font.ITALIC, 14));
		titulo.setBounds(280, 60, 300, 30);
		subtext.setBounds(280, 90, 300, 30);
		botao1.setBounds(150, 170, x, y);
		botao2.setBounds(500, 170, x, y);
		botao3.setBounds(150, 260, x, y);
		botao4.setBounds(500, 260, x, y);
		f.setLayout(null);
		f.add(titulo);
		f.add(subtext);
		f.add(botao1);
		f.add(botao2);
		f.add(botao3);
		f.add(botao4);
		f.setSize(800, 400);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		ViewMenu menu = new ViewMenu();
		botao1.addActionListener(menu);
		botao2.addActionListener(menu);
		botao3.addActionListener(menu);
		botao4.addActionListener(menu);
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botao1)
			new ViewBasico().apresentar();
		if(src == botao2)
			new ViewDiario().apresentar();
		if(src == botao3)
			new ViewCiencias().apresentar();
		if(src == botao4)
			new ViewOutros().apresentar();
		}

}
