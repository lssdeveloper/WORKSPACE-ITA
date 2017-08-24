package com.leandroserra.tarefa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompŕas {
	
	private List<Pizza> lstPizzasPedidas = new ArrayList<Pizza>();
	private double vlrTotalDePizzas = 0;
	
	public double getVlrTotalDePizzas() {
		return vlrTotalDePizzas;
	}
	
	public void adicionarPedidoPizza(Pizza pizza){
		if (pizza.getQtdIngredientes()>0) {
			lstPizzasPedidas.add(pizza);
			vlrTotalDePizzas += pizza.getPreco();
			System.out.println("Pedido registrado para pizza :\n"
					+ pizza.getEspecialidade() + "\n ");
		}else{
			System.out.println(pizza.getEspecialidade()+ " => É preciso selecionar um ingrediente para realizar o pedido!");
		}
	}

}
