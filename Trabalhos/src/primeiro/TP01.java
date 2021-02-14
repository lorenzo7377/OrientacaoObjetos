package primeiro;

import java.util.Scanner;

public class TP01 
{
	/*foram suprimidos os avisos do scanner com o intuito de 
	 * não aparecer os avisos pelo código por meio de 
	 * "@SuppressWarnings("resource")"*/
	public static int InformaData(int ano, int mes) {
		// essa função determina quantos dias o mês tem, baseado no ano e no próprio mês
		int data = 0;
		
		if(mes == 2) {
			if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {data = 29;}
			else {data = 28;}
		}
		
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){data = 30;}
		
		else {data = 31;}
		
		return data;
	}
	
	public static void TemperaturaEntrada(double t[][][]) {
		//essa função recebe valores de entrada e armazena em t[][][]
		//como o vetor é apenas alterado, a função é void
		int ano, mes;
		int d;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		System.out.println("digite o ano:");
		ano = ler.nextInt() - 2011;
		System.out.println("digite o número do mês:");
		mes = ler.nextInt() - 1;
		d = InformaData(ano + 2011, mes + 1);
		for(int i = 0; i < d; i++) 
		{
			
			System.out.printf("Digite a temperatura do dia %d:\n", i+1);
			t[ano][mes][i] = ler.nextDouble();
			
		}
	}
	
	public static double TemperaturaMédia(double t[][][]){
		//recebe os valores registrados no vetor e calcula a média
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double s = 0;
		int d;
		int ano, mes;
		System.out.println("Digite o ano:");
		ano = ler.nextInt() - 2011;
		System.out.println("Digite o mês:");
		mes = ler.nextInt() - 1;
		d = InformaData(ano + 2011, mes + 1);
		for(int i = 0; i < d; i++) 
		{
			s = t[ano][mes][i] + s;
		}
		return s / d;
	}

	public static double TemperaturaMínima(double t[][][]) {
		//recebe os valores registrados no vetor, retorna o valor mínimo e apresenta as datas
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int ano, mes;
		int d;
		double mín = 9999;
		System.out.println("digite o ano:");
		ano = ler.nextInt() - 2011;
		System.out.println("digite o número do mês:");
		mes = ler.nextInt() - 1;
		d = InformaData(ano + 2011, mes + 1);
		for(int i = 0; i < d; i++) {
			if(t[ano][mes][i] <= mín) {mín = t[ano][mes][i];}
		}
		
		
		for(int i = 0; i < d; i++) {
			if(t[ano][mes][i] == mín) {System.out.println("Mínima em " + (i+1) + "/" + (mes + 1) + "/" + (ano + 2011));}
		}
		
		return mín;
	}
	
	public static double TemperaturaMáxima(double t[][][]) {
		//recebe os valores registrados no vetor, retorna o valor máximo e apresenta as datas
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int ano, mes;
		int d;
		double máx = -9999;
		System.out.println("digite o ano:");
		ano = ler.nextInt() - 2011;
		System.out.println("digite o número do mês:");
		mes = ler.nextInt() - 1;
		d = InformaData(ano + 2011, mes + 1);
		for(int i = 0; i < d; i++) {	
			if(t[ano][mes][i] >= máx) {
				máx = t[ano][mes][i];
				}
		}
		
		for(int i = 0; i < d; i++) {
			if(t[ano][mes][i] == máx) {System.out.println("Máxima em " + (i+1) + "/" + (mes + 1) + "/" + (ano + 2011));}
		}
		
		return máx;
	}
	
	public static void relatorioMeteorológico(double t[][][]) {
		/*recebe os valores registrados no vetor e realiza as funções anteriores de forma
		 * levemente diferente, e apresenta um relatório*/
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int ano, mes;
		int d;
		double s = 0;
		System.out.println("digite o ano:");
		ano = ler.nextInt() - 2011;
		System.out.println("digite o número do mês:");
		mes = ler.nextInt() - 1;
		d = InformaData(ano + 2011, mes + 1);
		for(int i = 0; i < d; i++) {
			System.out.println(""+(i+1) + "/" + (mes + 1) + "/" + (ano + 2011) + " - " + t[ano][mes][i]);
		}
		
		for(int i = 0; i < d; i++) 
		{
			s = t[ano][mes][i] + s;
		}
		System.out.println("A temperatura média é " + (s/31) + "°C");
		
		double mín = 9999;
		for(int i = 0; i < d; i++) {if(t[ano][mes][i] <= mín) {mín = t[ano][mes][i];}
		}
		System.out.println("A temperatura mínima é " + mín + "°C");
		
		double máx = -9999;
		for(int i = 0; i < d; i++) {if(t[ano][mes][i] >= máx) {máx = t[ano][mes][i];}
		}
		System.out.println("A temperatura máxima é " + máx + "°C" + "\n");
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double t[][][] = new double [10][12][31];
		
		char r = 0;
		
		//definindo o mês de janeiro de 2020
		for(int h = 0; h < 29; h++) 
		{
			t[9][0][h] = 20;
		}
		// determina um máximo e mínimo para 01/2020 para facilitar a correção
		t[9][0][29] = 21;
		t[9][0][30] = 19;
		
		do {
			int n;
			// menu interativo
			System.out.println("\n1-Entrada das temperaturas");
			System.out.println("2-Cálculo da temperatura média");
			System.out.println("3-Cálculo da temperatura mínima");
			System.out.println("4-Cálculo da temperatura máxima");
			System.out.println("5-Relatório meteorológico");
			System.out.println("\nDigite sua opção de acordo com os números:");
			n = ler.nextInt();
			
		switch(n) {
		case 1: TemperaturaEntrada(t);
			break;
		case 2: System.out.println("A temperatura média é de " + TemperaturaMédia(t) + "°C");
			break;
		case 3: System.out.println("A temperatura mínima é de " + TemperaturaMínima(t) + "°C");
			break;
		case 4: System.out.println("A temperatura máxima é de " + TemperaturaMáxima(t) + "°C");
			break;
		case 5: relatorioMeteorológico(t);
			break;
		default: System.out.println("Opção inválida");
			break;
			
		}	
			//caso o usuário queira continuar
			System.out.println("Deseja voltar ao menu? (s/n)");
			r = ler.next().charAt(0);

		}while(r == 's' || r == 'S');
			ler.close();
		}
		
	}

