package dispensa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Caixa Eletronico");
        System.out.println();
		System.out.println("Digite o valor do saque:");
		int valor = scanner.nextInt();
		
		Map<Notas,Integer> notasDisponiveis = new HashMap<Notas,Integer>();
		
		notasDisponiveis.put(Notas.NOTA_2,20);
		notasDisponiveis.put(Notas.NOTA_5,20);
		notasDisponiveis.put(Notas.NOTA_10,20);
		notasDisponiveis.put(Notas.NOTA_20,20);
		notasDisponiveis.put(Notas.NOTA_50,10);
		notasDisponiveis.put(Notas.NOTA_100,5);
		
		CaixaEletronico caixaEletronico = new CaixaEletronico(notasDisponiveis);
		List<Saque> listaSaque = caixaEletronico.sacar(valor);
		
		for (Saque saque : listaSaque) {
			System.out.println(String.format("%d notas de %d", saque.getQuantidadeNotas(), saque.getNota().getValorNota()));
		}

	}

}
