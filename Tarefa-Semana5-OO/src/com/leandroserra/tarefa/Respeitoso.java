package com.leandroserra.tarefa;

public class Respeitoso implements FormatadorNome {
	
	private String genero; 
	
	public Respeitoso(String genero) {
		this.genero = genero;
	}

	@Override
	public String formatarNome(String nome, String sobreNome) {
		if (genero == "masculino") sobreNome = "Sr. "+ sobreNome ; 
		if (genero == "feminino")  sobreNome = "Sra. "+ sobreNome;
		return sobreNome ;
	}

}
