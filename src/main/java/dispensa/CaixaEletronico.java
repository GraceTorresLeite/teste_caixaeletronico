package dispensa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaixaEletronico {
	
	private Map<Notas,Integer> notasDisponiveis = new HashMap<Notas, Integer>();;

	public CaixaEletronico(Map<Notas, Integer> notasDisponiveis) {
		this.notasDisponiveis = notasDisponiveis;
	}
	
	public CaixaEletronico() {
		
		//criando construtor vazio para realizar testes com saques para cada nota 
	}

	public List<Saque> sacar(int valorSaque) throws Exception {
		List<Saque> listaDeSaque = new ArrayList<Saque>();

		for (Notas notas : Notas.values()) {
			int valorNota = notas.getValorNota();
			int quantidadeDeNotasNecessarias = (int) Math.floor(valorSaque / valorNota);
			Integer quantidadeDeNotasDisponiveis = notasDisponiveis.get(notas);

			if (quantidadeDeNotasNecessarias > 0) {
				
				if(quantidadeDeNotasDisponiveis != null) {
					if (quantidadeDeNotasNecessarias >= quantidadeDeNotasDisponiveis) {
						quantidadeDeNotasNecessarias = quantidadeDeNotasDisponiveis;
						quantidadeDeNotasDisponiveis = 0;					
					} else {
						quantidadeDeNotasDisponiveis -= quantidadeDeNotasNecessarias;
					}
					
					notasDisponiveis.put(notas, quantidadeDeNotasDisponiveis);
				}
			
				Saque saque = new Saque(quantidadeDeNotasNecessarias, notas);

				valorSaque = valorSaque - (quantidadeDeNotasNecessarias * valorNota);
				listaDeSaque.add(saque);
			}
			
			if(valorSaque == 0) {
				break;
			}
		}

		if(valorSaque != 0 ) {
			throw new Exception("Valor inválido para saque");
			
		}
		
		return listaDeSaque;
	}
	
}
