package com.leandroserra.excecoes;

public class Principal {

	public static void main(String[] args){
		a(100);
		System.out.println("Terminando a execução de Main()");
	}

	public static void a(int i){
		System.out.println("Executando a() com  " + i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("tratando a exceção: "+e.getMessage());
		}
		System.out.println("Terminando a execução de a()");
	}

	public static void b(int i) throws Exception {
		System.out.println("Executando b() com  " + i);
		if (i>0)		
			throw new Exception("mensagem");
		System.out.println("Terminando a execução de b()");
	}
}
