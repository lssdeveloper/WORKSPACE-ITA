package com.lendroserra.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.leandroserra.tarefa.CarrinhoDeCompras;
import com.leandroserra.tarefa.Produto;
import com.leandroserra.tarefa.ProdutoComTamanho;

public class TesteCarrinhoDeCompras {
	
	Produto p1, p2, p3, p4, p5, p6;
	CarrinhoDeCompras cp;
	
	@Before
	public void init(){
		p1 = new ProdutoComTamanho(1, "camiseta regata", (float) 10.00, 1);
		p2 = new ProdutoComTamanho(1, "calça jeans", (float) 15.00, 1);
		p3 = new ProdutoComTamanho(1, "calça sarja", (float) 25.00, 1);
		p4 = new ProdutoComTamanho(1, "blazer", (float) 35.00, 1);
		p5 = new ProdutoComTamanho(1, "sapato de couro", (float) 45.00, 1);	
		p6 = new ProdutoComTamanho(1, "sapato de couro", (float) 45.00, 2);				
		cp = new CarrinhoDeCompras();
	}
	@Test
	public void adicionaUmProduto(){
		cp.adicionaProduto(p1, 3);
		assertEquals(30, cp.calculaOValorTotalDaCompra(), 0.0);
	}
	@Test
	public void adicionaDoisProdutos(){
		cp.adicionaProduto(p1, 3);
		cp.adicionaProduto(p1, 3);		
		assertEquals(60, cp.calculaOValorTotalDaCompra(), 0.0);
	}
	@Test
	public void adiciona6Produtos(){
		cp.adicionaProduto(p1, 1);
		cp.adicionaProduto(p2, 2);	
		cp.adicionaProduto(p3, 1);	
		cp.adicionaProduto(p4, 1);	
		cp.adicionaProduto(p5, 2);	
		cp.adicionaProduto(p6, 2);			
		assertEquals(280, cp.calculaOValorTotalDaCompra(), 0.0);
	}	
	@Test
	public void removeProduto(){
		cp.adicionaProduto(p1, 1);		
		cp.adicionaProduto(p5, 2);	
		cp.adicionaProduto(p6, 2);
		cp.removeProduto(p6, 2);
		assertEquals(100, cp.calculaOValorTotalDaCompra(), 0.0);		
	}
	@Test
	public void totalDasCompras(){
		cp.adicionaProduto(p1, 1);
		cp.adicionaProduto(p2, 2);	
		cp.adicionaProduto(p3, 1);	
		cp.adicionaProduto(p4, 1);	
		cp.adicionaProduto(p5, 2);	
		cp.adicionaProduto(p6, 2);			
		assertEquals(280, cp.calculaOValorTotalDaCompra(), 0.0);
		cp.removeProduto(p6, 2);
		assertEquals(190, cp.calculaOValorTotalDaCompra(), 0.0);			
	}	
}
