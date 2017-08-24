package com.leandroserra.banco.heranca;

public abstract class CarroCorrida {

	public abstract void acelerar();

	protected int velocidade;
	protected String nome;
	protected int velocidadeMaxima;
	
	public CarroCorrida(String nome, int velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}

	public void frear() {
		velocidade = velocidade / 2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}

}
