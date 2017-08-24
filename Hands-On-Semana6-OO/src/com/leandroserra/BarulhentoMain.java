package com.leandroserra;

public class BarulhentoMain {

	public static void main(String[] args) {
		
		Barulhento[] lstBarulhentos = new Barulhento[10];
		
		lstBarulhentos[0] = new Cachorro();
		lstBarulhentos[1] = new Carro();
		lstBarulhentos[2] = new BateriaDeEscolaDeSamba();
		lstBarulhentos[3] = new Cachorro();
		lstBarulhentos[4] = new Carro();
		lstBarulhentos[5] = new BateriaDeEscolaDeSamba();
		lstBarulhentos[6] = new Cachorro();
		lstBarulhentos[7] = new Carro();
		lstBarulhentos[8] = new BateriaDeEscolaDeSamba();
		lstBarulhentos[9] = new Cachorro();
		
		sonoplastia(lstBarulhentos);
		

	}
	public static void sonoplastia(Barulhento[] barulhentos){
		
		for (Barulhento b : barulhentos) {
			System.out.println(b.fazerBarulho());
		}
	}

}
