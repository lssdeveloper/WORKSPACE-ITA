package com.leandroserra.tarefa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrinhoDeCompras {

	private static Map<Produto, Integer> lstProdutos = new HashMap<>();
	private List<Produto> lstPedido = new ArrayList<>();
	// private static int total = 0;

	public void adicionaProduto(Produto p, int qtd) {
		int i = 0;
		int total = 0;

		if (lstProdutos.equals(p)) {
			total += lstProdutos.get(p);
			lstProdutos.replace(p, total);
		} else {
			lstProdutos.put(p, qtd);
		}
		while (i < qtd) {
			lstPedido.add(p);
			++i;
		}
	}
	public void removeProduto(Produto p, int qtd) {
		int i = 0;
		int total = 0;
		if (lstProdutos.equals(p)) {			
			total -= lstProdutos.get(p);
			lstProdutos.replace(p, total);
		}else{
			lstProdutos.remove(p, qtd);
		}
		while (i < qtd) {
			lstPedido.remove(p);
			++i;
		}
	}	

	public float calculaOValorTotalDaCompra(){
		float vlrTotal = 0;
		for (int i = 0; i < lstPedido.size(); i++) {
			vlrTotal += lstPedido.get(i).getPreco();
		}
		return vlrTotal;
	}

}

// private HashMap<Produto, Integer> produtos = new HashMap<Produto, Integer>();
// private static int quantidade;
// private static float totalDeCompras;
//
// public int adicionaProduto(Produto produto, int quantidade){
//
// if (produtos.containsKey(produto)) {
// produtos.put(produto, quantidade+=quantidade);
// }else{
// produtos.put(produto, quantidade);
// }
// this.quantidade += quantidade;
// return this.quantidade;
//public void removeProduto(Produto produto, int quantidade)
// }
// {
// //obs: produtos com tamanhos diferentes devem ser considerados como produtos
// diferentes no carrinho
// if (produtos.containsKey(produto)) {
// produtos.remove(produto);
// this.quantidade -= quantidade;
// }
//
// }
// public float calculaOValorTotalDaCompra(){
// for (Produto p : produtos.keySet()) {
// this.totalDeCompras = p.getPreco()* this.quantidade;
// }
// return totalDeCompras;
// }