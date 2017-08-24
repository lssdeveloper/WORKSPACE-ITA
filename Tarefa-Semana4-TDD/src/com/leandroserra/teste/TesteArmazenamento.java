package com.leandroserra.teste;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.leandroserra.tarefa.Armazenamento;
import com.leandroserra.tarefa.GerenciadorDeUsuario;
import com.leandroserra.tarefa.Ponto;
import com.leandroserra.tarefa.Usuario;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteArmazenamento {

    private GerenciadorDeUsuario gerenciadorDeUsuario;
    private Armazenamento armazenamento;

    private final String ARQUIVO = "TesteArmazenamento";  
  
    
    @Before
    public void setup() {
        gerenciadorDeUsuario = new GerenciadorDeUsuario(ARQUIVO);
        armazenamento = new Armazenamento(gerenciadorDeUsuario);
    }

    @Test
    public void tiposDePontuacaoPorUsuario() {
        armazenamento.armazenarPontosDoUsuario("Serra", "Estrela", 15);
        armazenamento.armazenarPontosDoUsuario("Serra", "Prata", 5);
        armazenamento.armazenarPontosDoUsuario("Francis", "Estrela", 20);    

        int pontuacao = armazenamento.quantidadeDePontosPorTipoDoUsuario("Serra", "Estrela");

        assertEquals(15, pontuacao);
    }

    @Test
    public void listaUsuariosPontuados() {
        armazenamento.armazenarPontosDoUsuario("Serra", "Estrela", 15);
        armazenamento.armazenarPontosDoUsuario("Serra", "Prata", 5);
        armazenamento.armazenarPontosDoUsuario("Francis", "Prata", 5);
        armazenamento.armazenarPontosDoUsuario("Amanda", "Prata", 0);
        armazenamento.armazenarPontosDoUsuario("Julia", "Estrela", 15);        

        Set<Usuario> lista = armazenamento.listaUsuariosPontuados();

        assertEquals(3, lista.size());
        assertTrue(lista.stream().anyMatch(usuario -> usuario.getUsuario().equals("Serra")));
        assertTrue(lista.stream().anyMatch(usuario -> usuario.getUsuario().equals("Francis")));
    }

    @Test
    public void listarTodosOsTiposDePontuacaoDeUmusuario() {
        armazenamento.armazenarPontosDoUsuario("Serra", "Estrela", 15);
        armazenamento.armazenarPontosDoUsuario("Serra", "Prata", 5);
        armazenamento.armazenarPontosDoUsuario("Serra", "Moeda", 1);        

        Set<Ponto> resultado = armazenamento.tiposDepontosDeUmUsuario("Serra");

        assertEquals(3, resultado.size());
        assertTrue(resultado.stream().anyMatch(ponto -> ponto.getTipoDePontos().equals("Estrela")));
        assertTrue(resultado.stream().anyMatch(ponto-> ponto.getTipoDePontos().equals("Prata")));
        assertTrue(resultado.stream().anyMatch(ponto-> ponto.getTipoDePontos().equals("Moeda")));        
    }
    @After
    public void EsvaziarArquivo() throws IOException {
        gerenciadorDeUsuario.esvaziarGerenciador();
    }
}
