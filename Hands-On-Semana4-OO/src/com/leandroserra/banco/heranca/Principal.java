package com.leandroserra.banco.heranca;

public class Principal {

	public static void main(String[] args) {
		
		SuperClasse sc = new SuperClasse();
		System.out.println(sc.soma(1, 2));		
		System.out.println(sc.subtrai(5, 1));
		System.out.println(sc.multiplica(2, 3));
		System.out.println("------------------");
		SubClasse sbc = new SubClasse();
		System.out.println(sbc.soma(1, 2));		
		System.out.println(sbc.subtrai(5, 1));
		System.out.println(sbc.multiplica(2, 3));
		
	}

}
