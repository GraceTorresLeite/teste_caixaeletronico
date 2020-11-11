package dispensa;

public class Saque {
	
	private int quantidadeNotas;
	private Notas nota;
	
	public Saque(int quantidadeNotas, Notas nota) {
		this.quantidadeNotas = quantidadeNotas;
		this.nota = nota;
	}

	public int getQuantidadeNotas() {
		return quantidadeNotas;
	}

	public Notas getNota() {
		return nota;
	}

}
