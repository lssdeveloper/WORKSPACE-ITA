package com.leandroserra.semana5.pilha;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		p.empilhar("Eduardo");
		p.empilhar("Maria");
		p.empilhar("José");
		
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
//		Object[] arrayElementos = p.getElementos();
//		
//		Object[] a2 = arrayElementos.clone();
//		
//		a2[2] = "OUTRO";
		
		Object[] arrayElementos = p.getElementos();
		arrayElementos[2] = "OUTRO";
		
		//Desempilhando
		System.out.println("---------------");
		System.out.println(p.desempilhar());
		System.out.println(p.topo().toString().toUpperCase());
		System.out.println(p.tamanho());
	}

}
