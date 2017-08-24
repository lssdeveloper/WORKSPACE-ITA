package com.leandroserra.producao;

public class Compra {
	
	protected Double vlrCompra;
	
	public Compra(Double vlrCompra){
		this.vlrCompra = vlrCompra;
	}
	
	public Double total(){
		return this.vlrCompra;
	}
}
