package com.leandroserra.tarefa;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Placar {
	private ArmazemDePontos armazemDepontos;

	public Placar(ArmazemDePontos armazemDePontos) {
		this.armazemDepontos = armazemDePontos;
	}

	public void armazenarPontos(String usu, String tpDePonto, int qtdPontos) {
		this.armazemDepontos.armazenarPontosDoUsuario(usu, tpDePonto, qtdPontos);
	}

	public Set<Ponto> listarPontuacao(String usu) {
		return armazemDepontos.tiposDepontosDeUmUsuario(usu).stream().filter(ponto -> ponto.getQtdDePontos() > 0)
				.collect(Collectors.toSet());
	}

	public List<Usuario> rankingPorTipo(String tipoPonto) {
		return armazemDepontos.listaUsuariosPontuados().stream()
				.filter(usuario -> usuario.qtdDePontosPorTipo(tipoPonto) > 0)
				.sorted(comparadorPorMaiorPontuacao(tipoPonto)).collect(Collectors.toList());
	}

	private Comparator<Usuario> comparadorPorMaiorPontuacao(String tipoPonto) {
		return (usuario1, usuario2) -> Integer.compare(usuario2.qtdDePontosPorTipo(tipoPonto),
				usuario1.qtdDePontosPorTipo(tipoPonto));
	}

}
