package com.leandroserra.banco.heranca;

public class ContaCorrente {
	int saldo;
	public int getSaldo() {
		return saldo;
	}
	public int sacar(int valor){
		//não pode deixar negativa
		if (valor>saldo) {
			return 0;
		}else{
			this.saldo -= valor;
			return valor;
		}
	}
	public void depositar(int valor){
		this.saldo += valor;
	}

}
