package com.leandroserra.tarefa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class Principal {

	// Selecione os Ingredientes
	private static final String CARNE_SECA = "Carne Seca";
	private static final String CEBOLA = "Cebola";
	private static final String FRANGO = "Frango";
	private static final String CARNE_MOIDA = "Carne Moída";
	private static final String BACON = "Bacon";
	private static final String CATUPIRY = "Catupiry";
	private static final String PROVOLONE = "Provolone";
	private static final String MUSSARELA = "Mussarela";
	private static final String PARMESAO = "Parmesão";
	private static final String GORGONZOLA = "Gorgonzola";

	public static void main(String[] args) {

		// criando 3 pizzas diversas
		Pizza carneSeca = new Pizza();
		carneSeca.adicionaIngrediente(MUSSARELA);
		carneSeca.adicionaIngrediente(CARNE_SECA);
		carneSeca.setEspecialidade(CARNE_SECA);
		carneSeca.getPreco();

		Pizza cincoQueijos = new Pizza();
		cincoQueijos.adicionaIngrediente(MUSSARELA);
		cincoQueijos.adicionaIngrediente(CATUPIRY);
		cincoQueijos.adicionaIngrediente(PROVOLONE);
		cincoQueijos.adicionaIngrediente(PARMESAO);
		cincoQueijos.adicionaIngrediente(GORGONZOLA);
		cincoQueijos.setEspecialidade("Cinco Queijos");
		cincoQueijos.getPreco();

		Pizza entulho = new Pizza();
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

		System.out.println(carneSeca.getEspecialidade() + "=> Preço: " + carneSeca.getPreco() + " ............ " + "\n"
				+ cincoQueijos.getEspecialidade() + "=> Preço: " + cincoQueijos.getPreco() + " ............ " + "\n"
				+ entulho.getEspecialidade() + "=> Preço: " + entulho.getPreco() + " ............ " + "\n"
				+ "Quantidade de Ingredientes selecionados: " + Pizza.getQtdIngredientes());

		Scanner sc = new Scanner(System.in);
		System.out.println("Adicionar no carrinho de compras?\n" 
								+ "(1) - Sim?\n" 
								+ "(2) - Não?");

		int opcao = sc.nextInt();
		sc.close();
		if (opcao == 1) {
			CarrinhoDeCompŕas cc = new CarrinhoDeCompŕas();
			cc.adicionarPedidoPizza(carneSeca);
			cc.adicionarPedidoPizza(entulho);
			cc.adicionarPedidoPizza(cincoQueijos);

			System.out.println(
					"/***************************************************************************************/\n"
							+ "/*********************CUPOM FISCAL**************************************************/\n"
							+ carneSeca.getEspecialidade() + "=> Preço: " + carneSeca.getPreco()+ " ............ " + "\n" 
							+ cincoQueijos.getEspecialidade() + "=> Preço: "+ cincoQueijos.getPreco() + " ............ " + "\n" 
							+ entulho.getEspecialidade() + "=> Preço: " + entulho.getPreco() + " ............ " + "\n"
							+ "Total de Ingredientes selecionados: " + Pizza.getQtdIngredientes()
							+ "\nTotal a pagar: " + cc.getVlrTotalDePizzas()
							+ "\n/***************************************************************************************/\n");
			
			System.out.println("Quantidade utilizada de cada ingrediente:");
			for (Map.Entry<String, Integer> ingrediente : Pizza.getLstIngredientes().entrySet()) {
				System.out.println(ingrediente.getKey() + " : " + ingrediente.getValue());
			}
		} else{
			System.out.println("Obrigado, pedido cancelado!");
		}

	}

}
