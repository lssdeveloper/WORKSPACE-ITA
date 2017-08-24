package com.leandroserra.tarefa;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Usuario implements Serializable {
	private static final long serialVersionUID = -1L;

	private String usuario;
	private Map<String, Ponto> lstPontos;

	public Usuario(String usuario) {
		this.usuario = usuario;
		this.lstPontos = new HashMap<>();
	}

	public void incluirPontos(String tipoDePontoDeponto, int qtdDePontos) {
		getOrDefaultPontuacao(tipoDePontoDeponto).addPontos(qtdDePontos);
	}

	public int qtdDePontosPorTipo(String tipoDePontoDePonto) {
		return getOrDefaultPontuacao(tipoDePontoDePonto).getQtdDePontos();
	}

	public boolean comPontuacao() {
		return totalDePontos() > 0;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public Set<Ponto> getPontuacao() {
		return new HashSet<>(lstPontos.values());
	}

	private int totalDePontos() {
		return lstPontos.values().stream().mapToInt(ponto -> ponto.getQtdDePontos()).sum();
	}

	private Ponto getOrDefaultPontuacao(String tipoDePonto) {
		Ponto ponto = lstPontos.getOrDefault(tipoDePonto, new Ponto(tipoDePonto));
		lstPontos.put(tipoDePonto, ponto);

		return ponto;
	}
}
