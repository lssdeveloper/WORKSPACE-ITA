package com.leandroserra.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.leandroserra.tarefa.Armazenamento;
import com.leandroserra.tarefa.GerenciadorDeUsuario;
import com.leandroserra.tarefa.Placar;
import com.leandroserra.tarefa.Ponto;
import com.leandroserra.tarefa.Usuario;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteArmazenamentoDePlacarPontuacao {

	private Placar placar;
	private final String ARQUIVO = "TesteArmazenamento";
	private GerenciadorDeUsuario gerenciadorDeUsuario;

	@Before
	public void setup() {
		gerenciadorDeUsuario = new GerenciadorDeUsuario(ARQUIVO);
		Armazenamento armazenamento = new Armazenamento(gerenciadorDeUsuario);
		placar = new Placar(armazenamento);
	}
	@Test
	public void usuarioComPontuacaoVazia() {
		placar.armazenarPontos("Serra", "Estrela", 0);

		assertTrue(placar.listarPontuacao("Serra").isEmpty());
	}	
	@Test
	public void pontuacaoDoUsuario() {

		placar.armazenarPontos("Serra", "Estrela", 15);
		placar.armazenarPontos("Serra", "Prata", 20);

		Set<Ponto> lstPontuacao = placar.listarPontuacao("Serra");

		assertEquals(2, lstPontuacao.size());
		assertTrue(lstPontuacao.stream()
				.anyMatch(ponto -> ponto.getTipoDePontos().equals("Prata") && ponto.getQtdDePontos() == 20));
		assertTrue(lstPontuacao.stream()
				.anyMatch(ponto -> ponto.getTipoDePontos().equals("Estrela") && ponto.getQtdDePontos() == 15));
	}
	@Test
	public void usuarioComPontuacaoNaoArmazenada() {
		placar.armazenarPontos("Serra", "Estrela", 15);

		assertTrue(placar.listarPontuacao("Prata").isEmpty());
	}
	@Test
	public void rankingDeUsuarioPorTipo() {
		placar.armazenarPontos("Serra", "Estrela", 15);
		placar.armazenarPontos("Amanda", "Estrela", 5);
		placar.armazenarPontos("Francis", "Estrela", 20);

		List<Usuario> resultado = placar.rankingPorTipo("Estrela");

		assertEquals(3, resultado.size());
		assertEquals("Francis", resultado.get(0).getUsuario());
		assertEquals("Serra", resultado.get(1).getUsuario());
		assertEquals("Amanda", resultado.get(2).getUsuario());
	}

	@Test
	public void rankingDeUsuarioComTipoSemPontuacao() {
		placar.armazenarPontos("Serra", "Estrela", 15);
		placar.armazenarPontos("Amanda", "Estrela", 0);

		List<Usuario> resultado = placar.rankingPorTipo("Estrela");

		assertEquals(1, resultado.size());
		assertEquals("Serra", resultado.get(0).getUsuario());
	}
	@After
	public void esvaziarArquivo() throws IOException {
		gerenciadorDeUsuario.esvaziarGerenciador();
	}	
}
