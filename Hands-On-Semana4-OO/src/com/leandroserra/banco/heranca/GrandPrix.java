package com.leandroserra.banco.heranca;

public class GrandPrix {

	public static void main(String[] args) {
		
		Corrida corridaDaAmizade = new Corrida(2000);		
	
		corridaDaAmizade.adicionaCarro(new CarroSoma("Carro A", 10, 110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("Carro B", 8, 140));
		corridaDaAmizade.adicionaCarro(new CarroMulti("Carro C", 1.7, 110));
		corridaDaAmizade.adicionaCarro(new CarroMulti("Carro D", 1.4, 110));			
		
		corridaDaAmizade.start();
		corridaDaAmizade.terminou();
		
	}

}
