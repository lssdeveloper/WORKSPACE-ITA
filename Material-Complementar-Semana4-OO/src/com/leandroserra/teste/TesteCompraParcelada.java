package com.leandroserra.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.leandroserra.producao.Compra;
import com.leandroserra.producao.CompraParcelada;

public class TesteCompraParcelada {
	
	private CompraParcelada cp;
	double vlrCompra = 1000d;
	double jurosMensal = 10d;
	@Test
	public void umaParcela(){
		cp = new CompraParcelada(vlrCompra, 1, jurosMensal);
		Assert.assertEquals(1100d, cp.vlrTotal(), 0.01);
	}
	@Test
	public void duasParcelas(){
		cp = new CompraParcelada(vlrCompra, 2, jurosMensal);
		Assert.assertEquals(1210d, cp.vlrTotal(), 0.01);
	}	
	@Test
	public void cincoParcelas(){
		cp = new CompraParcelada(vlrCompra, 5, jurosMensal);
		Assert.assertEquals(1610.51d, cp.vlrTotal(), 0.01);
	}
	@Test
	public void dezParcelas(){
		cp = new CompraParcelada(vlrCompra, 10, jurosMensal);
		Assert.assertEquals(2593.74d, cp.vlrTotal(), 0.01);
	}
}
