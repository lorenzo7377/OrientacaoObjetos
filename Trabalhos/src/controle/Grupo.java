package controle;

public abstract class Grupo {
	
	protected static int valorOrigem;
	
	

	public int getValorOrigem() {
		return valorOrigem;
	}

	public static void setValorOrigem(int valorOrigem) {
		Grupo.valorOrigem = valorOrigem;
	}

}
