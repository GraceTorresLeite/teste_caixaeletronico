package dispensaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import dispensa.CaixaEletronico;
import dispensa.Saque;

public class CaixaEletronicoTest {

	@Test
	public void testaSaque100() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(100);
		
		int quantidadeDeNotasDiferentesUsadas = 1;
		
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(100, listaSaque.get(0).getNota().getValorNota());
		
	}
	
	@Test
	public void testaSaque200() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(200);
		
		int quantidadeDeNotasDiferentesUsadas = 1;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertEquals(2, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(100, listaSaque.get(0).getNota().getValorNota());
		
	}

	@Test
	public void testaSaque50() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(50);
		
		int quantidadeDeNotasDiferentesUsadas = 1;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(50, listaSaque.get(0).getNota().getValorNota());
		
	}
	
	@Test
	public void testaSaque70() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(70);
		
		int quantidadeDeNotasDiferentesUsadas = 2;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertNotNull(listaSaque.get(1));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(1, listaSaque.get(1).getQuantidadeNotas());
		assertEquals(50, listaSaque.get(0).getNota().getValorNota());
		assertEquals(20, listaSaque.get(1).getNota().getValorNota());
	}
	
	@Test
	public void testaSaque90() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(90);
		
		int quantidadeDeNotasDiferentesUsadas = 2;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertNotNull(listaSaque.get(1));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(2, listaSaque.get(1).getQuantidadeNotas());
		assertEquals(50, listaSaque.get(0).getNota().getValorNota());
		assertEquals(20, listaSaque.get(1).getNota().getValorNota());
	}
	
	@Test
	public void testaSaque60() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(60);
		
		int quantidadeDeNotasDiferentesUsadas = 2;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertNotNull(listaSaque.get(1));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(1, listaSaque.get(1).getQuantidadeNotas());
		assertEquals(50, listaSaque.get(0).getNota().getValorNota());
		assertEquals(10, listaSaque.get(1).getNota().getValorNota());
	}
	
	@Test
	public void testaSaque40() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(40);
		
		int quantidadeDeNotasDiferentesUsadas = 1;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertEquals(2, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(20, listaSaque.get(0).getNota().getValorNota());
		
	}
	
	@Test
	public void testaSaque30() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(30);
		
		int quantidadeDeNotasDiferentesUsadas = 2;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertNotNull(listaSaque.get(1));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(1, listaSaque.get(1).getQuantidadeNotas());
		assertEquals(20, listaSaque.get(0).getNota().getValorNota());
		assertEquals(10, listaSaque.get(1).getNota().getValorNota());
	}
	
	@Test
	public void testaSaque20() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(20);
		
		int quantidadeDeNotasDiferentesUsadas = 1;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(20, listaSaque.get(0).getNota().getValorNota());
	
	}
	
	@Test
	public void testaSaque17() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(17);
		
		int quantidadeDeNotasDiferentesUsadas = 3;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertNotNull(listaSaque.get(1));
		assertNotNull(listaSaque.get(2));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(1, listaSaque.get(1).getQuantidadeNotas());
		assertEquals(1, listaSaque.get(2).getQuantidadeNotas());
		assertEquals(10, listaSaque.get(0).getNota().getValorNota());
		assertEquals(5, listaSaque.get(1).getNota().getValorNota());
		assertEquals(2, listaSaque.get(2).getNota().getValorNota());
	}
	
	@Test
	public void testaSaque5() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(5);
		
		int quantidadeDeNotasDiferentesUsadas = 1;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(5, listaSaque.get(0).getNota().getValorNota());
		
	}
	@Test
	public void testaSaque2() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		List<Saque> listaSaque= new ArrayList<Saque>();
		
		listaSaque = caixaEletronico.sacar(2);
		
		int quantidadeDeNotasDiferentesUsadas = 1;
		
		assertEquals(quantidadeDeNotasDiferentesUsadas, listaSaque.size());
		assertNotNull(listaSaque.get(0));
		assertEquals(1, listaSaque.get(0).getQuantidadeNotas());
		assertEquals(2, listaSaque.get(0).getNota().getValorNota());
		
	}
	
}
