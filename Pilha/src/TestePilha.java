import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestePilha {
	
	private Pilha p;
	
	@Ignore
	@Test(expected = ArithmeticException.class)
	public void dividePorZero() {
	//	int n = 2 / 0;
		fail("Divisão por zero!");
	}
	//Testa se dois arrays são iguais
	@Ignore
	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "trial".getBytes();
		byte[] actual = "trial".getBytes();
		Assert.assertArrayEquals("failure - byte arrays not same", expected, actual);
	}
	
	@Before
	public void inicializaPilha(){
		p = new Pilha(10);
	}
	
	@Test
	public void pilhaVazia() {
		assertTrue(p.estaVazia());
		assertEquals(0, p.tamanho());
	}

	@Test
	public void empilhaUmElemento() {
		p.empilha("Primeiro");
		assertFalse(p.estaVazia());
		assertEquals(1, p.tamanho());
		assertEquals("Primeiro", p.topo());
	}

	@Test
	public void empilhaEDesempilha() {
		p.empilha("primeiro");
		p.empilha("segundo");
		assertEquals(2, p.tamanho());
		assertEquals("segundo", p.topo());
		Object desempilhado = p.desempilha();
		assertEquals(1, p.tamanho());
		assertEquals("primeiro", p.topo());
		assertEquals("segundo", desempilhado);
	}
	@Test(expected=PilhaVaziaException.class)
	public void removeDaPilhaVazia(){
		p.desempilha();
	}
	@Test
	public void adicionaNaPilhaCheia(){
		for (int i = 0; i < 10; i++) {
			p.empilha("elemento" + i);
		}
		try {
			p.empilha("boom");
			fail();
		} catch (PilhaCheiaExcpetion e) {}
	}

}
