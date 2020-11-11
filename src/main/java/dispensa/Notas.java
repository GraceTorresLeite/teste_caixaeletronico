package dispensa;

public enum Notas {
	
NOTA_100(100),
	
	NOTA_50(50),
	
	NOTA_20(20),
	
	NOTA_10(10),
	
	NOTA_5(5),
	
	NOTA_2(2);
	
	private  int valorNota;

	private Notas(int valor) {
		this.valorNota = valor;
	}

	public int getValorNota() {
		return valorNota;
	}

}
