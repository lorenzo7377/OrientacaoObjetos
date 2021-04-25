package view;

import java.awt.*;
import javax.swing.*;

import controle.*;

public class ViewSaidas{
	//private static JButton botao = new JButton("Voltar");
	private static JFrame f = new JFrame("medidas convertidas");
	private JList<String> lva1;
	private JList<String> lva2;
	private JList<String> lva3;
	private JList<String> lva4;
	private JList<String> lva5;
	private JList<String> lva6;
	private JList<String> lva7;
	private JList<String> lva8;
	private JList<String> lva9;
	private JList<String> lva10;
	private JList<String> lva11;
	private JList<String> lva12;
	
	public void mostrar(double valor, int d1, int d2) {
		f.setLayout(null);
		f.setSize(500, 400);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JLabel intro = new JLabel("As medias correspondentes serão:");
		intro.setFont(new Font("Times new Roman", Font.ITALIC, 16));
		intro.setBounds(110, 10, 300, 100);
		f.add(intro);
		f.setVisible(true);
		if(d1 == 1) {
			switch(d2){
			case 1:
				String[] listaValores1 = new Basico(valor).ListarComp();
				lva1 = new JList<String>(listaValores1);
				lva1.setBounds(50, 100, 350, 140);
				lva1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva1.setVisibleRowCount(7);
				lva1.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva1);
				break;
			case 2:
				String[] listaValores2 = new Basico(valor).ListarArea();
				lva2 = new JList<String>(listaValores2);
				lva2.setBounds(50, 150, 350, 70);
				lva2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva2.setVisibleRowCount(3);
				lva2.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva2);
				break;
			case 3:
				String[] listaValores3 = new Basico(valor).ListarPeso();
				lva3 = new JList<String>(listaValores3);
				lva3.setBounds(50, 150, 350, 100);
				lva3.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva3.setVisibleRowCount(5);
				lva3.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva3);
				break;
			case 4:
				String[] listaValores4 = new Basico(valor).ListarVolume();
				lva4 = new JList<String>(listaValores4);
				lva4.setBounds(50, 150, 350, 90);
				lva4.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva4.setVisibleRowCount(4);
				lva4.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva4);
				break;
			}
			
		}
		if(d1 == 2) {
			switch(d2){
			case 1:
				String[] listaValores5 = new Diario(valor).ListarTempo();
				lva5 = new JList<String>(listaValores5);
				lva5.setBounds(50, 100, 350, 100);
				lva5.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva5.setVisibleRowCount(5);
				lva5.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva5);
				break;
			case 2:
				String[] listaValores6 = new Diario(valor).ListarVel();
				lva6 = new JList<String>(listaValores6);
				lva6.setBounds(50, 150, 350, 80);
				lva6.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva6.setVisibleRowCount(4);
				lva6.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva6);
				break;
			case 3:
				String[] listaValores7 = new Diario(valor).ListarTemp();
				lva7 = new JList<String>(listaValores7);
				lva7.setBounds(50, 150, 350, 70);
				lva7.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva7.setVisibleRowCount(4);
				lva7.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva7);
				break;
			case 4:
				String[] listaValores8 = new Diario(valor).ListarMoeda();
				lva8 = new JList<String>(listaValores8);
				lva8.setBounds(50, 150, 350, 80);
				lva8.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva8.setVisibleRowCount(4);
				lva8.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva8);
				break;
			}
		}
		if(d1 == 3) {
			switch(d2){
			case 1:
				String[] listaValores9 = new Ciencia(valor).ListarConcentracao();
				lva9 = new JList<String>(listaValores9);
				lva9.setBounds(50, 150, 350, 60);
				lva9.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva9.setVisibleRowCount(3);
				lva9.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva9);
				break;
			case 2:
				String[] listaValores10 = new Ciencia(valor).ListarDensidade();
				lva10 = new JList<String>(listaValores10);
				lva10.setBounds(50, 150, 350, 70);
				lva10.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva10.setVisibleRowCount(3);
				lva10.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva10);
				break;
			}
			
		}
		if(d1 == 4) {
			switch(d2){
			case 1:
				String[] listaValores11 = new Outros(valor).ListarCombustivel();
				lva11 = new JList<String>(listaValores11);
				lva11.setBounds(50, 150, 350, 60);
				lva11.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva11.setVisibleRowCount(3);
				lva11.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva11);
				break;
			case 2:
				String[] listaValores12 = new Outros(valor).ListarCozinhar();
				lva12 = new JList<String>(listaValores12);
				lva12.setBounds(50, 150, 350, 70);
				lva12.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				lva12.setVisibleRowCount(3);
				lva12.setFont(new Font("Arial",Font.BOLD,14));
				f.add(lva12);
				break;
			}
		}

		
		
	}
	
}
