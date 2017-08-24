package com.leandroserra.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Cliente {
	
	private String nome;
	private long idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente(String nome) {
		this.nome = nome;		
	
	}

	public long getIdade() {
		return idade;
	}

	public void setIdade(long idade) {
		this.idade = idade;
	}
	

}
