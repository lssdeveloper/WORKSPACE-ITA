package com.lendroserra.teste;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.leandroserra.tarefa.Produto;
import com.leandroserra.tarefa.ProdutoComTamanho;


public class TesteProduto {
	
	private Produto p1, p2, p3, p4;
	
	@Before
	public void init(){
		p1 = new Produto(1,"camiseta", (float) 15.50);
		p2 = new Produto(1,"camiseta", (float) 15.50);
		p3 = new Produto(2,"camiseta", (float) 15.50);
		p4 = new Produto(2,"camiseta", (float) 15.50);
	}
	@Test
	public void testeEquals(){
		assertEquals(p1.equals(p2), p2.equals(p1));
		assertEquals(p1.equals(p3), p3.equals(p1));
		assertEquals(p1.equals(p4), p4.equals(p1));
	}
	@Test
	public void testeHashCode(){
 		assertEquals(p1.hashCode(), p2.hashCode());
 		assertEquals(p3.hashCode(), p4.hashCode()); 		
	}
}
