package TP04;

import java.util.*;

@SuppressWarnings("unused")
public class Main {
	static Ciencia ciencia;
	static Basico basico;
	static Diario diario;
	static Outros outros;


	public static void main(String[] args) {
		basico = new Basico(1);
		basico.escolha(4);
		ciencia = new Ciencia(100);
		ciencia.escolha(2);
		diario = new Diario(1);
		diario.escolha(4);
		outros = new Outros(15);
		outros.escolha(1);
	}

}
