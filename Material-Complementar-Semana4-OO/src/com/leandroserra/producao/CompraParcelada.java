package com.leandroserra.producao;

public class CompraParcelada extends Compra {
	
	private int parcelas;
	private double jurosMensal;

	public CompraParcelada(Double vlrCompra, Integer parcelas, Double jurosMensal) {
		super(vlrCompra);
		this.jurosMensal = jurosMensal;
		this.parcelas = parcelas;

	}

	public Double vlrTotal(){
		double x = 1 + (this.jurosMensal/100);
		return super.total() * Math.pow(x, parcelas);
		
	}

}
