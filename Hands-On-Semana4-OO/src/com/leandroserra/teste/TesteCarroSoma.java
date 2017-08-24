package com.leandroserra.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leandroserra.banco.heranca.CarroCorrida;
import com.leandroserra.banco.heranca.CarroSoma;

public class TesteCarroSoma {
	
	CarroCorrida c;
	
	@Before
	public void init(){
		c = new CarroSoma("teste", 10, 100);
	}
	
	@Test
	public void testCarroParado() {
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testAcelerar() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	public void testAcelerarAteVelocidadeMaxima() {
		for (int i = 0; i < 15; i++) {
			c.acelerar();			
		}
		assertEquals(100, c.getVelocidade());
	}
	
	@Test
	public void testFrear() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	@Test
	public void testFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();	
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
}
