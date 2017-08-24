package com.leandroserra.producao;

public class Teste {

	public static void main(String[] args) {

		//Capital c
		//Taxa i
		//Período de Tempo t
		//Montante m
		//Potenciação p
		int t = 12;
		double c = 6000.00;
		double i = 3.5/100;
		double x = (1 + i);
		double p = Math.pow(x, i);
		double m = c*p;

		System.out.println(m);


	}

}
