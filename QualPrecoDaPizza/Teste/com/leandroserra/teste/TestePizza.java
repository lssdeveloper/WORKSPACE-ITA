package com.leandroserra.teste;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import com.leandroserra.tarefa.Pizza;

public class TestePizza {
	
	private int qtdDoMesmoIngrediente = 0;
		
	@Test
	public void getPreco15(){
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("calabresa");		
		assertEquals(15.00, pizza.getPreco(), 00.000);		
	}
	@Test
	public void getPreco20(){
		
		Pizza pizza = new Pizza();
		
		pizza.adicionaIngrediente("frango");			
		pizza.adicionaIngrediente("mussarela");		
		assertEquals(15.00, pizza.getPreco(), 00.000);		
	}	
	@Test
	public void getPreco23(){
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("calabresa");			
		pizza.adicionaIngrediente("presunto");			
		pizza.adicionaIngrediente("peperone");
		pizza.adicionaIngrediente("atum");
		pizza.adicionaIngrediente("frango");			
		pizza.adicionaIngrediente("mussarela");		

		assertEquals(23.00, pizza.getPreco(),00.000);	
	}
	@Test
	public void qtdDeIngredientes(){
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("calabresa");			
		pizza.adicionaIngrediente("presunto");			
		pizza.adicionaIngrediente("peperone");
		pizza.adicionaIngrediente("atum");
		pizza.adicionaIngrediente("frango");			
		pizza.adicionaIngrediente("mussarela");	
		
		assertEquals(6, pizza.getQtdIngredientes2());
	}
	@Test
	public void qtdDoMesmoIngrediente(){
		Pizza pizza = new Pizza();
		String especialidade = "calabresa";
		pizza.adicionaIngrediente(especialidade);			
		pizza.adicionaIngrediente(especialidade);
		pizza.adicionaIngrediente(especialidade);		

		System.out.println("Quantidade utilizada de cada ingrediente:");
		for (Map.Entry<String, Integer> ingrediente : Pizza.getLstIngredientes().entrySet()) {
			qtdDoMesmoIngrediente = ingrediente.getValue();
			System.out.println(ingrediente.getKey() + " : " + ingrediente.getValue());
			assertEquals(3, qtdDoMesmoIngrediente);
		}
		
		Pizza.zerarRegistrosDeIngredientes();
		System.out.println("Ingredientes = " + Pizza.getQtdIngredientes());		
		
	}
	@Test
	public void testeZerarRegistrosDeIngredientes(){
		
		Pizza.zerarRegistrosDeIngredientes();
		assertEquals(0, Pizza.getQtdIngredientes());
	}
	
}
