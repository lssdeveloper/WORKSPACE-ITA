package com.leandroserra.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leandroserra.tarefa.CarrinhoDeCompŕas;
import com.leandroserra.tarefa.Pizza;

public class TesteCarrinhoDeCompra {
	// Selecione os Ingredientes
	final String CARNE_SECA = "Carne Seca";
	final String CEBOLA = "Cebola";
	final String FRANGO = "Frango";
	final String CARNE_MOIDA = "Carne Moída";
	final String BACON = "Bacon";
	final String CATUPIRY = "Catupiry";
	final String PROVOLONE = "Provolone";
	final String MUSSARELA = "Mussarela";
	final String PARMESAO = "Parmesão";
	final String GORGONZOLA = "Gorgonzola";
	
	Pizza cincoQueijos = new Pizza();
	
	Pizza entulho = new Pizza();
	
	Pizza carneSeca = new Pizza();
	
	CarrinhoDeCompŕas cc = new CarrinhoDeCompŕas();		
	
	@Before
	public void iniciar(){	
		
		carneSeca.adicionaIngrediente(MUSSARELA);
		carneSeca.adicionaIngrediente(CARNE_SECA);
		carneSeca.setEspecialidade(CARNE_SECA);
		carneSeca.getPreco();
		
		cincoQueijos.adicionaIngrediente(MUSSARELA);
		cincoQueijos.adicionaIngrediente(CATUPIRY);
		cincoQueijos.adicionaIngrediente(PROVOLONE);
		cincoQueijos.adicionaIngrediente(PARMESAO);
		cincoQueijos.adicionaIngrediente(GORGONZOLA);
		cincoQueijos.setEspecialidade("Cinco Queijos");
		cincoQueijos.getPreco();		

		entulho.adicionaIngrediente(CARNE_SECA);
		entulho.adicionaIngrediente(CEBOLA);
		entulho.adicionaIngrediente(FRANGO);
		entulho.adicionaIngrediente(CARNE_MOIDA);
		entulho.adicionaIngrediente(BACON);
		entulho.adicionaIngrediente(CATUPIRY);
		entulho.adicionaIngrediente(PROVOLONE);
		entulho.adicionaIngrediente(MUSSARELA);
		entulho.adicionaIngrediente(PARMESAO);
		entulho.adicionaIngrediente(GORGONZOLA);
		entulho.setEspecialidade("Entulho");
		entulho.getPreco();		
	}	

	@Test
	public void testeAdicionarPedidoPizza(){
		cc.adicionarPedidoPizza(carneSeca);
		assertEquals("Carne Seca", carneSeca.getEspecialidade());
		cc.adicionarPedidoPizza(cincoQueijos);
		assertEquals("Cinco Queijos", cincoQueijos.getEspecialidade());	
		cc.adicionarPedidoPizza(entulho);
		assertEquals("Entulho", entulho.getEspecialidade());	
	}
	@Test
	public void testeVlrTotalDePizzas(){
		testeAdicionarPedidoPizza();
		assertEquals(58.0, cc.getVlrTotalDePizzas(),0.000);
	}
}
