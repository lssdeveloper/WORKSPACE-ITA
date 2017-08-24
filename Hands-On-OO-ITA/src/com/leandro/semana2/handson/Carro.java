package com.leandro.semana2.handson;

public class Carro {
	private int potencia;
	private int velocidade;
	private String nome;
	
	public void acelerar(){
		velocidade += potencia;
	}
	public void frear(){
		velocidade = velocidade / 2;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void imprimir(){
		System.out.println("O carro " + nome + 
				" está a velocidade de " + getVelocidade() + " km/h" );
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
