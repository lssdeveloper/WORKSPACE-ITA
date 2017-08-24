package com.leandroserra.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.leandroserra.banco.heranca.ContaCorrente;
import com.leandroserra.banco.heranca.ContaEspecial;
import com.leandroserra.modificador.Modificadores;

public class TesteContaCorrente {
	
	ContaCorrente cc;
	Modificadores m;
	
	@Before
	public void init(){
		cc = new ContaCorrente();
		cc.depositar(200);	
	}
	
	@Test
	public void deposito(){
		assertEquals(200, cc.getSaldo());
	}
	@Test
	public void saque(){
		cc.sacar(50);
		assertEquals(150, cc.getSaldo());
	}
	//@Ignore
	@Test
	public void saqueMaiorQueSaldo(){
		int vlrSacado = cc.sacar(250);
		assertEquals(200, cc.getSaldo());
		assertEquals(0, vlrSacado);
	}
}
