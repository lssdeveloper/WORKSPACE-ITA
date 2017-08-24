package com.leandroserra;

public class Carro implements Barulhento, Rodoviario {

	@Override
	public String fazerBarulho() {
		
		return "vrom vrom bi bi bi bi";
	}

	@Override
	public void rodar() {
		System.out.println("Carro rodando!");
		
	}








}
