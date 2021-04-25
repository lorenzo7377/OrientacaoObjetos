package controle;


import modelo.Moeda;
import modelo.Temperatura;
import modelo.Tempo;
import modelo.Velocidade;


public class Diario extends Grupo{
	private double valor;
	
	public Diario(double valor2){
		valor = valor2;
	}
	
	public String[] ListarTempo() {
		String[] s1 = new String[7];
		s1[0] = String.valueOf(Tempo.converter1(valor)) + " segundos";
		s1[1] = String.valueOf(Tempo.converter2(valor)) + " milisegundos";
		s1[2] = String.valueOf(Tempo.converter3(valor)) + " minutos";
		s1[3] = String.valueOf(Tempo.converter4(valor)) + " horas";
		s1[4] = Tempo.converter5(valor);
		return s1;
	}
		
		public String[] ListarVel() {
			String[] s2 = new String[4];
			s2[0] = String.valueOf(Velocidade.converter1(valor)) + " quilômetros por horas";
			s2[1] = String.valueOf(Velocidade.converter2(valor)) + " metros por segundo";
			s2[2] = String.valueOf(Velocidade.converter3(valor)) + " milhas por horas";
			s2[3] = String.valueOf(Velocidade.converter3(valor)) + " pés por segundo";
			return s2;
		}
			
		public String[] ListarTemp() {
			String[] s3 = new String[3];
			s3[0] = String.valueOf(Temperatura.converter1(valor)) + " °C";
			s3[1] = String.valueOf(Temperatura.converter2(valor)) + " °F";
			s3[2] = String.valueOf(Temperatura.converter3(valor)) + " °K";
			return s3;
		}
		
		public String[] ListarMoeda() {
			String[] s4 = new String[4];
			s4[0] = String.valueOf(Moeda.converter1(valor)) + " real(is)";
			s4[1] = String.valueOf(Moeda.converter2(valor)) + " dólar(es)";
			s4[2] = String.valueOf(Moeda.converter3(valor)) + " libra(s)";
			s4[3] = String.valueOf(Moeda.converter4(valor)) + " euro(s)";
			return s4;
		}	
	
}
