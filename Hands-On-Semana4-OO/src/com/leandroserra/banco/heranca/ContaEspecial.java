package com.leandroserra.banco.heranca;

public class ContaEspecial extends ContaCorrente {

		int limite;
		public ContaEspecial(int limite) {
			this.limite = limite;
		}
		//@Override
		public int sacar(int valor){
			//não pode deixar negativa
			if (valor>(saldo + limite)) {
				return 0;
			}else{
				this.saldo -= valor;
				return valor;
			}
		}
}
