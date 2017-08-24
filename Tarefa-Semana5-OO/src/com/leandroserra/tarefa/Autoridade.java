package com.leandroserra.tarefa;

public class Autoridade {

	private String nome;
	private String sobreNome;
	private FormatadorNome nomeFormatado;

	public Autoridade(String nome, String sobreNome, FormatadorNome fn) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.nomeFormatado = fn;
	}

	public Autoridade(String nome, String sobreNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public String getNome() {
		return nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public String getTratamento() {

		return this.nomeFormatado.formatarNome(nome, sobreNome);
	}

}
