package com.leandroserra;

public class ModalMain {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		Caminhao d = new Caminhao();
		Barco b = new Barco();
		Aviao a = new Aviao();
		
		c.fazerBarulho();
		c.rodar();
		
		d.rodar();
		
		b.navegar();
		
		a.voar();
		

	}

}
