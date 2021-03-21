package TP03;

import java.util.*;

@SuppressWarnings("unused")
public class Teste {
	static Ciencia c;
	static Area a;
	static Basico b;
	static Combustivel cmb;
	static Comprimento cmp;
	static Concentracao cnt;
	static Cozinhar cz;
	static Densidade d;
	static Diario di;
	static Moeda mo;
	static Outros o;
	static Peso p;
	static Temperatura temp;
	static Tempo time;
	static Velocidade vel;
	static Volume vol;
	
	public static void main(String[] args) {
		//Exemplos de entrada possíveis
		c = new Ciencia(5, "mm");
		a = new Area(6, "mm²");
		b = new Basico (7, "m");
		cmb = new Combustivel(8, "Km/l");
		cmp = new Comprimento(9, "m");
		cnt = new Concentracao(10, "%");
		cz = new Cozinhar(11, "Teaspoon(s)");
		d = new Densidade(12, "g/ml");
		di = new Diario(13, "Km/l");
		mo = new Moeda (14, "Brl");
		o = new Outros(15, "tablespoon(s)");
		p = new Peso (16, "Kg");
		temp = new Temperatura(17, "°C");
		time = new Tempo(18, "s");
		vel = new Velocidade(19, "m/s");
		vol = new Volume(20, "l");
		//modelo de resposta depois do processamento
		System.out.println("1-valor origem: "+c.getValorOrigem()+", medida origem: "+c.getMedidaOrigem()+"\n");
		System.out.println("2-valor origem: "+a.getValorOrigem()+", medida origem: "+a.getMedidaOrigem()+"\n");
		System.out.println("3-valor origem: "+b.getValorOrigem()+", medida origem: "+b.getMedidaOrigem()+"\n");
		System.out.println("4-valor origem: "+cmb.getValorOrigem()+", medida origem: "+cmb.getMedidaOrigem()+"\n");
		System.out.println("5-valor origem: "+cmp.getValorOrigem()+", medida origem: "+cmp.getMedidaOrigem()+"\n");
		System.out.println("6-valor origem: "+cnt.getValorOrigem()+", medida origem: "+cnt.getMedidaOrigem()+"\n");
		System.out.println("7-valor origem: "+cz.getValorOrigem()+", medida origem: "+cz.getMedidaOrigem()+"\n");
		System.out.println("8-valor origem: "+d.getValorOrigem()+", medida origem: "+d.getMedidaOrigem()+"\n");
		System.out.println("9-valor origem: "+di.getValorOrigem()+", medida origem: "+di.getMedidaOrigem()+"\n");
		System.out.println("10-valor origem: "+mo.getValorOrigem()+", medida origem: "+mo.getMedidaOrigem()+"\n");
		System.out.println("11-valor origem: "+o.getValorOrigem()+", medida origem: "+o.getMedidaOrigem()+"\n");
		System.out.println("12-valor origem: "+p.getValorOrigem()+", medida origem: "+p.getMedidaOrigem()+"\n");
		System.out.println("13-valor origem: "+temp.getValorOrigem()+", medida origem: "+temp.getMedidaOrigem()+"\n");
		System.out.println("14-valor origem: "+time.getValorOrigem()+", medida origem: "+time.getMedidaOrigem()+"\n");
		System.out.println("15-valor origem: "+vel.getValorOrigem()+", medida origem: "+vel.getMedidaOrigem()+"\n");
		System.out.println("16-valor origem: "+vol.getValorOrigem()+", medida origem: "+vol.getMedidaOrigem()+"\n");
	}

}
