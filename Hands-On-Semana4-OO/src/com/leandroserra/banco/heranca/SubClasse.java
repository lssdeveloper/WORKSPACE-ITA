package com.leandroserra.banco.heranca;

public class SubClasse extends SuperClasse {

	//@Override
	public int soma(int num1, int num2) {
		
		return num1 + num2 + 2;
	}

	//@Override
	public int subtrai(int num1, int num2) {
		
		return num1 - num2 - 2;
	}

	//@Override
	public int multiplica(int num1, int num2) {
		
		return num1 * num2 - 2;
	}

}
