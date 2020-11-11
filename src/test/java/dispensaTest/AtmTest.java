package dispensaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import dispensa.CaixaEletronico;
import dispensa.Notas;
import dispensa.Saque;

public class AtmTest {
	
	@Test
	public void testaSaque200NoLimiteDeNotas() throws Exception {
		Map<Notas,Integer> notasDisponiveis = new HashMap<Notas,Integer>();
		
		notasDisponiveis.put(Notas.NOTA_100,1);
		notasDisponiveis.put(Notas.NOTA_50,2);
		
		CaixaEletronico caixaEletronico = new CaixaEletronico(notasDisponiveis);
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(200);
		
		int quantidadeDeNotasDiferentesUsadas = 2;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertNotNull(listaSaque.get(1));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(2, listaSaque.get(1).getQuantidadeNotas());
		assertEquals(100, listaSaque.get(0).getNota().getValorNota());
		assertEquals(50, listaSaque.get(1).getNota().getValorNota());
	}
	
	@Test
	public void testaSaque200LimiteExtraDeNotas() throws Exception {
		Map<Notas,Integer> notasDisponiveis = new HashMap<Notas,Integer>();
		
		notasDisponiveis.put(Notas.NOTA_100,5);
		notasDisponiveis.put(Notas.NOTA_50,2);
		
		CaixaEletronico caixaEletronico = new CaixaEletronico(notasDisponiveis);
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(200);
		
		int quantidadeDeNotasDiferentesUsadas = 1;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertEquals(2, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(100, listaSaque.get(0).getNota().getValorNota());
		
	}
	
	@Test(expected = Exception.class)
	public void testaSaqueValorInvalido() throws Exception {
		Map<Notas,Integer> notasDisponiveis = new HashMap<Notas,Integer>();
		
		notasDisponiveis.put(Notas.NOTA_5,20);
		notasDisponiveis.put(Notas.NOTA_10,20);
		notasDisponiveis.put(Notas.NOTA_20,20);
		notasDisponiveis.put(Notas.NOTA_50,10);
		notasDisponiveis.put(Notas.NOTA_100,5);
		
		CaixaEletronico caixaEletronico = new CaixaEletronico(notasDisponiveis);
		
		caixaEletronico.sacar(123);
	}

}
