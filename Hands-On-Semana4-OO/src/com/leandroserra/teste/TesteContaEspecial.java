package com.leandroserra.teste;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.leandroserra.banco.heranca.ContaEspecial;

public class TesteContaEspecial extends TesteContaCorrente{

	//Teste
	@Before
	public void init(){
		cc = new ContaEspecial(100);
		cc.depositar(200);		
	}
	@Test
	public void saqueMaiorQueSaldo(){
		int vlrSacado = cc.sacar(350);
		assertEquals(200, cc.getSaldo());
		assertEquals(0, vlrSacado);
		
	}	
	@Test
	public void saqueMaiorQueSaldoDentroDoLimite(){
		int vlrSacado = cc.sacar(250);
		assertEquals(-50, cc.getSaldo());
		assertEquals(250, vlrSacado);
	}
}
